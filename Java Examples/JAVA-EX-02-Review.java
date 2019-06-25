package Prime;

import java.util.Scanner;

public class PrimeNumbers {
	
	private void printMessage(String print) {
		System.out.println(print);
	}
	
	private void findPrimeNumbers(int inputNumber) {
		
		boolean isPrime=true;  
		int count=0;
		
		for( int i=2; i<=inputNumber; i++ ){
			isPrime=true;
			for (  count=2; count<=(i/2); count++ ){
			
				if( i % count == 0 ){
					isPrime = false;
					break;
					}
				}
			if ( isPrime ){
				printMessage(""+ i );
				}
			}
	}
	public static void main(String[] args) {
		Scanner scannerInput = new Scanner(System.in);
		int inputNumber;
		int mistakeCounter=0;
		
		PrimeNumbers primeNumber = new PrimeNumbers();
		primeNumber.printMessage("Enter 0 for exit. ");
		primeNumber.printMessage("Please Enter a Number.");
		
		do{
				if(scannerInput.hasNextInt()) {
					
					inputNumber = scannerInput.nextInt();
					primeNumber.printMessage("Prime numbers that between 1 and " + inputNumber + " are :");
					primeNumber.findPrimeNumbers(inputNumber);
			
				}
				else{
					primeNumber.printMessage("Please Enter a Number !");
					scannerInput.next();
					mistakeCounter++;
				}
			}
		while( mistakeCounter < 3 );
		scannerInput.close();
	}
}
