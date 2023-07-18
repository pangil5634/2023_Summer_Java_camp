package StepG;

class G03 {

    public static void main(String[] args) {
        G03 stepG = new G03();
        stepG.g03();
    }

    void g03() {
        G03Sub subclass = new G03Sub(); // 인스턴스 생성
        int[][] jumsu = new int[5][3]; // 3과목 점수, 총점을 저장하고 있는 중복 리스트

        // 5명의 학생의 점수 입력 받기
        jumsu = subclass.getScore(jumsu, 5);

        // 각 과목별 총점과 평균 점수 출력하기
        System.out.println();
        subclass.printSubject(jumsu);

        // 각 학생별 총점과 평균점수, 평균에 따른 등급 출력하기
        System.out.println();
        subclass.printStudent(jumsu);
    }
}
