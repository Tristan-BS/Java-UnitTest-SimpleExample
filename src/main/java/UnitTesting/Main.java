package UnitTesting;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        BubbleSort Sort = new BubbleSort();

        System.out.println("Addition: " + calc.Addition(5, 5));
        System.out.println("Get Grade from Percentage: " + calc.GetGradeFromPercentage(90));

        // Sorting Strings
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry"));
        System.out.println("Sorted Strings: " + Sort.Algorithm(stringList));

        // Sorting Integers
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(3, 1, 2));
        System.out.println("Sorted Integers: " + Sort.Algorithm(intList));

        // Sorting Doubles
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(3.1, 1.2, 2.3));
        System.out.println("Sorted Doubles: " + Sort.Algorithm(doubleList));


    }
}