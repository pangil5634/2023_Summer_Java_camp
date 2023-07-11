import java.util.Scanner;

class Main {
    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Main stepB = new Main();
        stepB.b05();
    }

    void b05() {

        int days; // 날 수
        int seconds; // 초 단위 시간
        int m_count;
        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter number of days > "); // 입력을 위한 출력 구문
        days = sc.nextInt(); // days 변수에 사용자로부터 값 입력 받기

        seconds = days * 24 * 60 * 60;// 값 계산
        m_count = seconds / 1000000; // 100만 초 포함 횟수 계산

        System.out.println("Total seconds is " + seconds); // 결과 출력 구문

        checkMillion(m_count); // 100만 초 넘는 경우 출력 함수 호출
        sc.close(); // 스캐너 사용 해제

    }

    void checkMillion(int m_count) {
        if (m_count != 0) { // 100만 초 넘는 경우가 존재하는 경우
            System.out.printf("It includes million seconds %d times\n", m_count); // true
        }
    }
}