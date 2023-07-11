import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepB = new Main();
        stepB.b01();
    }

    void b01() {
        int birth_year; // 태어난 년도
        int age; // 나이

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter a birth year > "); // 입력을 위한 출력 구문
        birth_year = sc.nextInt(); // birth_year 변수에 사용자로부터 값 입력 받기

        age = 2023 - birth_year + 1; // 나이 계산

        ageResult(age); // ageResult 함수 호출

        sc.close(); // 스캐너 사용 해제
    }

    void ageResult(int age) { // 미성년자 판정 함수
        if (age < 20) // age가 20 미만인지 판단
            System.out.println("You are not adult"); // true
        else if (age >= 20) // age가 20 이상인지 판단
            System.out.println("You are adult"); // true
    }
}