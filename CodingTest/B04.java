package CodingTest;

import java.util.Scanner;

class B04 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        B04 stepF = new B04();
        stepF.b04();
    }

    void b04() {
        B04Sub h04sub = new B04Sub();
        while (true) {
            String input; // 입력받는 문자열(사람들 간은 ### 로 구분, 이름과 성별은 |로 구분)

            System.out.print("=============================\nEnter string ('x' for exit) > ");
            input = sc.next();

            if (input.equals("x")) {
                System.out.println("Exit program");
                break;
            } else {
                h04sub.printSplitResult(input);

            }

        }
    }

}