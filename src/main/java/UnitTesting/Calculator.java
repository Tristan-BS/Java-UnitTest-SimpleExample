package UnitTesting;

public class Calculator {

    public int Addition(int A, int B) {
        return A + B;
    }

    public int GetGradeFromPercentage(int Grade) {
        if (Grade >= 90) {
            return 1;
        } else if (Grade >= 80) {
            return 2;
        } else if (Grade >= 70) {
            return 3;
        } else if (Grade >= 60) {
            return 4;
        } else {
            return 5;
        }
    }
}
