import java.util.Scanner;

public class Palindrom {
	
	private void printMessage(String print) {
		System.out.println(print);
	}
	
	private boolean checkLength(String inputString) {
		int length = findLength(inputString);
		if(length==1) {
			printMessage(""+inputString.length());
			printMessage("String length must be longer than one.");
			return false;
		}
		return true;
	}
	
	private int findLength(String inputString) {
		return inputString.length();
	}

	
	private void isPalindrom(String inputString) {
		boolean isPalindrom = true;
		int length = findLength(inputString);
		
	    for( int i = 0; i < length/2; i++ ) {
	        if (inputString.charAt(i) != inputString.charAt(length-i-1)){
	        isPalindrom=false;
	        }
	    }
	    
	    if(isPalindrom)
    		printMessage("This String is a Palindrom String.");
    	else {
    		printMessage("This String is not a Palindrom String.");
    	}
	}
	
	public static void main(String[] args) {
		Palindrom palndrm = new Palindrom();
		Scanner scannerInput = new Scanner(System.in);
		String inputString;
		
		palndrm.printMessage("Enter '-1' for exit.");
		palndrm.printMessage("Please enter a string :");

		do {
				
				inputString = scannerInput.nextLine();
				if(palndrm.checkLength(inputString)) {
					palndrm.isPalindrom(inputString);
				}
		}
		while( !inputString.equals("-1"+"") );
		scannerInput.close();
}
}
