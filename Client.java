import java.io.*;
import java.net.*;
public class Client
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("Name: Zarana Nakrani");
		System.out.println("Enrollment: 180770107086");
		Socket s = new Socket("127.0.0.1",7777);
		if(s.isConnected())
		{
			System.out.println("Connected to Server");
		}
		while(true)
		{
			System.out.println("Enter String to Reverse");			
			DataInputStream in = new DataInputStream(System.in);
			String str = in.readLine();
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());		
			dout.writeUTF(str);
			DataInputStream din = new DataInputStream(s.getInputStream());
			String rev = din.readUTF();
			System.out.println("Reversed String:\t"+rev);			
		}
	}
}