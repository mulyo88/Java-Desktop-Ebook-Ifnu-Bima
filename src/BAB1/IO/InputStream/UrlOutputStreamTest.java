/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BAB1.IO.InputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author raditya
 */
public class UrlOutputStreamTest {
    public static void main(String[] args){
        try{
            URL url = new URL("http://www.yahoo.com");
            URLConnection urlconn = url.openConnection();
            InputStream is = urlconn.getInputStream();
            OutputStream os = new FileOutputStream("yahoo.txt");
            int byteStream;
            do{
                byteStream = is.read();
                os.write((char)byteStream);
            }while(byteStream!=-1);
            os.flush();
        }catch(MalformedURLException e){
            
        }catch(IOException e){
            
        }
    }
}

