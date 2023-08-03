package StepK;

public class K06 {
    public static void main(String[] args) {
        K06 k06 = new K06();
        k06.run();

    }

    void run() {
        UserInfo userinfo = new UserInfo();

        int students = 0;
        students = userinfo.getNumber();
        userinfo.input();
        userinfo.printLine();
        userinfo.print(students);

    }
}
