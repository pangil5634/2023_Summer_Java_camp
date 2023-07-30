package StepI;

public class I02 {

    public static void main(String[] args) {

        I02 i02 = new I02();
        i02.run();
    }

    void run() {

        int blanks = 0;
        int size = 0;
        char ch = 0;

        SubI02 subi02 = new SubI02();

        ch = subi02.getch(ch);
        blanks = subi02.getblanks(blanks);
        size = subi02.getsize(size);

        subi02.PrintCharWithBlank(blanks, size, ch);

    }
}
