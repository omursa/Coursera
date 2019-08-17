package javatPoint;


public class Fibonachi2 {


	 static int fib(int n) 
	    { 
	    if (n <= 1) 
	       return n; 
	    return fib(n-1) + fib(n-2); 
	    } 
	
	
	

	public static void main(String[] args) {
	
		int n = 1;
		
	
		while(n<10) {
			System.out.println(fib(n));
			n=n+1;
			
		}
			
		
	}

}
