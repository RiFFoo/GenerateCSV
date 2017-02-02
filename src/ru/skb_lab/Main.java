package ru.skb_lab;
 
import java.io.*;
import java.util.Properties;
 
public class Main {
 
    public static void main(String[] args) {
 
        FileInputStream fis;
        Properties property = new Properties();
 
        try {
            
        	
        	fis = new FileInputStream("src/ru/skb_lab/Config/config.properties");
            property.load(fis);
 
            String host = property.getProperty("db.host");
            String login = property.getProperty("db.login");
            String password = property.getProperty("db.password");
            String separator = property.getProperty("file.separator");
            String in = property.getProperty("db.in");
            String out = property.getProperty("db.out");
            System.out.println("HOST: " + host
                            + ", LOGIN: " + login
                            + ", PASSWORD: " + password
                            +", SEPARATOR:" + separator
                            +",IN:" + in
                            +",OUT:" + out);
 
        } catch (IOException e) {
            System.err.println("������: ���� ������� ����������!"+e.getMessage());
        }
 
    }
 
}