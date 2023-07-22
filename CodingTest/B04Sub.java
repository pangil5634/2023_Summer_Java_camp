package CodingTest;

public class B04Sub {

    void printSplitResult(String input) {
        String[] firstReuslt = input.split("###");
        System.out.printf("Total number of people is %d\n", firstReuslt.length);
        for (int i = 0; i < firstReuslt.length; i++) {
            firstReuslt[i] = firstReuslt[i].replace("|", " ");
            System.out.println((i + 1) + " " + firstReuslt[i]);
        }
    }
}