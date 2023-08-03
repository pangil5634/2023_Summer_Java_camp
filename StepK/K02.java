package StepK;

public class K02 {
    public static void main(String[] args) {
        K02 k02 = new K02();
        k02.run();

    }

    void run() {
        MenuPan menupan = new MenuPan();

        menupan.getNumber();
        menupan.getData();
        System.out.println("================================================");
        menupan.printData();

    }
}
