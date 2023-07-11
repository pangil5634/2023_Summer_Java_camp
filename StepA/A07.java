package StepA;

import java.util.Scanner;

class A07 {
    public static void main(String[] args) {
        A07 stepA = new A07();
        stepA.a07();
    }

    void a07() {
        int gigabytes; // 용량(기가바이트 단위)
        int megabytes; // 용량(메가바이트 단위)
        int kilobytes; // 용량(킬로바이트 단위)
        long bytes; // 용량(바이트 단위)

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter file size as gigabytes > "); // 입력을 위한 출력 구문

        gigabytes = sc.nextInt(); // gigabytes 변수에 사용자로부터 값 입력 받기

        megabytes = gigabytes * 1024; // 값 계산
        kilobytes = megabytes * 1024; // 값 계산
        bytes = (long) kilobytes * 1024; // 값 계산

        System.out.println("Your file size is"); // 결과 출력 구문
        System.out.println(megabytes + " MB"); // 결과 출력 구문
        System.out.println(kilobytes + " KB"); // 결과 출력 구문
        System.out.println(bytes + " B"); // 결과 출력 구문

        sc.close(); // 스캐너 사용 해제
    }
}
