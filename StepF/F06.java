package StepF;

import java.util.Scanner;

class F06 {
    public static void main(String[] args) {
        F06 stepF = new F06();
        stepF.f06();
    }

    void f06() {

        int number[][] = new int[5][3]; // 각 집의 거주자 수, 층별, 호수별 중복 리스트
        int newnum = 0; // 입력받은 숫자
        int total = 0; // 아파트의 총 거주자 수
        int ho; // 아파트 호를 나타내는 변수
        int i, j; // 반복문 사용을 위한 변수

        Scanner sc = new Scanner(System.in);

        // 사용자로부터 입력 받기
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Enter number of people in room " + (i + 1) + "0" + (j + 1) + " > ");
                newnum = sc.nextInt();
                number[i][j] = newnum;
                total += newnum;
            }
        }

        // 결과 출력하기
        System.out.println("Number of people living in this apartment is " + total);
    }
}
