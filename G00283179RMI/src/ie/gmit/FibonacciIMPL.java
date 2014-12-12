package ie.gmit;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class FibonacciIMPL extends UnicastRemoteObject implements RemoteFibonacci{


private static final long serialVersionUID = 1L;
	
	public FibonacciIMPL() throws RemoteException{
	}

	@Override
	public String getFibonacciSequence(int max) throws RemoteException {
		// TODO Auto-generated method stub	
			String value = "0, ";
		
			// DO file computation here
			for(int i = 1; i <= max; i++)
			{
				value += (fibonacciLoop(i) + ", ");
					}
				return value;
			}
		
		public static int fibonacciLoop(int number)
		{
		    if(number == 1 || number == 2)
		    {
		        return 1;
		    }
		    int fib1=1, fib2=1, fibonacci=1;
		    for(int i= 3; i<= number; i++)//For loop output the sequence 
		    {
		        fibonacci = fib1 + fib2; 
			    fib1 = fib2;
			    fib2 = fibonacci;
		    }
		return fibonacci; //return fibonacci  
		}
	}
