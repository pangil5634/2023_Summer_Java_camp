import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num, answer;
        num = s.nextDouble();

        answer = fibonacci(num);
        System.out.println(answer);

        s.close();
    }

    public static double fibonacci(double n) {
        double result = 0;

        if (n == 0) {
            result = 0;
        }
        if (n == 1 || n == 2) {
            result = 1;
        } else {
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }

        return result;
    }
}