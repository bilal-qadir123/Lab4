


public class RollNumber2 extends Thread { 
	

	
	public void run() { 
		for (int i = 1; i <= 10; i++) { 
			
			int result = 17 * i; 
			
			System.out.println(17 + " August * " + i + " = " + result + "\n--------" + Thread.currentThread().getName() + "--------------"); 
		} 
	} 
	
} 