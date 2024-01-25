package com.example.testjava;

import java.sql.*;

public class TestSql {
    public static void runSql(String[] args){
        Connection          connection;
        Statement           stmt;
        PreparedStatement   pStmt;
        ResultSet           rs;
        DatabaseMetaData    dbMeta;
        try {
            Class.forName("com.tandem.sqlmx.SQLMXDriver");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return;
        }

        try{
            String url = "jdbc:sqlmx:";
            connection = DriverManager.getConnection(url);
            stmt = connection.createStatement();
            stmt.execute("set catalog MALLCAT;");
            stmt.execute("set schema MALLSCH;");

            rs = stmt.executeQuery("select * from commodity_tags;");
            System.out.println("Commodity_tags");
            System.out.print("--------------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.print(rs.getString("CommoditySubTag") + " ");
                System.out.println(rs.getString("CommodityMainTag"));
            }

            System.out.println();

            rs = stmt.executeQuery("select * from commodities;");
            System.out.println("Commodities");
            System.out.print("--------------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.print(rs.getString("CommodityID") + " ");
                System.out.print(rs.getString("CommodityName") + " ");
                System.out.print(rs.getString("CommodityQty") + " ");
                System.out.print(rs.getString("CommodityPrice") + " ");
                System.out.print(rs.getString("CommodityTag") + " ");
                System.out.print(rs.getString("CommodityImgPath") + " ");
                System.out.println(rs.getString("CommodityDetail"));
            }

            System.out.println();

            rs = stmt.executeQuery("select * from userinfo;");
            System.out.println("UserInfo");
            System.out.print("--------------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.print(rs.getString("UserAccount") + " ");
                System.out.print(rs.getString("UserPassword") + " ");
                System.out.print(rs.getString("UserName") + " ");
                System.out.print(rs.getString("UserPhone") + " ");
                System.out.print(rs.getString("UserEmail") + " ");
                System.out.print(rs.getString("UserAddress") + " ");
                System.out.println(rs.getString("UserMsg"));
            }

            System.out.println();

            rs = stmt.executeQuery("select * from carts;");
            System.out.println("Carts");
            System.out.print("--------------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.print(rs.getString("CartSeq") + " ");
                System.out.print(rs.getString("CartAccount") + " ");
                System.out.print(rs.getString("CartCommodityID") + " ");
                System.out.println(rs.getString("CartQty"));
            }

            System.out.println();

            rs = stmt.executeQuery("select * from orderlists;");
            System.out.println("OrderLists");
            System.out.print("--------------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.print(rs.getString("OrderNo") + " ");
                System.out.print(rs.getString("OrderCommodityID") + " ");
                System.out.print(rs.getString("OrderQty") + " ");
                System.out.print(rs.getString("OrderPrice") + " ");
                System.out.println(rs.getString("OrderReturn"));
            }

            System.out.println();

            rs = stmt.executeQuery("select * from userorders;");
            System.out.println("UserOrders");
            System.out.print("--------------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.print(rs.getString("OrderNo") + " ");
                System.out.print(rs.getString("OrderAccount") + " ");
                System.out.print(rs.getString("OrderDate") + " ");
                System.out.println(rs.getString("OrderTotal"));
            }

        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
