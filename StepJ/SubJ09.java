package StepJ;

public class SubJ09 {
    int power(int num1, int num2) {
        if (num2 == 0) {
            return 1;
        } else if (num2 == 1) {
            return num1;
        } else if (num2 > 0 && num2 % 2 == 0) {
            return power(num1, num2 / 2) * power(num1, num2 / 2);
        } else if (num2 > 0 && num2 % 2 != 0) {
            return power(num1, num2 / 2) * power(num1, num2 / 2) * num1;
        }
        return 0;
    }
}
