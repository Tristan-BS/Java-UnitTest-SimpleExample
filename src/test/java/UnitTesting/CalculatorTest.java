package UnitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void Addion_Test() {
        var calc = new Calculator();
        assertEquals(10, calc.Addition(5, 5));
    }

    @Test
    void Wrong_Addition_Test() {
        var calc = new Calculator();
        assertEquals(10, calc.WrongAddition(5, 5));
    }

    @Test
    void GetGradeFromPercentage_Test() {
        var calc = new Calculator();
        assertEquals(1, calc.GetGradeFromPercentage(90));
        assertEquals(2, calc.GetGradeFromPercentage(85));
        assertEquals(3, calc.GetGradeFromPercentage(75));
        assertEquals(4, calc.GetGradeFromPercentage(65));
        assertEquals(5, calc.GetGradeFromPercentage(55));
    }

}