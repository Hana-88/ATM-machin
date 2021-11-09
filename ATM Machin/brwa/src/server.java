import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    public static void main(String args[]) {
        try {
            ServerSocket serverSocket=new ServerSocket(1234);
            System.out.println("waiting to clint");
            Socket s=serverSocket.accept();
            System.out.println("conected to clint");
           DataInputStream dataInputStream=new DataInputStream(new BufferedInputStream(s.getInputStream()));
         String a=  dataInputStream.readUTF();
         System.out.println(a);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
    
    
}
