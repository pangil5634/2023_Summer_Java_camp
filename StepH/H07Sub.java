package StepH;

import java.util.Scanner;

public class H07Sub {

    Scanner sc = new Scanner(System.in);

    String getString(String input) {

        System.out.print("=> Enter a sentence ('x' for exit) > ");
        input = sc.nextLine();
        return input;
    }

    void printWorld(String input) {
        System.out.println("=> Number of character is " + input.length());
    }
}