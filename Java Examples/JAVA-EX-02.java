import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int inputNumber;
		System.out.println("Enter 0 for exit. ");
		
		do{
			System.out.println("Enter a number : ");
			inputNumber = scn.nextInt();
			System.out.println("Prime numbers that between 1 and " + inputNumber + " are :");
			boolean b=true; int i=0; int count=0;
			
				for( i=2; i<=inputNumber; i++ ){
					b=true;
					for (  count=2; count<=(i/2); count++ ){
					
						if( i%count == 0 ){
							b = false;
							break;
							}
						}
					if ( b==true ){
						System.out.println( i );
						}
					}
				}
		while( inputNumber != 0 );
	}
}
	


