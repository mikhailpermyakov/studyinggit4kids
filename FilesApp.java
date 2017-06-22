package tests;

import java.io.*;

public class FilesApp {
 
    public static void main(String[] args) throws IOException {
         
         String text = "Hello world!";
         byte[] buffer = text.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buffer);
         
//        try(){
            BufferedInputStream bis = new BufferedInputStream(in);
            int c;
            while((c=bis.read())!=-1){
         
                System.out.print((char)c);
            }
//        }
/*        catch(Exception e){
             
            System.out.println(e.getMessage());
        }
        System.out.println();*/
    } 
}