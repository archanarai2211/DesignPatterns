package org.learning.structural.facade;

public class Connection {
    private Data info;
    private final static  Connection connection = new Connection();
    private Connection(){

    }
    public static Connection getConnection(){
        return connection;
    }

    public void insertData(Data info){
        this.info = info;
    }

    public Data getData(){
        return info;
    }
}
