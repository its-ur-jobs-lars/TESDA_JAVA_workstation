package Task9;

import java.util.*;

public class Task119_v{

        public double sum(double add_num1, double add_num2){
            return add_num1 + add_num2;
        }
 
        public double subtraction(double sub_num1, double sub_num2){
            return sub_num1 + sub_num2;
        }

        public double multiply(double multiply_num1, double multiply_num2){
            return multiply_num1 + multiply_num2;
        }


        public double divide(double divide_num1, double divide_num2){
            if (divide_num2 != 0){
                return divide_num1 / divide_num2;
            }else{
                System.out.println("Error: Division by Zero");
                return 0;
            }
        }
        

        public static void main(String[] args) {
            try (Scanner method_scanner = new Scanner(System.in)) {
                // Input two numbers from the user
                    System.out.print("Enter the first number: ");
                    double num1 = method_scanner.nextDouble();

                    System.out.print("Enter the second number: ");
                    double num2 = method_scanner.nextDouble();
                    // Now we need to create an object to call non-static methods
                    Tasksheet119 operations = new Tasksheet119();
                    
                    System.out.println("Addition: " + operations.sum(num1, num2));
                    System.out.println("Subtraction: " + operations.subtract(num1, num2));
                    System.out.println("Multiplication: " + operations.multiply(num1, num2));
                    System.out.println("Division: " + operations.divide(num1, num2));
            }
        } 
        }

