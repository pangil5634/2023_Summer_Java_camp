package StepG;

class G06 {

    public static void main(String[] args) {
        G06 stepG = new G06();
        stepG.g06();
    }

    void g06() {
        G06Sub subclass = new G06Sub(); // 인스턴스 생성

        int total_sale = 0; // 총 매출액 총액
        int[] total_order = { 0, 0, 0 }; // 총 판매 개수 리스트 [가죽장갑, 털장갑, 비닐장갑]

        // 인트로 구문 출력
        subclass.printIntro();

        // 메인 출력
        while (true) {
            int[] order = { 0, 0, 0 }; // 입력받는 구매 제품 개수 리스트 [가죽장갑, 털장갑, 비닐장갑]
            order = subclass.getOrder();
            if (order[0] == 0 && order[1] == 0 && order[2] == 0) {
                System.out.println("Total price from now on is " + total_sale); // 총 매출액 출력하기
                break;
            } else {
                int sale = subclass.calculateSale(order); // 계산한 판매 금액 구하기
                total_order = subclass.addOrder(order, total_order); // 총 구매 제품 개수 리스트에 더하기

                System.out.println("The price is " + sale); // 판매금액 출력하기
                total_sale += sale; // 총 매출액에 더하기
                System.out.println();
            }
        }

        // 총 주문 개수 출력
        // for (int i = 0; i < total_order.length; i++)
        // System.out.printf("total_order[%d] : %d\n", i + 1, total_order[i]);
    }
}