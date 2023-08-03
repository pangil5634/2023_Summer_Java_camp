package StepK;

public class K01 {
    public static void main(String[] args) {
        K01 k01 = new K01();
        k01.run();

    }

    void run() {
        MenuPan menupan = new MenuPan();

        menupan.getData();
        System.out.println("================================================");
        menupan.printData();

    }
}
