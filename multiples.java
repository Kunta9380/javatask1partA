//this program displays multiples

package Name;//the source folder

public class multiples {
   	public static void main(String args[]) {
		System.out.println("\nmultiples of 2: ");		
		for (int i=71; i<150; i++) {
			if (i%2==0) 
			System.out.print(i +", ");			
		}
		System.out.println("\nmultiple of 3: ");		
		for (int i=71; i<150; i++) {
			if (i%3==0) 
			System.out.print(i +", ");			
		}
				
		System.out.println("\n\nmultiples of 7: ");
		for (int i=71; i<150; i++) {
			if (i%5==0) System.out.print(i +", ");			
		}
				
		
		System.out.println("\n");//line break
  }
}


