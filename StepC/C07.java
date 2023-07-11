package StepC;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        C07 stepB = new C07();
        stepB.c07();
    }

    void c07() {
        int megabytes; // 용량(메가바이트 단위)
        long bytes; // 용량(바이트 단위)
        byte kind; // 전송방식 (1: Wi-Fi, 2: BlueTooth, 3: LTE, 4: USB)
        double time = 0; // 전송시간(초 단위)

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter file size as megabytes > "); // 입력을 위한 출력 구문
        megabytes = sc.nextInt(); // megabytes 변수에 사용자로부터 값 입력 받기

        bytes = megabytes * 1024 * 1024; // 값 계산

        System.out.print("Enter transfer method (1. WiFi, 2. Bluetooth, 3. LTE, 4. USB) > "); // 입력을 위한 출력 구문
        kind = sc.nextByte(); // kind 변수에 사용자로부터 값 입력 받기

        if (kind == 1) { // Wi-Fi
            time = bytes / 1500000.0; // 값 계산
        } else if (kind == 2) { // Bluetooth
            time = bytes / 300000.0; // 값 계산
        } else if (kind == 3) { // LTE
            time = bytes / 1000000.0; // 값 계산
        } else if (kind == 4) { // USB
            time = bytes / 60000000.0; // 값 계산
        }

        System.out.printf("File transfer time is %.1f\n", time); // 결과 출력 구문
        sc.close(); // 스캐너 사용 해제

    }
}