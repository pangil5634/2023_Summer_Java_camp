package StepH;

import java.util.Scanner;

public class H06 {

    public static void main(String[] args) {
        H06 stepH = new H06();
        stepH.h06();
    }

    Scanner sc = new Scanner(System.in);

    void h06() {
        H06Sub h06sub = new H06Sub();

        int number[] = new int[5]; // 입력받은 5개의 숫자 리스트

        number = h06sub.getNumber(number);

        int pow_value[][] = new int[5][5]; // 임의의 두 수 a, b로 만들 수 있는 a, b의 값 들, 5 * 5 리스트
        pow_value = h06sub.getCanNumber(pow_value, number);

        int max = 0, min = 0; // 최댓값과 최솟값

        max = h06sub.searchMax(pow_value, number);
        min = h06sub.searchMin(pow_value, number);
    }

}