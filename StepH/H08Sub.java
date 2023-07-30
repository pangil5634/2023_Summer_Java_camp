package StepH;

import java.util.Scanner;

public class H08Sub {

    Scanner sc = new Scanner(System.in);

    String getInput(String input) {
        System.out.print("=> Enter a sentence ('x' for exit) > ");
        input = sc.nextLine();
        return input;
    }

    String getFindStr(String findStr) {
        System.out.print("=> Enter a sentence to find > ");
        findStr = sc.nextLine();
        return findStr;
    }

    String getReplaceStr(String replaceStr) {
        System.out.print("=> Enter a sentence to replace > ");
        replaceStr = sc.nextLine();
        return replaceStr;

    }
}