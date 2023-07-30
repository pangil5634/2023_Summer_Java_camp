package StepI;

import java.util.Scanner;

public class SubI01 {

    Scanner sc = new Scanner(System.in);

    // 사용자로부터 숫자 입력 받는 메소드
    int getNumber(int number) {

        System.out.print("1. pizza(15,000) 2. spaghetti(10,000) 3. salad(7,000) 4. drink(2,000) 5. exit > ");
        number = sc.nextInt();

        return number;
    }

    // 가격 출력하는 메소드
    int printPrice(int number, int total) {

        int price = 0;
        if (number == 1) {
            price = 15000;
        } else if (number == 2) {
            price = 10000;
        } else if (number == 3) {
            price = 7000;
        } else if (number == 4) {
            price = 2000;
        }

        total += price;
        System.out.println("Order price from now on is " + total);

        return total;
    }
}
