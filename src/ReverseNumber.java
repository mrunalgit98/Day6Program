import java.util.Scanner;

public class ReverseNumber{
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int check=sc.nextInt(),revrse = 0 ;
		
		while(check!=0) {
			int remainder= check %10;
			revrse=revrse *10 + remainder;
			check=check/10;
		}
		System.out.println("the reverse of given number is " + revrse);
		
	}
	
}