package StepI;

public class I03 {

    public static void main(String[] args) {

        I03 i03 = new I03();
        i03.run();
    }

    void run() {
        SubI03 i03 = new SubI03();
        for (int i = 0; i < 10; i++) {
            int height = 0;
            int weight = 0;

            System.out.print("Enter height(cm) and weight > ");
            height = i03.getHeight(height);
            weight = i03.getWeight(weight);

            i03.AskBiman(height, weight);
            System.out.println();
        }
    }
}
