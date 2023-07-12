import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepD = new Main();
        stepD.d09();
    }

    void d09() {
        int dan = 0; // 출력하려는 구구단의 단 수
        int i = 0; // 반복문을 위한 변수
        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        while (true) {
            System.out.print("Enter number of gugudan(2~9) > "); // 입력을 위한 출력 구문
            dan = sc.nextInt(); // dan 변수에 사용자로부터 값 입력 받기
            if (dan < 2 || dan > 9) { // 범위 2~9사이의 값이 아닌지
                System.out.println("Invalid input"); // 결과 출력 구문
                continue;
            } else { // 값이면
                for (i = 1; i < 10; i++) { // 해당 단의 결과 출력
                    System.out.printf("%d X %d = %d\n", dan, i, dan * i); // 결과 출력 구문
                }
                break; // 종료
            }
        }

        sc.close(); // 스캐너 사용 해제
    }
}