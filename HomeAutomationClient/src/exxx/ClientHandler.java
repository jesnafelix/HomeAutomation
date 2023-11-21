package exxx;

import java.net.*;
import java.io.*;

class ClientHandler extends AbstractClient {

	ClientHandler(String host, int port) {
	 
	    super(host,port);
	  }
	  protected void connectionClosed() {

		    System.out.println("Client: Closed");
		  }
		 
		  protected void connectionException(Exception exception) {
		 
		    System.out.println("Client exception: " + exception);
		  }
		 
		  protected void connectionEstablished() {

		    System.out.println("Client: Connected");
		  }

		  protected void handleMessageFromServer(Object msg){

		    System.out.println("Client: Message received=" +msg);    
		  }

	} 


 
