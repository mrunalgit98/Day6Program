import java.util.Scanner;

public class PerfectNumber{
	
	public static void main(String[] args) {
		int i,number,sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		number=sc.nextInt();
		for (i=1;i<number;i++) {
		if(number%i==0);
		sum=sum+i;
		}
		if(sum==number) {
		System.out.println("perfect number");
		}else {
			System.out.println("not a perfect number");
		}
	}
	
}