import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepE = new Main();
        stepE.e06();
    }

    void e06() {
        int rows, columns; // 행의 개수, 열의 개수
        int number = 1; // 각 칸에 출력하는 값
        int i, j; // 반복문 사용을 위한 변수

        Scanner sc = new Scanner(System.in);

        // 행, 열 개수 입력 받기
        System.out.print("Enter a rows and columns >");
        rows = sc.nextInt();
        columns = sc.nextInt();

        for (i = 1; i <= columns; i++) {
            for (j = 1; j <= rows; j++) {
                number = i * j;
                // if (number == 1) { //
                // System.out.printf("%3d", number); //
                // } else //
                System.out.printf("%4d", number);
                number++;
            }
            System.out.println();
        }

        sc.close();

    }
}