package com.example.testjava;

import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ddl2xml {
    public void convert() {
        File file = new File("/G/FU1/SAMOSS/USDDL");
        try{
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            String tmp = null;
            Document doc = DocumentHelper.createDocument();
            Element root = doc.addElement("EnscribeFiles"); //根元素
            Element fileRoot = null; //每個file的根元素


            System.out.println("start!");
            List<String> strList = new ArrayList<>();
            String currSection = "";
            while ((tmp = bf.readLine()) != null){
                tmp = tmp.trim();
                if (StringUtils.containsIgnoreCase(tmp, "?SECTION")){
                    String[] words = tmp.split("\\s+");
                    currSection = words[1].toUpperCase();
                    fileRoot = root.addElement(currSection);
                }else if (tmp.length() >= 2 && StringUtils.isNumeric(tmp.substring(0, 2))) {
                    if (!tmp.contains(".")){
                        String nextStr = "";
                        StringBuilder tmpBuild = new StringBuilder();
                        tmpBuild.append(tmp);
                        do {
                            tmpBuild.append(" ");
                            nextStr = bf.readLine().trim();
                            tmpBuild.append(nextStr);
                        } while (!StringUtils.contains(nextStr, "."));
                        strList.add(String.valueOf(tmpBuild));
                    } else {
                        strList.add(tmp);
                    }
                }

                if (StringUtils.containsIgnoreCase(tmp, "end") &&
                        tmp.substring(0, 3).equalsIgnoreCase("end")){
                    ArrayList<Integer> nodeLevelList = new ArrayList<>();
                    HashMap<Integer, Element> parentNodeMap = new HashMap<>();
                    int preLevel = 0;
                    Element preNode = null;
                    System.out.println("Add element " + currSection + "...");
                    for (int i = 0; i < strList.size(); i++){
                        //level colName                                head
                        //10    AEG-BROKER-ID                PIC X(07) Heading "期貨商代號".
                        String current = strList.get(i);
                        String[] words = current.split("\\s+"); // \\s+表示一個空白+任意長度空白
                        int level = Integer.parseInt(words[0]);
                        String colName = words[1].replace(".", "");
                        String head = colName;
                        if (current.contains("Heading")) {
                            head = current.substring(current.indexOf("Heading ")+8)
                                    .replace(".", "").replace("\"", "");
                            byte[] bytes = new String(head.getBytes(), "BIG5").getBytes(StandardCharsets.UTF_8);
                            head = new String(bytes);
                        }

                        //System.out.println("current :"+current);
                        //System.out.println("level   :"+level);
                        //System.out.println("colName :"+colName);
                        //System.out.println("head    :"+head);

                        Element node = null;
                        if (i == 0) {
                            //第一行欄位，通常是PK
                            node = fileRoot.addElement(colName);
                            nodeLevelList.add(level); //5
                            parentNodeMap.put(level, node);  //5 AEG-PK
                        }else if (i == strList.size() - 1) {
                            //最後一行欄位
                            if (level < preLevel) {
                                int fatherIndex = nodeLevelList.indexOf(level);
                                if (fatherIndex > 0)
                                    fatherIndex--;
                                Element fatherNode = parentNodeMap.get(nodeLevelList.get(fatherIndex));
                                node = fatherNode.addElement(colName);
                            }
                            else if (level == preLevel) {
                                int fatherIndex = nodeLevelList.indexOf(level) - 1;
                                Element fatherNode;
                                if (fatherIndex <= -1)
                                    fatherNode = fileRoot;
                                else
                                    fatherNode = parentNodeMap.get(nodeLevelList.get(fatherIndex));
                                node = fatherNode.addElement(colName);
                            }else {
                                node = preNode.addElement(colName);
                            }
                            nodeLevelList.clear();
                            parentNodeMap.clear();
                        }else {
                            if (level < preLevel) {
                                //當前階層 < 上一行的階層，去找parent
                                int fatherIndex = nodeLevelList.indexOf(level);
                                Element fatherNode;
                                if (fatherIndex <= 0)
                                    fatherNode = fileRoot;
                                else {
                                    fatherIndex--;
                                    fatherNode = parentNodeMap.get(nodeLevelList.get(fatherIndex));
                                }
                                node = fatherNode.addElement(colName);
                                nodeLevelList.removeIf(e -> e > level); //大於當前level都刪掉
                                parentNodeMap.put(level, node);
                            }else if (level == preLevel) {
                                //新增同父元素，找上一層父元素
                                int fatherIndex = nodeLevelList.indexOf(level) - 1;
                                Element fatherNode;
                                if (fatherIndex <= -1)
                                    fatherNode = fileRoot;
                                else
                                    fatherNode = parentNodeMap.get(nodeLevelList.get(fatherIndex));
                                node = fatherNode.addElement(colName);
                                parentNodeMap.put(level, node);
                            }else {
                                //新增子元素，直接在上一個元素下新增
                                node = preNode.addElement(colName);
                                nodeLevelList.add(level);
                                parentNodeMap.put(level, node);
                            }
                        }
                        node.addAttribute("head", head);
                        preNode = node;
                        preLevel = level;
                    }
                    //break;
                    strList.clear();
                    System.out.println("Add element " + currSection + " complete");
                }
            }

            FileWriter fw = new FileWriter("EnsFilesXml.xml");
            OutputFormat of = new OutputFormat();
            of.setIndentSize(4);//設定Tab為幾個空格
            of.setNewlines(true);//設定是否換行
            XMLWriter xw = new XMLWriter(fw, of);
            xw.write(doc);
            xw.close();
            System.out.println("Make xml end.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
