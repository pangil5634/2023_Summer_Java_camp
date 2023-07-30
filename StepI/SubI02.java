package StepI;

import java.util.Scanner;

public class SubI02 {

    Scanner sc = new Scanner(System.in);

    // 결과를 출력해주는 메소드
    void PrintCharWithBlank(int blanks, int size, char ch) {
        // 파라미터) blank : 빈칸의 개수, size : 출력할 문자의 개수, ch : 출력할 문자
        // 리턴 값) 없음
        // 수행내용) blanks 숫자만큼 빈칸 출력, size 개수만큼 ch 문자 출력 후 줄바꿈

        for (int i = 0; i < blanks; i++) {
            for (int j = 0; j < blanks + size - (i + 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // 별 길이 입력 받는 메소드
    int getblanks(int blanks) {
        System.out.print("Enter a height of right triangle and blank > ");
        blanks = sc.nextInt();
        return blanks;
    }

    // 공백 길이 입력 받는 메소드
    int getsize(int size) {
        size = sc.nextInt();
        return size;
    }

    // 작성할 글자 길이 입력 받는 메소드
    char getch(char ch) {
        System.out.print("Enter a character to draw triangle > ");
        String temp = sc.nextLine();
        ch = temp.charAt(0);
        return ch;
    }
}
