import java.io.File;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class client {
	   public static void main(String args[]) throws Exception
	   {
		  File file = new File("texto.txt");
		  Scanner scan = new Scanner(file);  
		  scan.useDelimiter("\\Z");  
		  String content = scan.next(); 
	      DatagramSocket clientSocket = new DatagramSocket();
	      InetAddress IPAddress = InetAddress.getByName("localhost");
	      byte[] sendData = new byte[1024];
	      sendData = content.getBytes();
	      DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
	      clientSocket.send(sendPacket);
	      clientSocket.close();
	   }
}
