/*
 * this program propmts the user to enter marks of the five units and gives the summ and outputs the average in two decimal points
 * */
package Kunta;
import java.util.Scanner;// It is the easiest way to read input in a Java program
import java.math.RoundingMode;//Specifies a rounding behavior for numerical operations capable of discarding precision
import java.text.DecimalFormat;// It has a variety of features designed to make it possible to parse and format numbers in any locale
public class Average {
	private static final DecimalFormat df=new DecimalFormat("0.00");
	public static void main(String[]args)
	{//introduction of variables to to thir data types
		int OS,CAS,CS,COA,MFS, sum;
		double average;
		
	Scanner input=new Scanner(System.in);//(System .in )allows inputing of values
	System.out.println("enter your operating system marks");
	OS=input.nextInt();// user inputs values
	System.out.println("enter your computer application software narks");
	CAS=input.nextInt();
	System.out.println("enter your communication skills marks");
	CS=input.nextInt();
	System.out.println("enter your computer arcirecture marks");
	COA=input.nextInt();
	System.out.println("enter your math for science");
	MFS=input.nextInt();
	sum=OS+CAS+CS+MFS+COA;
	average=sum/5;
	System.out.printf(" your average is:"+average);
	

	}
	
	
	

}
