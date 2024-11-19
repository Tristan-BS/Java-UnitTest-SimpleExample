package UnitTesting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // Instantiate the classes
    Calculator calc = new Calculator();
    BubbleSort sort = new BubbleSort();

    // ArrayLists
    ArrayList<String> stringList = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry"));
    ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(3, 1, 2));
    ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(3.1, 1.2, 2.3));

    // Test the methods
    @Test
    void Addion_Test() {
        assertEquals(10, calc.Addition(5, 5));
    }

    @Test
    void GetGradeFromPercentage_Test() {
        assertEquals(1, calc.GetGradeFromPercentage(90));
        assertEquals(2, calc.GetGradeFromPercentage(85));
        assertEquals(3, calc.GetGradeFromPercentage(75));
        assertEquals(4, calc.GetGradeFromPercentage(65));
        assertEquals(5, calc.GetGradeFromPercentage(55));
    }

    @Test
    void BubbleSortAlgorithm_Test() {
        assertEquals("[Apple, Banana, Cherry]", sort.Algorithm(stringList).toString());
        assertEquals("[1, 2, 3]", sort.Algorithm(intList).toString());
        assertEquals("[1.2, 2.3, 3.1]", sort.Algorithm(doubleList).toString());
    }
}