package StepB;

import java.util.Scanner;

public class B07 {
    public static void main(String[] args) {
        B07 stepB = new B07();
        stepB.b07();
    }

    void b07() {
        int megabytes; // 용량(메가바이트 단위)
        long bytes; // 용량(바이트 단위)
        String usb2; // USB 2.0 사용여부 (Y: 예, N: 아니요)
        int time = 0; // 전송시간(초 단위)

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter file size as megabytes > "); // 입력을 위한 출력 구문
        megabytes = sc.nextInt(); // megabytes 변수에 사용자로부터 값 입력 받기

        bytes = megabytes * 1024 * 1024; // 값 계산

        System.out.print("Enter 'Y' if USB type is 2.0 or 'N' > "); // 입력을 위한 출력 구문
        usb2 = sc.next(); // usb2 변수에 사용자로부터 값 입력 받기

        if (usb2.equals("Y")) { // usb2값이 Y인지
            time = (int) (bytes / 60000000); // 값 계산
        } else if (usb2.equals("N")) { // usb2값이 N인지
            time = (int) bytes / 1500000; // 값 계산
        }

        System.out.println("File transfer time is " + time); // 결과 출력 구문
        sc.close(); // 스캐너 사용 해제

    }
}
