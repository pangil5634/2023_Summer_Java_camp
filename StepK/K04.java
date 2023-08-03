package StepK;

public class K04 {
    public static void main(String[] args) {
        K04 k04 = new K04();
        k04.run();

    }

    void run() {
        Point point = new Point();

        point.getNumber();
        point.getData();
        System.out.println("================================================");
        point.printSentence();

        System.out.println();
        point.printData();

    }
}
