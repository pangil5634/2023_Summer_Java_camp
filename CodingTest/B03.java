package CodingTest;

class B03 {
    public static void main(String[] args) {
        B03 stepE = new B03();
        stepE.b03();
    }

    void b03() {

        B03Sub subclass = new B03Sub();

        int[][] jumsu = new int[5][3]; // 3과목 점수, 총점을 저장하고 있는 중복 리스트
        double[] c_average = new double[3]; // 3과목 총점을 저장하고 있는 중복 리스트

        jumsu = subclass.setJumsu(jumsu);

        c_average = subclass.getAverage(c_average, jumsu);

        subclass.printResult(jumsu);

    }
}