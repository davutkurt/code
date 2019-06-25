package PrimeNumber;

public class PrimeNumber {

	private void printMessage(String print) {
		System.out.println(print);
	}
	private void findPrimeNumbers(){
		
		for(int i=2; i<=20; i++ ){
			boolean isPrime = true;
			
			for (int count=2; count<=(i/2); count++ ){
				
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
			PrimeNumber primeNumber = new PrimeNumber();
			primeNumber.printMessage("Prime numbers that between 1 and 20 are :");
			primeNumber.findPrimeNumbers();

	}
}
