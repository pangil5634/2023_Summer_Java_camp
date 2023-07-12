import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepD = new Main();
        stepD.d01();
    }

    void d01() {

        int number; // 입력받은 수
        int totalsum = 0; // 1부터 더한 계산 결과 값
        int i = 1; // 반복문 사용을 위한 변수
        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter a number > ");
        number = sc.nextInt();

        if (number <= 1) {
            System.out.println("Invalid input");
        } else {
            for (i = 1; i <= number; i++) {
                totalsum += i;
            }
            System.out.println("The sum of all integer from 1 to the number entered is " + totalsum);
        }

        sc.close(); // 스캐너 사용 해제
    }
}