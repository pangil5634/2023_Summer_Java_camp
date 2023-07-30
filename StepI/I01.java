package StepI;

public class I01 {

    public static void main(String[] args) {

        I01 i01 = new I01();

        i01.ShowMenu();
    }

    // 실행 함수
    void ShowMenu() {
        SubI01 subi01 = new SubI01();
        int total = 0;
        while (true) {
            int number = 0;
            number = subi01.getNumber(number);
            if (number == 5) {
                System.out.println("Total price is " + total);
                break;
            }
            total = subi01.printPrice(number, total);
            System.out.println();
        }
    }
}
