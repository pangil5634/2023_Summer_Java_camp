package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2693 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        P2693 main = new P2693();

        main.run();
    }

    void run() {
        int count = 0; // 반복할 횟수를 저장하는 변수
        count = sc.nextInt();

        // count 횟수 만큼 10개의 데이터 입력 받기
        for (int i = 0; i < count; i++) {
            int[] input = new int[10];
            input = getNumber(input);
            printThreeNumber(input);
        }
    }

    // 10개의 숫자를 입력 받는 메소드
    int[] getNumber(int[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    // 3번째로 큰 수를 출력하는 메소드
    void printThreeNumber(int[] input) {

        Arrays.sort(input);
        System.out.println(input[7]);

    }
}
