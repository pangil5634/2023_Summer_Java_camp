package CodingTest;

class B01 {
    public static void main(String[] args) {
        B01 stepE = new B01();
        stepE.b01();
    }

    void b01() {

        B01Sub subclass = new B01Sub();

        int mode = 0; // 출력모드(1: 홀수단, 2: 짝수단)
        int column = 0; // 열 개수

        mode = subclass.getMode(mode);
        column = subclass.getColumn(column);

        if (mode == 1) {
            subclass.printOddMode(column);
        } else if (mode == 2) {
            subclass.printEvenMode(column);
        }

    }
}