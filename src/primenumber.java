import java.util.Scanner;

public class primenumber{
	

	public static void main(String[] args) {
		int temp;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter number");
	 int check = sc.nextInt();
	 boolean isPrime=true;
	 for(int i=2;i<=check/2;i++) {
		 temp=check%i;
		 if(temp == 0) {
			 isPrime=false;
			 break;
		 }
		 
	 }
	 if(isPrime)
		 System.out.println("is prime number");
	 else
		 System.out.println("not a prime number");
	 
	}
	
}