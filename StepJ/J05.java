package StepJ;

public class J05 {
    public static void main(String[] args) {
        J05 stepB = new J05();
        stepB.j05();
    }

    void j05() {
        SubJ05 subj05 = new SubJ05();
        int count = 0;
        int account = 0;
        int total = 0;
        while (true) {

            System.out.printf("Enter parking start time of %dth car (H M) > ", count + 1);
            int[] start = new int[2];
            start = subj05.getTime(start);

            System.out.printf("Enter parking end time of %dth car (H M) > ", count + 1);
            int[] end = new int[2];
            end = subj05.getTime(end);

            count++;

            account = subj05.CalcParking(start[0], start[1], end[0], end[1]);
            System.out.println("Parking price : " + account);

            total += account;

            char more = 'Y';
            more = subj05.getMore(more);
            if (more == 'N') {
                System.out.printf("Total price for %d cars is %d\n", count, total);
                break;
            }

        }
    }
}