package StepK;

import java.util.Scanner;
import java.util.ArrayList;

class K07 {

    Scanner key = new Scanner(System.in);
    ArrayList<Student> arr = new ArrayList<Student>();

    public static void main(String[] args) {
        K07 stepK = new K07();
        stepK.k07();
    }

    void k07() {

        st.students = st.getNumber();
        input();
        st.printLine();
        print(st.students);
    }

    Scanner sc = new Scanner(System.in);
    Student st = new Student();

    // 입력받는 메소드
    public void input() {

        for (int i = 0; i < st.students; i++) {
            System.out.printf("Enter score of korean, english, math of %dth student > ", i + 1);
            st.score[i][0] = sc.nextInt();
            st.score[i][1] = sc.nextInt();
            st.score[i][2] = sc.nextInt();
        }
    }

    // 출력하는 메소드
    public void print(int index) {
        System.out.println("num     Korean  English Math    Total   Average Grade");
        for (int i = 0; i < index; i++) {
            // System.out.printf("%-8d%-8s%d\n", i + 1, st.id[i], st.pw[i]);
            int sum = st.score[i][0] + st.score[i][0] + st.score[i][0];
            double average = (double) sum / 3;

            System.out.printf("%-8d%-8d%-8d%-8d%-8d%-8.1f%s\n", i + 1, st.score[i][0], st.score[i][1], st.score[i][2],
                    sum,
                    average, st.grade(average));
        }

    }

    class Student {
        int[][] score;
        int students;
        Scanner sc = new Scanner(System.in);

        int getNumber() {
            System.out.print("Enter a number of students > ");
            students = sc.nextInt();
            score = new int[students][3];

            return students;
        }

        void printLine() {
            System.out.println("================================================");
            System.out.println("Registered " + students + " students list are as follows");
            System.out.println("------------------------------------------------");
        }

        String grade(double average) {
            if (average >= 95) {
                return "A+";

            } else if (average >= 90) {
                return "A0";
            } else if (average >= 85) {
                return "B+";
            } else if (average >= 80) {
                return "B0";
            } else if (average >= 75) {
                return "C+";
            } else if (average >= 70) {
                return "C0";
            } else if (average >= 65) {
                return "D+";
            } else if (average >= 60) {
                return "D0";
            } else {
                return "F";
            }
        }
    }
}
