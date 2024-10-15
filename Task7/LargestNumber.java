package Task7;

import java.util.*;


public class Tasksheet117 {
    import java.util.

    public class LargestNumber {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                        // Take three numbers as input from the user
                                System.out.print("Enter first number: ");
                                        int num1 = scanner.nextInt();
                                                System.out.print("Enter second number: ");
                                                        int num2 = scanner.nextInt();
                                                                System.out.print("Enter third number: ");
                                                                        int num3 = scanner.nextInt();

                                                                                // Check if all numbers are equal
                                                                                        if (num1 == num2 && num2 == num3) {
                                                                                                    System.out.println("All numbers are equal.");
                                                                                                            } 
                                                                                                                    // Check which number is the largest
                                                                                                                            else {
                                                                                                                                        int largest = num1;

                                                                                                                                                    if (num2 > largest) {
                                                                                                                                                                    largest = num2;
                                                                                                                                                                                }

                                                                                                                                                                                            if (num3 > largest) {
                                                                                                                                                                                                            largest = num3;
                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                    System.out.println("The largest number is: " + largest);
                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                    scanner.close();
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        
}
