package BaekJoon;

import java.util.Scanner;

public class P2490 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        P2490 main = new P2490();

        main.run();
    }

    void run() {

        for (int i = 0; i < 3; i++) {
            int input[] = new int[4]; // 입력을 받을 배열 변수
            input = getInput(input); // 사용자로부터 입력 받기

            printResult(input);
        }
    }

    // 사용자로부터 입력을 받는 메소드
    int[] getInput(int[] input) {

        // 4개의 숫자 입력 받기
        input[0] = sc.nextInt(); // 첫 번째 값
        input[1] = sc.nextInt(); // 두 번째 값
        input[2] = sc.nextInt(); // 세 번째 값
        input[3] = sc.nextInt(); // 네 번째 값
        return input;
    }

    // 도를 출력하는 메소드
    void printResult(int[] input) {
        int back = 0; // '배'의 개수를 저장하는 변수
        int front = 0; // '등'의 개수를 저장하는 변수

        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                back++;
            } else if (input[i] == 1) {
                front++;
            }
        }

        // '배'와 '등'의 개수에 따라 결과 출력
        if (back == 1) {
            System.out.println("A"); // 도
        } else if (back == 2) {
            System.out.println("B"); // 개
        } else if (back == 3) {
            System.out.println("C"); // 걸
        } else if (back == 4) {
            System.out.println("D"); // 윷
        } else if (front == 4) {
            System.out.println("E"); // 모
        }
    }
}
