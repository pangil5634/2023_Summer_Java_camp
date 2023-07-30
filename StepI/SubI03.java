package StepI;

import java.util.Scanner;

public class SubI03 {

    Scanner sc = new Scanner(System.in);

    void AskBiman(int height, int weight) {
        // 파라미터) height : 신장(cm), weight : 체중(kg)
        // 리턴 값) 없음
        // 수행내용) 비만도 계산 후 판정결과 출력

        double bmi = (double) weight / (height * height) * 10000;
        if (bmi < 18.5) {
            System.out.println("You are low weight");
        } else if (bmi < 23) {
            System.out.println("You are normal weight");
        } else if (bmi < 25) {
            System.out.println("You are obesity");
        } else if (bmi < 30) {
            System.out.println("You are obesity");
        } else {
            System.out.println("You are high obesity");
        }

    }

    int getHeight(int height) {
        height = sc.nextInt();
        return height;
    }

    int getWeight(int weight) {

        weight = sc.nextInt();
        return weight;
    }

}
