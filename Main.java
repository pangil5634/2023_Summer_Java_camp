import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f08();
    }

    void f08() {
        int number[] = new int[10];// 사용자가 입력한 숫자 10개
        int newnum; // 입력받은 숫자
        int count = 0; // 현재까지 입력된 숫자의 개수(0~10)
        boolean dup = false; // 중복검사 통과 여부 (true : 중복, false : 중복없음)
        int i = 0; // 반복문을 위한 변수

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 100");

        // 숫자 10개 입력 받기
        while (count < 10) {
            System.out.printf("Enter %dth number > ", count + 1);
            newnum = sc.nextInt();
            dup = false;
            i = 0;
            while (i < count) {
                if (newnum == number[i]) {
                    dup = true;
                    break;
                }
                i++;
            }

            // 예외 처리
            if (dup == true) {
                System.out.println("Invalid input!");
            } else {
                number[i] = newnum;
                count++;
            }
        }
        // 결과 출력
        for (i = 0; i < 10; i++)
            System.out.println((i + 1) + "th number is " + number[i]);
        sc.close();

    }
}