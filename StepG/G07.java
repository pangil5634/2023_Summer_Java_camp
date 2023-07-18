package StepG;

class G07 {

    public static void main(String[] args) {
        G07 stepG = new G07();
        stepG.g07();
    }

    void g07() {
        G07Sub subclass = new G07Sub(); // 인스턴스 생성

        // 방문한 팀수 입력 받기
        int team_count = subclass.getTeamCount(); // 방문한 팀수

        System.out.println();

        // 메인 구문
        for (int i = 0; i < team_count; i++) {
            int[] count = new int[4]; // 입력받은 연령별 인원 수
            count = subclass.getCount(count, i); // 연령별 인원 수 입력받기

            int membership = 0; // 할인카드 종류(카드없음:0, 일반등급 카드 : 1, VIP 등급 카드 : 2)
            membership = subclass.getMembership(i);

            int sum; // 팀별 계산한 요금
            sum = subclass.calculateSum(count, membership);
            System.out.printf("Admission fees of %dth team is %d\n", i + 1, sum);

            System.out.println();

        }

        // 결과 출력
        subclass.printResult();

    }

}