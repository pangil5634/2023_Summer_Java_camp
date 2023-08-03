package StepK;

public class K05 {
    public static void main(String[] args) {
        K05 k05 = new K05();
        k05.run();

    }

    void run() {
        UserInfo userinfo = new UserInfo();

        userinfo.input();

        System.out.println("================================================");
        System.out.println("Registered students list are as follows");
        System.out.println("------------------------------------------------");
        userinfo.print(1);

    }
}
