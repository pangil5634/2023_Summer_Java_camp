package StepD;

import java.util.Scanner;

public class D05 {
    public static void main(String[] args) {
        D05 stepB = new D05();
        stepB.d05();
    }

    void d05() {
        int width = 1, height = 1; // 가로크기, 세로크기
        int count1 = 0; // "정사각형"의 개수
        int count2 = 0; // "좌우로 길쭉한 직사각형"의 개수
        int count3 = 0; // "위아래로 길쭉한 직사각형"의 개수
        int count4 = 0; // "일반적인 가로형 직사각형"의 개수
        int count5 = 0; // "일반적인 세로형 직사각형"의 개수

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        while (true) {
            System.out.print("Enter width, height of Rectangle > "); // 입력을 위한 출력 구문
            width = sc.nextInt(); // width 변수에 사용자로부터 값 입력 받기
            height = sc.nextInt(); // height 변수에 사용자로부터 값 입력 받기
            if (width <= 0 || height <= 0) { // width 혹은 height 값이 이하일 경우
                break;
            } else {
                if (width == height) { // "정사각형"의 개수
                    count1++;
                } else if (width >= height * 2) { // "좌우로 길쭉한 직사각형"의 개수
                    count2++;
                } else if (height >= width * 2) { // "위아래로 길쭉한 직사각형"의 개수
                    count3++;
                } else if (width > height) { // "일반적인 가로형 직사각형"의 개수
                    count4++;
                } else if (height > width) { // "일반적인 세로형 직사각형"의 개수
                    count5++;
                }
            }
        }

        // 결과 출력 구문
        System.out.println("Count of square is " + count1);
        System.out.println("Count of an oblong rectangle from side to side is " + count2);
        System.out.println("Count of an oblong rectangle from top to bottom is " + count3);
        System.out.println("Count of a horizontal rectangle is " + count4);
        System.out.println("Count of a vertical rectangle is " + count5);

        sc.close(); // 스캐너 사용 해제

    }
}