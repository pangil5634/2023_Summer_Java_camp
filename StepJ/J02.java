package StepJ;

class J02 {

    public static void main(String[] args) {
        J02 stepG = new J02();
        stepG.j02();
    }

    void j02() {
        SubJ02 subj02 = new SubJ02();

        double Min, Max, average = 0.0;
        double[] num = new double[10];

        num = subj02.getNumber(num);
        Max = subj02.Max(num);
        Min = subj02.Min(num);

        average = subj02.average(num, Max, Min, average);
    }

}