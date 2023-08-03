package StepK;

import java.util.Scanner;

public class Point {

    double x;
    double y;
    int[] areaList = new int[4];
    int count;

    int[] areaData;

    Scanner sc = new Scanner(System.in);

    int get_area(double x, double y) {
        int area = 0;

        if (x > 0) {
            if (y > 0) {
                area = 1;
                areaList[0]++;
            } else {
                area = 4;
                areaList[3]++;
            }
        } else {
            if (y > 0) {
                area = 2;
                areaList[1]++;
            } else {
                area = 3;
                areaList[2]++;
            }
        }
        return area;
    }

    void getData() {
        for (int i = 0; i < count; i++) {
            System.out.printf("Enter %dth coordinate (X, Y) > ", i + 1);
            x = sc.nextDouble();
            y = sc.nextDouble();
            areaData[i] = get_area(x, y);

        }
    }

    void printData() {
        for (int i = 0; i < 4; i++) {
            System.out.printf("Number of coordinates on %dth quadrants is %d\n", i + 1, areaList[i]);
        }
    }

    void getNumber() {
        System.out.print("Enter a number of coordinate > ");
        count = sc.nextInt();
        areaData = new int[count];
    }

    void printSentence() {
        for (int i = 0; i < areaData.length; i++) {
            if (areaData[i] == 1) {
                System.out.printf("%dth coordinate is located on first quadrants\n", i + 1);
            } else if (areaData[i] == 2) {
                System.out.printf("%dth coordinate is located on second quadrants\n", i + 1);
            } else if (areaData[i] == 3) {
                System.out.printf("%dth coordinate is located on third quadrants\n", i + 1);
            } else if (areaData[i] == 4) {
                System.out.printf("%dth coordinate is located on fourth quadrants\n", i + 1);
            }
        }
    }
}
