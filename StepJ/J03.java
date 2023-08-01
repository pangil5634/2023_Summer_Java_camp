package StepJ;

class J03 {

    public static void main(String[] args) {
        J03 stepJ = new J03();
        stepJ.j03();
    }

    void j03() {
        SubJ03 subclass = new SubJ03(); // 인스턴스 생성

        double[] degress = new double[10]; // 온도 리스트

        // 사용자로부터 10개의 온도 수 입력 받기
        degress = subclass.getInputDegree(10);

        // 입력 받은 온도 정보 출력하기
        subclass.printDegress(degress);

        // 입력 받은 온도 별 온도 구간 개수 출력하기
        subclass.printDegreesType(degress);
    }

}