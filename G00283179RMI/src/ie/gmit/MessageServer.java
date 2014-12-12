package ie.gmit;

import java.rmi.*;
import java.rmi.registry.*;

public class MessageServer {
	public static void main(String[] args) throws Exception{
		RemoteFibonacci ms = new FibonacciIMPL();
		LocateRegistry.createRegistry(1099);
		Naming.rebind("howdayService", ms);
		System.out.println("Server ready.");
	}
}

