import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {

	public void findDuplicateNumbers(int array[]){
		int i = 0;
		Set<Integer> notDuplicates = new HashSet<Integer>();
    	Set<Integer> duplicates = new HashSet<Integer>();
    	
		for ( i = 0; i<array.length; i++ ) {
    	    if (!notDuplicates.contains(array[i])) {
    	        notDuplicates .add(array[i]);
    	        continue;
    	    }
    	    duplicates.add(array[i]);
    	}
    	
    	if( duplicates.isEmpty() )
    		System.out.print("There is no duplicate number. ");
    	else{
    		Object[] v_duplicate = duplicates.toArray();
    		
    		if(v_duplicate.length==1)
    			System.out.print("Duplicate number is :" + v_duplicate[0]);
    		else{
    			System.out.print("Duplicate numbers are :" + v_duplicate[0]);
    			for( i=1; i<duplicates.size(); i++ )
    				System.out.print(" , " + v_duplicate[i] );
    				
    		}
    	}
    	System.out.println();
	}
	
	public static void main(String[] args) {
		
		DuplicateNumbers dn= new DuplicateNumbers();
		
		int[] array1 = { 1, 2, 4, 8, 3 };
		int[] array2 = { 4, 6, 12, 5, 5, 89 };
		int[] array3 = { 4, 3, 8, 8, 35, 35, 4 };
		int[] array4 = { 5, 6, 78, 5 };
		
		dn.findDuplicateNumbers(array1);
		dn.findDuplicateNumbers(array2);
		dn.findDuplicateNumbers(array3);
		dn.findDuplicateNumbers(array4);
		
	}
}
