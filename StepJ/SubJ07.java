package StepJ;

public class SubJ07 {
    // 제곱수 리턴하는 메소드
    int poweroftwo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2 * poweroftwo(n - 1);
        }
    }
}
