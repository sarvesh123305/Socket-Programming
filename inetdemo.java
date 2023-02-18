import java.io.*;
import java.net.*;
public class inetdemo{
    public static void main(String[] args){
        try{
            InetAddress ip=InetAddress.getLocalHost();
            System.out.println(""+InetAddress.getLocalHost());
//            System.out.println(""+ip.getLocalHost());

        }catch(Exception e){System.out.println(e);}
    }
}