package StepG;

import java.util.Scanner;

public class G06Sub {
    Scanner sc = new Scanner(System.in);

    // 인트로 출력하는 메소드
    public void printIntro() {
        System.out.println("There are three type of products");
        System.out.println("(1. Leather gloves, 2. Wool gloves, 3. Vinyl gloves)\n");
    }

    // 주문 입력 받는 메소드
    public int[] getOrder() {
        int[] order = { 0, 0, 0 }; // 입력받는 구매 제품 개수 리스트 [가죽장갑, 털장갑, 비닐장갑]
        System.out.print("How many first products do you want to buy? > ");
        order[0] = sc.nextInt();
        System.out.print("How many second products do you want to buy? > ");
        order[1] = sc.nextInt();
        System.out.print("How many third products do you want to buy? > ");
        order[2] = sc.nextInt();

        return order;

    }

    // 판매 금액 구하는 메소드
    public int calculateSale(int[] order) {
        int sale = 0; // 계산한 판매 금액
        int[] price = { 10000, 6000, 3000 }; // 제품별 가격

        for (int i = 0; i < order.length; i++) {
            sale += order[i] * price[i];
        }
        return sale;
    }

    // 총 판매 제품 리스트에 더하는 메소드
    public int[] addOrder(int[] order, int[] total_order) {

        for (int i = 0; i < total_order.length; i++) {
            total_order[i] += order[i];
        }
        return total_order;
    }
}