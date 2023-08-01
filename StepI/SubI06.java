package StepI;

import java.util.Scanner;

public class SubI06 {

    Scanner sc = new Scanner(System.in);

    byte GetRandom() {
        // 파라미터) 없음
        // 리턴 값) 임의로 만들어낸 숫자가 속하는 구간번호 0.대(70 이상), 1.중(40이상~70미만), 2.소(40미만)
        byte result = 0;
        int number = GetNumber();

        if (number >= 70) {
            result = 0;
        } else if (number >= 40) {
            result = 1;
        } else if (number < 40) {
            result = 2;
        }

        return result;
    }

    int GetNumber() {
        int number = (int) ((Math.random() * 100) + 1);
        System.out.println("Generated random number is " + number);

        return number;
    }

    void printResult(int Big, int Normal, int Small) {

        System.out.println("1. Big (>= 70) : " + Big);
        System.out.println("2. Normal (>= 40) : " + Normal);
        System.out.println("3. Small (< 40) : " + Small);
    }
}
