package com;

import java.io.FileOutputStream;
import java.io.FileReader;

public class CheckResource {

    public static void main(String[] args) {
        
        try(FileOutputStream fileos=new FileOutputStream("C:/Users/siddh/OneDrive/Desktop/example.txt")){
            String data = "Example of Java t point";
            byte [] b=data.getBytes();
            fileos.write(b);
            System.out.println("File Write Sucessfully");

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
