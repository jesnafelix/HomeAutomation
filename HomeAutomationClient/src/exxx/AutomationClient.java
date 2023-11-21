package exxx;

import java.io.IOException;
import java.util.Scanner;

public class AutomationClient {

	public  static void main(String[] a)
	{
		ClientHandler client=new ClientHandler("192.168.250.161", 40);
		try {
			client.openConnection();
			  Scanner getLine = new Scanner(System.in);
			    Scanner input = new Scanner(getLine.nextLine());
			    getLine.close();
			    input.close();
			    client.closeConnection();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
