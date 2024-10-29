package Task14;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// program that uses lambda expressions with the Predicate interface to filter a list of integers. 

public class Tasksheet124{

    public static void main(String[] args) {
        // Create 10 elements of numbers containing of positive and negative numbers

    List<Integer> numbers = List.of(5,-6,17,-10,-8,-9,-20,4,13,25);

    System.out.println("Original List: " + numbers);

      // Define predicates using lambda expressions
    Predicate<Integer> isPositive = num -> num > 0;
    Predicate<Integer> isEven = num -> num % 2 == 0;
    Predicate<Integer> morethan10 = num -> num > 10;

      // Filter the list based on each condition
        List<Integer> positiveNumbers = numbers.stream()
                                               .filter(isPositive)
                                               .collect(Collectors.toList());
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(isEven)
                                           .collect(Collectors.toList());
        List<Integer> numbersGreaterThanTen = numbers.stream()
                                                     .filter(morethan10)
                                                     .collect(Collectors.toList());
        
        // Print the results
        System.out.println("Positive Numbers: " + positiveNumbers);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Numbers Greater Than 10: " + numbersGreaterThanTen);

    }

    
}