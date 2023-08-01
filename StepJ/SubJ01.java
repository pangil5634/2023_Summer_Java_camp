package StepJ;

import java.util.Scanner;

public class SubJ01 {
    private int birth_year = 0; // 입력받은 태어난 년도
    private int[] age = new int[100]; // 각 사람들의 나이 (최대 100명)
    private int count_person = 0; // 입력된 인원 수
    private int count_baby; // 유아 수
    private int count_child = 0; // 어린이 수
    private int count_youth = 0; // 청소년 수
    private int count_young = 0; // 청년 수
    private int count_adult = 0; // 중년 수
    private int count_old = 0; // 노년 수
    private int i = 0; // 반복문을 위한 변수

    // 메인 메소드
    public void mainWhile() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (count_person == 100) {
                break;
            }
            System.out.printf("Enter a birth year of %dth person > ", i + 1);
            birth_year = sc.nextInt();

            if (birth_year > 2021) {
                break;
            }
            int area = AskAge(birth_year);
            age[i] = 2021 - birth_year + 1;
            System.out.printf("This person is %d years old.\n", age[i]);

            if (area == 0) {
                count_baby++;
            } else if (area == 1) {
                count_child++;
            } else if (area == 2) {
                count_youth++;
            } else if (area == 3) {
                count_young++;
            } else if (area == 4) {
                count_adult++;
            } else if (area == 5) {
                count_old++;
            }

            count_person++;
            i++;

        }
        sc.close();
    }

    // 태어난 년도에 따르 연령대 번호 리턴하는 메소드
    public int AskAge(int birthyear) {

        // 파라미터) birthyear : 태어난 년도
        // 리턴값) 계산한 나이에 따른 연령대 번호 (0.유아, 1.어린이, 2.청소년, 3.청년, 4.중년, 5.노년)

        int area = 0;

        int age = 2021 - birth_year + 1;

        if (age < 7) {
            area = 0;
        } else if (age < 13) {
            area = 1;
        } else if (age < 20) {
            area = 2;
        } else if (age < 30) {
            area = 3;
        } else if (age < 60) {
            area = 4;
        } else {
            area = 5;
        }

        return area;
    }

    // 결과 출력하는 메소드
    public void printResult() {
        System.out.printf("There are %d babys.\n", count_baby);
        System.out.printf("There are %d childs.\n", count_child);
        System.out.printf("There are %d youths.\n", count_youth);
        System.out.printf("There are %d youngs.\n", count_young);
        System.out.printf("There are %d adults.\n", count_adult);
        System.out.printf("There are %d olds.\n", count_old);
    }
}
