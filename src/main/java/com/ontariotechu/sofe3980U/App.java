package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Binary binary1=new Binary("00010001000");
        System.out.println( "First binary number is "+binary1.getValue());
		Binary binary2=new Binary("111000");
        System.out.println( "Second binary number is "+binary2.getValue());
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "Their summation is "+sum.getValue());
		 // Set up Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Display menu
        System.out.println("\nChoose an operation:");
        System.out.println("1. OR");
        System.out.println("2. AND");
        System.out.println("3. Multiply");

        // Get user input for operation
        int choice = scanner.nextInt();

        Binary result = null;

        // Perform the operation based on user input
        switch (choice) {
            case 1:
                result = Binary.or(binary1, binary2);
                System.out.println("Result of OR operation: " + result.getValue());
                break;
            case 2:
                result = Binary.and(binary1, binary2);
                System.out.println("Result of AND operation: " + result.getValue());
                break;
            case 3:
                result = Binary.multiply(binary1, binary2);
                System.out.println("Result of multiplication: " + result.getValue());
                break;
            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
        }

        // Close the scanner
        scanner.close();
    }
}
