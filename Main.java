import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepB = new Main();
        stepB.b09();
    }

    void b09() {

        int height, weight; // 신장(cm), 체중(kg)
        int bmi = 0; // 비만도 수치

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언;
        System.out.print("Enter height(cm) "); // 입력을 위한 출력 구문
        height = sc.nextInt(); // height 변수에 사용자로부터 값 입력 받기
        System.out.print("Enter weight(kg) "); // 입력을 위한 출력 구문
        weight = sc.nextInt(); // weight 변수에 사용자로부터 값 입력 받기

        bmi = weight / (height * height / 10000); // 값 계산

        if (bmi >= 25) { // 비만인지
            System.out.println("You are obesity"); // true
        } else {
            System.out.println("You are not obesity"); // false
        }

        sc.close(); // 스캐너 사용 해제;
    }
}