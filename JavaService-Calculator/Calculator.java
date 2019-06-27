public class Calculator {

	public static double add (double firstInputNumber, double secondInputNumber){
		
		return firstInputNumber + secondInputNumber;
	}
	
	public static double substract (double firstInputNumber, double secondInputNumber){
		return firstInputNumber - secondInputNumber;
	}
	
	public static double multiply (double firstInputNumber , double secondInputNumber){
		
		return firstInputNumber * secondInputNumber;
	}
	
	public static double divide (double firstInputNumber, double secondInputNumber){
		
		if(secondInputNumber != 0) {
		return firstInputNumber / secondInputNumber;
		}
		else {
			return 0;
		}
	}
  
  }
