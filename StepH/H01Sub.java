package StepH;

import java.util.Scanner;

public class H01Sub {

    Scanner sc = new Scanner(System.in);

    // 랜덤 숫자 구하는 메소드
    int setRandomNumber(int answer) {
        answer = (int) ((Math.random() * 100) + 1);
        return answer;
    }

    // 사용자로부터 값 입력 받는 메소드
    int getNumberTry(int number_try) {

        System.out.print("Guess the number from 1 to 100 > ");
        number_try = sc.nextInt();
        return number_try;
    }

    // 사용자가 입력한 값과 랜덤값과 비교하는 메소드
    int compareNumber(int number_try, int answer) {

        if (number_try > answer) {
            System.out.println("Down!");
            return 0; // Down
        } else if (number_try == answer) {
            return 1; // Same
        } else if (number_try < answer) {
            System.out.println("Up!");
            return 2; // Up
        }

        return -1; // error
    }

}