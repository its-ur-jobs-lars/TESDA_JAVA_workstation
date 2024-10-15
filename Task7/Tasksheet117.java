package Task7;

import java.util.*;


public class Tasksheet117{
        public static void main(String[] args) {
        Scanner scannumber = new Scanner(System.in);

        // Take three numbers as input from the user
         System.out.print("Enter first number: ");
         int firstnumber = scannumber.nextInt();
         System.out.print("Enter second number: ");
         int secondnumber = scannumber.nextInt();
         System.out.print("Enter third number: ");
         int thirdnumber = scannumber.nextInt();

        // Check if all numbers are equal
         if (firstnumber == secondnumber && secondnumber == thirdnumber) {
          System.out.println("All numbers are equal.");
         } 
        // Check which number is the largest
         else {
         int largestnum = firstnumber;

         if (secondnumber > largestnum) {                                                                                                                                                
          largestnum = secondnumber;
         }

         if (thirdnumber > largestnum) {
          largestnum = thirdnumber;
        }

         System.out.println("The largest number is: " + largestnum);
         }

         scannumber.close();
                                                                                                                                                                                                                                                        
        }
}
