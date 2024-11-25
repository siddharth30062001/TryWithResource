package com;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class DataRead {

    public static void main(String[] args) {
        
        try(FileOutputStream fos=new FileOutputStream("C:/Users/siddh/OneDrive/Desktop/example.txt");
        InputStream ins=new FileInputStream("C:/Users/siddh/OneDrive/Desktop/example.txt")){

            String input="I am learning try with resources";
            byte [] b=input.getBytes();
            fos.write(b);
            System.out.println("File Write sucessfully!!");

            DataInputStream dis = new DataInputStream(ins);
            int data = ins.available();    
            // Returns an estimate of the number of bytes that can be read from this input stream.   
            byte[] byteArray2 = new byte[data]; //    
            dis.read(byteArray2);    
            String str = new String(byteArray2); // passing byte array into String constructor  
            System.out.println("------------Data read from file--------------");  
            System.out.println(str); // display file data  

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
