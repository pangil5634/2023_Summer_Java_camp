package StepK;

public class K03 {
    public static void main(String[] args) {
        K03 k03 = new K03();
        k03.run();

    }

    void run() {
        Point point = new Point();

        point.getData();
        System.out.println("================================================");
        System.out.println("Coordinate is located on first quadrants");
        point.printData();

    }
}
