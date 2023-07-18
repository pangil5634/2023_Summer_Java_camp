package StepG;

import java.util.Scanner;

public class G05Sub {
    Scanner sc = new Scanner(System.in);
    private int hour = 1; // 시간
    private int minute = 1;// 분

    // Encapsulation
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    // 사용자로부터 시간과 분을 입력 받는 메소드
    public void getTime() {

        System.out.print("Enter hours and minutes of use > ");
        hour = sc.nextInt();
        minute = sc.nextInt();
    }

    // 이용료 계산하는 메소드
    public int calculateCharge() {
        int charge = caclculateMoney(); // 이용료
        int discount = 0; // 할인 금액
        if ((hour == 2 && minute >= 0) && (hour == 2 && minute <= 59)) {
            discount = charge / 100 * 5;
        } else if ((hour >= 3 && minute >= 0) && (hour <= 4 && minute <= 59)) {
            discount = charge / 10;
        } else if (hour >= 5 && minute >= 0) {
            discount = charge / 10 * 2;
        }
        charge -= discount;

        return charge;
    }

    // 할인 전 이용료 금액 계산하는 메소드
    public int caclculateMoney() {
        int charge = 0;

        charge = hour * 2000;
        if (minute != 0) {
            if (minute / 30 == 0 || minute % 30 == 0) {
                charge += 1000;
            } else if (minute / 30 == 1) {
                charge += 2000;
            }
        }

        return charge;
    }

}
