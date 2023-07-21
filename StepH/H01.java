package StepH;

public class H01 {

    public static void main(String[] args) {
        H01 stepH = new H01();
        stepH.h01();
    }

    void h01() {
        H01Sub h01sub = new H01Sub();
        int answer = 0; // 컴퓨터가 만들어 낸 1부터 100사이의 임의의 숫자
        int number_try = 0; // 사용자가 제시한 숫자
        int count = 0; // 사용자가 맞추려고 시도한 횟수

        answer = h01sub.setRandomNumber(answer);
        while (true) {
            number_try = h01sub.getNumberTry(number_try);
            count++;
            int result = h01sub.compareNumber(number_try, answer);

            if (result == 1) {
                System.out.printf("You figured out the number in %d times\n", count);
                break;
            } else if (result == 0 || result == 2) {
                continue;
            }
        }

    }

}