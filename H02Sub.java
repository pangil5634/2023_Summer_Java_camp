import java.util.Scanner;

public class H02Sub {

    Scanner sc = new Scanner(System.in);

    int[] getNumber(int[] number) {
        int count = 0; // 현재까지 입력된 숫자의 개수(0~10)
        int newnum; // 입력받은 숫자
        boolean dup = false; // 중복검사 통과 여부 (true : 중복, false : 중복없음)

        while (true) {
            if (count == 10) {
                break;
            } else {
                System.out.printf("Enter %dth number > ", count + 1);
                newnum = sc.nextInt();

                for (int i = 0; i < count; i++) {
                    if (newnum == number[i]) {
                        dup = true;
                        break;
                    } else {
                        dup = false;
                        continue;
                    }
                }

                if (dup == false) {
                    number[count] = newnum;
                    count++;
                } else {
                    System.out.println("Invalid input!");
                }
            }
        }
        return number;
    }

    void printResult(int[] number) {

        for (int i = 0; i < number.length; i++) {
            System.out.printf("%dth number is %d\n", i + 1, number[i]);
        }
    }
}