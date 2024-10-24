package Task11;

import java.lang.Math.*;

public class Task119{
    
    public static int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public static int sub(int a, int b) {
        return Math.subtractExact(a, b);

    }

    public static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);

    }

    public static int divide(int a, int b) {
         return Math.floorDiv(a, b);
    }


    public static void main(String[] args) {

        int a = 50;
        int b = 10;

        System.out.println("The sum of 50 and 10 is " + add(a,b));
        System.out.println("The difference of 50 and 10 is " + sub(a,b));
        System.out.println("The product of 50 and 10 is " + multiply(a,b));
        System.out.println("The qoutient of 50 and 10 is " + divide(a,b));
    }

}