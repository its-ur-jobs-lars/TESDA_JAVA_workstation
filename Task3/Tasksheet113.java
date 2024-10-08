package Task3;

public class Tasksheet113 {
    public static void main(String[] args) {
                
        // Declare and initialize the primitives with specific values
        byte zero = 0;             // Assigning byte value of 0 (to get '0' in the output)
        short s = 2;            // Assigning short value of 2
        int i = 1;              // Assigning int value of 1
        char c = 'H';           // Assigning char value of 'H'
        boolean bool = true;    // Assigning boolean value of true
        
        // Concatenate the primitives into a string
        String output = "" + c + "3" +  "11" + zero + " w" + zero + "r" + i + "d " + s + ".0 " + bool;
        
        // Print the output
        System.out.println(output); // This prints: H3110 w0r1d 2.0 true
    }
}
