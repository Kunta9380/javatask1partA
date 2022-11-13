/*evans musembi
 *  i am presenting  a program that  user chooses operation for calculartion

*/
package Musembi;//folder name

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		int result=0, value1, value2;
		char compute = ' ';

		Scanner input = new Scanner(System.in);
		System.out.println("enter the first value");
		value1 = input.nextInt();
		System.out.println("enter the second value");
		value2 = input.nextInt();
		System.out.println("choose an operation between multiply,add,divide and subtract ");
		input.nextLine();//user is allowed to input values
		compute = input.nextLine().charAt(0);//This returns the character at the specified index in a string
		System.out.print(compute);
		if (compute == '+') {
			result = value1 + value2;
			System.out.println(compute);
		} else if (compute == '*') {
			result = value1 * value2;
			System.out.println(compute);
		} else if (compute == '/') {
			result = value1 / value2;
			System.out.println(compute);
		} else if (compute == '-') {
			result = value1 - value2;
			System.out.println(compute);
		} 
		System.out.printf("%d\n",result);//%d shows the  value outputed is a double
	}
}

