package Task5;

public class Tasksheet115 {

    public static void main(String[] args) {

        String a = "Wow";
        String b = "Wow";
        String c = "Wow!";
        String d = c;

        boolean b1 = a == b;  // Now comparing the same string literal "Wow", so reference equality is true
        boolean b2 = d.equals(b + "!");  // d is "Wow!" and b + "!" results in "Wow!", so equals is true
        boolean b3 = !c.equals(a);  // c is "Wow!" and a is "Wow", so they are not equal, making this true

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }

}