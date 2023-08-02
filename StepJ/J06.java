package StepJ;

public class J06 {
    public static void main(String[] args) {
        J06 stepB = new J06();
        stepB.j06();
    }

    void j06() {
        SubJ06 subj06 = new SubJ06();

        System.out.println("Fibonacci numbers from 1 to 20 are as follows.");

        // 결과 출력
        for (int i = 1; i <= 20; i++) {
            if (i == 1) {
                System.out.printf("%dst : %d\n", i, subj06.fibonacci(i));
            } else if (i == 2) {
                System.out.printf("%dnd : %d\n", i, subj06.fibonacci(i));
            } else if (i == 3) {
                System.out.printf("%drd : %d\n", i, subj06.fibonacci(i));
            } else
                System.out.printf("%dth : %d\n", i, subj06.fibonacci(i));
        }
    }
}