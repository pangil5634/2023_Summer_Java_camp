package StepJ;

public class SubJ08 {

    int Ackermann(int m, int n) {
        if (m < 0 || n < 0) {
            throw new IllegalArgumentException("Ackermann function is not defined for negative inputs.");
        }

        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return Ackermann(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return Ackermann(m - 1, Ackermann(m, n - 1));
        } else {
            throw new IllegalArgumentException("Ackermann function is not defined for negative inputs.");
        }
    }
}
