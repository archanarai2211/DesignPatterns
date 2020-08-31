package org.learning.structural.facade;

public class Facade {

    //This hides complexity and shows simple code
    //This is used for refractoring
    public static void main(String[] args) {
        Connection conn = Connection.getConnection();
        UserInfo info = new UserInfo();
        info.setAddress("560066");
        info.setAge("32");
        info.setName("Maggie");
        conn.insertData(info);
        System.out.println(conn.getData());
    }

}
