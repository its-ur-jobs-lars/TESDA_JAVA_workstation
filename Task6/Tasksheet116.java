package Task6;

import java.util.*;

public class Tasksheet116 {
    public static void main(String[] args) {
 // Create a Scanner object to take input from the user
        
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter a string: ");
  String input = scanner.nextLine();
                                            
  // Use StringBuilder to reverse the input string
  StringBuilder reversedString = new StringBuilder(input);
  reversedString.reverse();
                                                                            
   // Check if the input string is equal to the reversed string
      if (input.equals(reversedString.toString())) {
        System.out.println("The input string is a palindrome.");
      } else {
         System.out.println("The input string is not a palindrome.");
       }
                                                                                                                                            
       // Close the scanner
        scanner.close();
       }
  }
                                                                                                                                                                