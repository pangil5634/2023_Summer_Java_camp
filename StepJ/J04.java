package StepJ;

public class J04 {
    public static void main(String[] args) {
        J04 stepB = new J04();
        stepB.j04();
    }

    void j04() {
        SubJ04 subj04 = new SubJ04();
        int[] start = new int[2]; // 시작하는 월, 일
        int[] end = new int[2]; // 시작하는 월, 일

        System.out.print("Enter first day (month day) > ");
        start = subj04.getMonthDay(start);
        System.out.print("Enter second day (month day) > ");
        end = subj04.getMonthDay(end);

        subj04.printInputError(start);
        subj04.printInputError(end);

        if (subj04.printInputError(end) || subj04.printInputError(end)) {
            System.out.println("Invalid input!"); // 범위를 벗어나면 출력하는 결과 출력 구문
        } else {
            // 정상적으로 월과 일을 입력한 경우

            int day_count_start = subj04.CalcDate(start[0], start[1]); // 1년 중 날 수(시작)
            int day_count_end = subj04.CalcDate(end[0], end[1]); // 1년 중 날 수(끝))

            // 결과 출력 구문

            int betweenDays = 0;
            if (day_count_start > day_count_end) {
                betweenDays = day_count_start - day_count_end;
            } else if (day_count_end > day_count_start) {
                betweenDays = day_count_end - day_count_start;
            }
            System.out.printf("The interval between two dates is %d days.\n", betweenDays);

        }

    }
}