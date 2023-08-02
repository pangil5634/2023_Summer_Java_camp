package StepJ;

public class J08 {
    public static void main(String[] args) {
        J08 stepB = new J08();
        stepB.j08();
    }

    void j08() {
        SubJ08 subj08 = new SubJ08();

        int m = 3;
        int n = 3;

        System.out.println("Ackermannonacci numbers from 1 to 20 are as follows.");
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                int result = subj08.Ackermann(i, j);
                System.out.println("Ackermann(" + i + ", " + j + ") = " + result);

            }
        }
    }
}