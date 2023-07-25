package StepH;

import java.util.Scanner;

public class H02 {

    public static void main(String[] args) {
        H02 stepH = new H02();
        stepH.h02();
    }

    Scanner sc = new Scanner(System.in);

    void h02() {

        String onemore = "Y"; // 반복여부를 입력하는 문자 (Y/N)

        H02Sub h02sub = new H02Sub();
        while (true) {
            if (onemore.equals("Y") || onemore.equals("y"))
                h02sub.setLotto();
            else
                break;
            System.out.print("Do you want to generate more lotto numbers? (Y/N) > ");
            onemore = sc.next();
        }

    }

}