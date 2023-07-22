class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.b02();
    }

    void b02() {
        H02Sub h01sub = new H02Sub();

        System.out.println("Enter a number from 1 to 100");
        int number[] = new int[10];// 사용자가 입력한 숫자 10개

        number = h01sub.getNumber(number);
        h01sub.printResult(number);
    }
}