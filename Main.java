import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Main main = new Main();

        main.run();
    }

    void run() {
        int[] startEnd = new int[2]; // 시작과 끝을 저장하고 있는 배열 변수
        getStartEndNumber(startEnd); // 시작과 끝

        int total = 0; // 합계 변수
        total = calculateTotal(startEnd, total);

        // 결과 출력
        System.out.println(total);
    }

    // 시작과 끝을 입력 받고 출력하는 메소드
    int[] getStartEndNumber(int[] startEnd) {
        startEnd[0] = sc.nextInt(); // 시작 값 받기
        startEnd[1] = sc.nextInt(); // 끝 값 받기

        return startEnd;
    }

    // 합계를 계산하는 메소드
    int calculateTotal(int[] startEnd, int total) {
        // 합계 계산
        for (int i = startEnd[0] + 1; i < startEnd[1]; i++) {
            total += i;
        }

        return total;
    }
}
