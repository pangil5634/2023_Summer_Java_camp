package StepH;

public class H02 {

    public static void main(String[] args) {
        H02 stepH = new H02();
        stepH.h02();
    }

    void h02() {

        String onemore = "Y"; // 반복여부를 입력하는 문자 (Y/N)
        int i = 0; // 반복문을 위한 변수

        H02Sub h02sub = new H02Sub();
        setLotto();

    }

    void setLotto() {
        int lotto[] = new int[6]; // 컴퓨터가 만들어 낸 로또 번호 리스트
        int count = 0; // 현재 만들어지고 있는 로또 번호의 순서(0, 1, 2, 3, 4, 5)

        while (count < 6) {
            int temp = (int) ((Math.random() * 45) + 1);
            lotto[count] = temp;
            count++;
            for (int i = 0; i < count; i++) {
                if (lotto[i] == temp) {
                    count--;
                    break;
                } else {
                    continue;
                }
            }

        }
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + ", ");
        }

    }

}