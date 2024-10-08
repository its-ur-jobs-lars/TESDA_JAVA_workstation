package Task4;

public class Tasksheet114 {
    public static void main(String[] args) {

                // Step 1: Create an int variable check_number with an initial value of 10
                int check_number = 10;
                
                // Step 2: Create a String variable message
                String message;
        
                // Step 3: Use a loop to check each number from 1 to check_number
                for (int i = 1; i <= check_number; i++) {
                    // Step 4: Check if the number is odd or even using the provided syntax
                    message = (i % 2 == 0) ? i + " is an even number" : i + " is an odd number";
        
                    // Step 5: Print the message value
                    System.out.println(message);
                }
            }
        }

