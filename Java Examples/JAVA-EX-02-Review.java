package Prime;

import java.util.Scanner;

public class PrimeNumbers {
	
	private void printMessage(String print) {
		System.out.println(print);
	}
	
	public boolean functionMod(int inputNumber, int modValue) {
		
		if( inputNumber % modValue == 0 ) {
			return true;
		}
		return false;
	}
	
	public boolean isPrime( int parameter ) {
		
		for ( int count=2; count<=(parameter/2); count++ ){
			
			if( functionMod(parameter, count) ){
				return false;	
			}
		}
		
		return true;
	}
	
	private void findPrimeNumbers(int inputNumber) {
		
		for( int i=2; i<=inputNumber; i++ ){
			
			if( isPrime(i) ) {
				printMessage(""+i);
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
