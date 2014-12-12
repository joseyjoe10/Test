package ie.gmit;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class FibClient {
	
	public String rmiCall(int length) throws RemoteException, MalformedURLException, NotBoundException{
		
		RemoteFibonacci f = (RemoteFibonacci) Naming.lookup("rmi://localhost:1099/howdayService");
		
		String rmiTester = f.getFibonacciSequence(length);
		return rmiTester;
	}

}
