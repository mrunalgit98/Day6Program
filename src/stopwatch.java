import java.util.Scanner;

public class stopwatch{
	public static void main(String[] args) {
		
	
	
	Scanner sc= new Scanner(System.in);
	
	int option;
	long start=0;
	long stop;
		
		System.out.println("enter \n1 -START \n2 stop \n3 exit \n ");
		option =sc.nextInt();
		switch(option) {
		
		case 1:
			start=System.currentTimeMillis();
			System.out.println( " start at "+start );
			
		case 2: stop =System.currentTimeMillis();
		System.out.println("stop at" +stop);
		
		default : System.exit(0);
		}
	}
}