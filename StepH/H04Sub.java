package StepH;

import java.util.Scanner;

public class H04Sub {

    Scanner sc = new Scanner(System.in);

    int getUser(int my_finger) {
        System.out.print("Enter Scissors(1) Rock(2) Paper(3) > ");
        my_finger = sc.nextInt();
        return my_finger;
    }

    int getCompu(int com_finger) {
        com_finger = (int) ((Math.random() * 3) + 1);
        return com_finger;
    }

    int[][] compareResult(int my_finger, int com_finger, int[][] score) {

        if (com_finger == 1) {
            System.out.print("What the computer has given out is Scissors ---> ");
        } else if (com_finger == 2) {
            System.out.print("What the computer has given out is Rock ---> ");
        } else if (com_finger == 3) {
            System.out.print("What the computer has given out is Paper ---> ");
        }
        if (my_finger == com_finger) {
            System.out.print("Draw!\n");
            score[0][1]++;
            score[1][1]++;
        } else if (my_finger == 1) {
            if (com_finger == 2) {
                System.out.print("Computer win..\n");
                score[0][0]++;
                score[1][2]++;
            } else if (com_finger == 3) {
                System.out.print("You win!\n");
                score[0][2]++;
                score[1][0]++;
            }

        } else if (my_finger == 2) {
            if (com_finger == 1) {
                System.out.print("You win!\n");
                score[0][2]++;
                score[1][0]++;
            } else if (com_finger == 3) {
                System.out.print("Computer win..\n");
                score[0][0]++;
                score[1][2]++;
            }

        } else if (my_finger == 3) {
            if (com_finger == 1) {
                System.out.print("Computer win..\n");
                score[0][0]++;
                score[1][2]++;
            } else if (com_finger == 2) {
                System.out.print("You win!\n");
                score[0][2]++;
                score[1][0]++;
            }

        }
        return score;
    }

    void printResult(int[][] score) {
        System.out.printf("Computer : win - %d, lost - %d, draw - %d\n", score[0][0], score[0][2], score[0][1]);
        System.out.printf("User : win - %d, lost - %d, draw - %d\n", score[1][0], score[1][2], score[1][1]);
    }
}