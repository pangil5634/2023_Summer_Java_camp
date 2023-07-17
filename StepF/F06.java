package StepF;

import java.util.Scanner;

class F06 {
    public static void main(String[] args) {
        F06 stepF = new F06();
        stepF.f06();
    }

    void f06() {
        int height = 0, weight = 0; // 입력받은 신장(cm), 체중(kg)
        float bmi = 0; // 계산된 비만도 수치
        float bmilist[][] = new float[10][3]; // 10명에 대한 신장, 체중, 비만도수치를 담고 있는 리스트
        int count = 0; // 비만인 사람의 숫자
        int i; // 반복문을 위한 변수

        Scanner sc = new Scanner(System.in);

        // 10명의 신장, 체중 입력 받기
        for (i = 0; i < 10; i++) {
            System.out.print("Enter height(cm) and weight(kg) ");
            height = sc.nextInt();
            weight = sc.nextInt();

            bmi = ((float) weight / (height * height)) * 100 * 100;
            bmilist[i][0] = height;
            bmilist[i][1] = weight;
            bmilist[i][2] = bmi;

        }

        // 비만 판단하기
        for (i = 0; i < 10; i++) {
            if (bmilist[i][2] >= 25) {
                count++;
                System.out.printf("%dth person is obesity\n", i + 1);
            }

        }
        // 결과 출력하기
        System.out.println(count + " people is obesity");
    }
}
