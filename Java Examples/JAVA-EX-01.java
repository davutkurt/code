public class Prime {

	public static void main(String[] args) {
		
			System.out.println("Prime numbers that between 1 and 20 are :");
			boolean b=true; int i=0; int count=0;
			
			for( i=2; i<=20; i++ ){
				b = true;
				
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
}
	


