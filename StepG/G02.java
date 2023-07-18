package StepG;

class G02 {

    public static void main(String[] args) {
        G02 stepG = new G02();
        stepG.g02();
    }

    void g02() {
        G02Sub subclass = new G02Sub(); // 인스턴스 생성
        double[] degress = new double[10]; // 온도 리스트

        // 사용자로부터 10개의 온도 수 입력 받기
        degress = subclass.getInputDegree(10);

        // 입력 받은 온도 정보 출력하기
        System.out.println();
        subclass.printDegress(degress);

        // 입력 받은 온도 별 온도 구간 개수 출력하기
        System.out.println();
        subclass.printDegreesType(degress);
    }

}