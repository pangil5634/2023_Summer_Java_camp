package StepF;

import java.util.Scanner;

class F07 {
    public static void main(String[] args) {
        F07 stepF = new F07();
        stepF.f07();
    }

    void f07() {

        int number[][] = new int[5][3]; // 각 집의 거주자 수, 층별, 호수별 중복 리스트
        int newnum = 0; // 입력받은 숫자
        int floor_total[] = new int[5]; // 층별 거주자 합계 리스트 (1층, 2층, 3층, 4층, 5층)
        int line_total[] = new int[3]; // 호수별 거주자 합계 리스트 (1호라인, 2호라인, 3호라인)
        int total = 0; // 아파트의 총 거주자 수
        int ho = 0; // 아파트 호를 나타내는 변수
        int i, j; // 반복문 사용을 위한 변수

        Scanner sc = new Scanner(System.in);

        // 사용자로부터 입력 받기
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Enter number of people in room " + (i + 1) + "0" + (j + 1) + " > ");
                newnum = sc.nextInt();
                number[i][j] = newnum;
                total += newnum;
                floor_total[i] += newnum;

                if (j == 0) {
                    line_total[0] += newnum;
                } else if (j == 1) {
                    line_total[1] += newnum;
                } else if (j == 2) {
                    line_total[2] += newnum;
                }
            }
        }

        // 층별 거주자 출력
        for (i = 0; i < 5; i++) {
            System.out.printf("Number of people living in %d floor is %d\n", i + 1, floor_total[i]);
        }
        System.out.println();

        // 호수별 거주자 출력
        for (i = 0; i < 3; i++) {
            System.out.printf("Number of people living in %d line is %d\n", i + 1, line_total[i]);
        }
        System.out.println();

        // 결과 출력하기
        System.out.println("Number of people living in this apartment is " + total);
    }
}
