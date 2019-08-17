package javatPoint;

public class Palindromenumber {
	
	public static int fibon (int n) {
		
int result=1;


for(int i=1; i<=n; i++) {
	result= result*i;
	
}
return result;

	}
	
	
	
	
	
	public static void main(String[] args) {
	int	fact=fibon(1);
		System.out.println(fact);
		
	}
}
