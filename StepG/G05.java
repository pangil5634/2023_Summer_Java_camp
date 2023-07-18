package StepG;

class G05 {

    public static void main(String[] args) {
        G05 stepG = new G05();
        stepG.g05();
    }

    void g05() {
        G05Sub subclass = new G05Sub(); // 인스턴스 생성
        int total_charge = 0; // 이용료 총액

        while (true) {
            // 시간, 분 입력 받기
            subclass.getTime();

            // 기준에 맞게 출력하기
            if (subclass.getHour() == 0 && subclass.getMinute() == 0) {
                System.out.println("Your total charge is " + total_charge);
                break;
            } else {
                int charge = subclass.calculateCharge();
                System.out.println("Your charge is " + charge);
                total_charge += charge;
            }
            System.out.println();
        }

    }

}