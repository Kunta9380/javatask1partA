/*
it checks if the number is withi 0-9 divisibility
* we use if statement when the number is entered it checks until when the number reaches a given criteria as per the statement
 * */

package Kunta;
import java.util.Scanner;//// It is the easiest way to read input in a Java program
public class divisibility {//here is the class name
public static void main(String[]args)//this is the main function

{
	int entered;
	Scanner input =new Scanner(System.in);
	System.out.print("enter the number to be tested");
	entered=input.nextInt();//allows input from the user

	System.out.print("\n");//this is the line break
if (entered  %2==0) //the if function
{
	System.out.println(entered+" is divisible by 2");
}

else if (entered  %3==0) 
{
	System.out.println(entered+ "is divisible by 3");
}		
if (entered  %4==0) 
{
	System.out.println(entered+ " is divisible by 4");
}
else if (entered  %5==0) 
{
	System.out.println(entered+ " is divisible by 5");
}
else if (entered  %6==0) 
{
	System.out.println(entered+ "is divisible by 6");
}
else if (entered  %7==0) 
{
	System.out.println(entered+ " is divisible by 7");
}
else if (entered  %8==0) 
{
	System.out.println(entered+ "  is divisible by 8");
}
else if (entered  %9==0) 
{
	System.out.println(entered+ " is divisible by 9");
}
else 
{
	System.out.println(entered+ "is not within 0-9 divisibility");
}
System.out.print("\n");
}
}
