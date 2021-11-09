
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Main extends Account {

	public static void main(String[] args) throws IOException {
		Account b = new Account();
		b.log();
	try
	{
		Socket s=new Socket("local host",1234);

		System.out.println("connected");
	DataInputStream dataInputStream=new DataInputStream(System.in);
	DataOutputStream dataOutputStream=new DataOutputStream(s.getOutputStream());
		BufferedWriter bufferedReader = new BufferedWriter(new FileWriter("C:\\Users\\brwah\\nawroz\\atm.txt"));
		bufferedReader.write(b.toString());
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("atm.txt"));
		out.writeObject(b);
	 
		bufferedReader.close();
		 
	}
	catch(Exception e)
	{
		return;
	}
		 
	}

}
