import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepD = new Main();
        stepD.d06();
    }

    void d06() {

        double m2_area = 0; // 면적 (제곱미터)
        double pyung_area = 0; // 면적 (평수)
        int count1 = 0; // 소형 아파트 개수
        int count2 = 0; // 중소형 아파트 개수
        int count3 = 0; // 중형 아파트 개수
        int count4 = 0; // 대형 아파트 개수
        int i = 0; // 반복문을 위한 변수

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        for (i = 1; i <= 10; i++) {
            System.out.print("Enter area of Apartment(m^2) > "); // 입력을 위한 출력 구문
            m2_area = sc.nextDouble(); // m2_area 변수에 사용자로부터 값 입력 받기
            pyung_area = m2_area / 3.305; // 면적(평수) 계산

            System.out.printf("Area of Apartment(pyung) %.1f\n", pyung_area); // 결과 출력 구문

            if (pyung_area < 15) { // 소형 아파트인지
                count1++;
            } else if (pyung_area < 30) { // 중소형 아파트인지
                count2++;
            } else if (pyung_area < 50) { // 중형 아파트인지
                count3++;
            } else { // 대형 아파트인지
                count4++;
            }
        }

        // 결과 출력 구문
        System.out.println("Count of small-sized apartment is " + count1);
        System.out.println("Count of small and medium-sized apartment is " + count2);
        System.out.println("Count of medium-sized apartment is " + count3);
        System.out.println("Count of big-sized apartment is " + count4);

        sc.close(); // 스캐너 사용 해제

    }
}