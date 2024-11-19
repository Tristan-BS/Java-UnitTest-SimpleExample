package UnitTesting;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.Addition(5, 5));
        System.out.println("Get Grade from Percentage: " + calc.GetGradeFromPercentage(90));
    }
}