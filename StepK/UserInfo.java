package StepK;

import java.util.Scanner;

public class UserInfo {

    String[] id;
    int[] pw;
    int students;
    Scanner sc = new Scanner(System.in);

    // 입력받는 메소드
    void input() {
        for (int i = 0; i < students; i++) {
            System.out.printf("Enter id, password of %dth student > ", i + 1);
            id[i] = sc.next();
            pw[i] = sc.nextInt();
        }
    }

    // 출력하는 메소드
    void print(int index) {
        System.out.println("num     name    password");
        for (int i = 0; i < index; i++) {
            System.out.printf("%-8d%-8s%d\n", i + 1, id[i], pw[i]);
        }

    }

    int getNumber() {
        System.out.print("Enter a number of students > ");
        students = sc.nextInt();
        id = new String[students];
        pw = new int[students];

        return students;
    }

    void printLine() {
        System.out.println("================================================");
        System.out.println("Registered " + students + " students list are as follows");
        System.out.println("------------------------------------------------");
    }
}
