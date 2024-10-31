
public class RollNumber1 extends Thread { 
	

	public void run() { 
		for (int i = 1; i <= 10; i++) { 
			
			int result = 24 * i; 
	
			System.out.println("BSE-2022F-" + 24 + " * " + i + " = " + result + "\n--------" + Thread.currentThread().getName() + "--------------"); 
		} 
	} 
}


