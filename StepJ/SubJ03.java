package StepJ;

import java.util.Scanner;

public class SubJ03 {
    Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

    // count 수 만큼 온도 입력 받는 메소드
    public double[] getInputDegree(int count) {

        double[] degress = new double[count]; // 온도 리스트
        double input_degree = 0.0; // 입력받은 온도

        for (int i = 0; i < count; i++) {
            System.out.printf("Enter %dth water temperature > ", i + 1); // 입력을 위한 출력 구문
            input_degree = sc.nextDouble(); // 사용자로부터 온도 입력 받기
            degress[i] = input_degree; // 입력받은 온도를 저장
        }

        return degress; // 온도 저장된 배열 반환
    }

    // 온도 정보 출력하는 메소드
    public void printDegress(double[] degress) {
        for (int i = 0; i < degress.length; i++) {
            if (degress[i] < 0) {

            } else if (degress[i] < 25) {
                System.out.printf("%dth water temperature is %.1f cold water\n", i + 1,
                        degress[i]); // 결과 출력 구문
            } else if (degress[i] < 40) {
                System.out.printf("%dth water temperature is %.1f warm water\n", i + 1,
                        degress[i]); // 결과 출력 구문
            } else if (degress[i] < 80) {
                System.out.printf("%dth water temperature is %.1f hot water\n", i + 1,
                        degress[i]); // 결과 출력 구문
            } else if (degress[i] >= 80) {
                System.out.printf("%dth water temperature is %.1f boiling water\n", i + 1,
                        degress[i]); // 결과 출력 구문
            }
        }
    }

    // 온도 구간 별 개수 출력 메소드
    public void printDegreesType(double[] degress) {
        // String[] degree_name = { "냉수", "미온수", "온수", "끓는물" };
        // String[] degree_name = { "cold", "warm", "hot", "boiling" };
        int[] count = { 0, 0, 0, 0 }; // 입력 횟수 목록 (순서대로 냉수 입력 횟수, 미온수 입력 횟수, 온수 입력 횟수, 끓는 물 입력 횟수)

        // 온도 비교 후 온도 구간 별 개수 증가
        for (int i = 0; i < degress.length; i++) {
            byte area = AskWater(degress[i]);

            if (area == 0) {
                count[0]++; // 냉수 개수 증가
            } else if (area == 1) {
                count[1]++; // 미온수 개수 증가
            } else if (area == 2) {
                count[2]++; // 온수 개수 증가
            } else if (area == 3) {
                count[3]++; // 끓는 물 개수 증가
            }
        }

        // 결과 출력
        System.out.println("Count of cold water is " + count[0]);
        System.out.println("Count of warm water is " + count[1]);
        System.out.println("Count of hot water is " + count[2]);
        System.out.println("Count of boiling water is " + count[3]);

    }

    public byte AskWater(double degree) {

        // 파라미터) degree: 온도
        // 리턴 값) 온도 판정 번호 (0.냉수, 1.미온수, 2.온수, 3.끓는 물)

        byte area = 0;
        if (degree < 0) {
        } else if (degree < 25) {
            area = 0;// 냉수 개수 증가
        } else if (degree < 40) {
            area = 1;// 미온수 개수 증가
        } else if (degree < 80) {
            area = 2;// 온수 개수 증가
        } else if (degree >= 80) {
            area = 3; // 끓는 물 개수 증가
        }
        return area;
    }
}
