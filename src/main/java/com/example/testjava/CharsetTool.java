package com.example.testjava;

public class CharsetTool {
    public String big52iso(String s){
        try {
                byte[] bytes = s.getBytes("BIG5");
                return new String(bytes, "ISO-8859-1");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return s;
    }

    public boolean isEncoding(String s, String encode){
        try {
            if (s.equals(new String(s.getBytes(), encode)))
                return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
