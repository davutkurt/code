import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatedNumber {

	private void printMessage(String print) {
		System.out.print(print);
	}
	private void printMessageLine(String print) {
		System.out.println(print);
	}
	private void findRepeatedNumbers(int array[]){
		int i = 0;
	Set<Integer> nonRepeated = new HashSet<Integer>();
    	Set<Integer> repaeted = new HashSet<Integer>();
    	
	for ( i = 0; i<array.length; i++ ) {
    	    if (!nonRepeated.contains(array[i])) {
    	    	nonRepeated .add(array[i]);
    	        continue;
    	    }
    	    repaeted.add(array[i]);
    	}
	printMessageLine(""+nonRepeated);
    	if( repaeted.isEmpty() )
    		printMessageLine("There is no Repeated Number number. ");
    	else{
    		Object[] v_repaeted = repaeted.toArray();
    		
    		if(v_repaeted.length==1)
    			printMessageLine("Repeated number is :" + v_repaeted[0]);
    		else{
    			printMessage("Repeated numbers are :" + v_repaeted[0]);
    			for( i=1; i<repaeted.size(); i++ )
    				printMessage(" , " + v_repaeted[i] );
    				
    		}
    	}
    	printMessageLine("");
	}
	
	public static void main(String[] args) {
		
		RepeatedNumber repeatedNumber= new RepeatedNumber();
		
		int[] array1 = { 1, 2, 4, 8, 3 };
		int[] array2 = { 4, 6, 12, 5, 5, 89 };
		int[] array3 = { 4, 3, 8, 8, 35, 35, 4 };
		int[] array4 = { 5, 6, 78, 5 };
		
		repeatedNumber.findRepeatedNumbers(array1);
		repeatedNumber.findRepeatedNumbers(array2);
		repeatedNumber.findRepeatedNumbers(array3);
		repeatedNumber.findRepeatedNumbers(array4);
		
    }
    }
