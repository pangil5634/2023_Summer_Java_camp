package StepJ;

public class J10 {
    public static void main(String[] args) {
        J10 stepB = new J10();
        stepB.j10();
    }

    void j10() {
        SubJ10 subj10 = new SubJ10();

        // 결과 출력
        for (int i = 1; i <= 20; i++) {
            if (i >= 2) {
                double before = (double) subj10.fibonacci(i) / subj10.fibonacci(i - 1);
                double after = (double) subj10.fibonacci(i + 1) / subj10.fibonacci(i);

                System.out.printf("%dth ratio (%d / %d) : %.6f\n", i, subj10.fibonacci(i + 1),
                        subj10.fibonacci(i),
                        after);
                if (Math.abs(after - before) < 0.000001) {
                    break;
                }
            }
        }
    }
}