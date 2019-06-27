package PrimeNumber;

public class PrimeNumber {

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
	private void findPrimeNumbers(int inputNumber){
		
		for(int i=2; i<=inputNumber; i++ ){
			
			if( isPrime( i ) )
				printMessage(""+i);						
		}
	}
	
	public static void main(String[] args) {
			PrimeNumber primeNumber = new PrimeNumber();
			primeNumber.printMessage("Prime numbers that between 1 and 20 are :");
			primeNumber.findPrimeNumbers(20);

	}
}
