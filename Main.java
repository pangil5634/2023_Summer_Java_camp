
class Main {
    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.g04();
    }

    void g04() {
        Subclass subclass = new Subclass();
        int money = 0;// 거래금액
        int charge = 0; // 중개 수수료
        int total_charge = 0; // 수수료 총액

        while (true) {
            int kind = subclass.getKind();

            if (kind == 0) {
                System.out.println("Total charge is " + total_charge);
                break;
            } else {
                money = subclass.getMoney();
                charge = subclass.getCharge(money, kind);
                total_charge += charge;
            }

            System.out.println();
        }
    }
}
