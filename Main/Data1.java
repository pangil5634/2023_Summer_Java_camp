package Main;

import java.util.Scanner;

public class Data1 {
    private int birth_year = 0; // 입력받은 태어난 년도
    private int[] age = new int[100]; // 각 사람들의 나이 (최대 100명)
    private int count_person = 0; // 입력된 인원 수
    private int count_baby; // 유아 수
    private int count_child = 0; // 어린이 수
    private int count_youth = 0; // 청소년 수
    private int count_young = 0; // 청년 수
    private int count_adult = 0; // 중년 수
    private int count_old = 0; // 노년 수
    private int i = 0; // 반복문을 위한 변수

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public int[] getAge() {
        return age;
    }

    public void setAge(int[] age) {
        this.age = age;
    }

    public int getCount_person() {
        return count_person;
    }

    public void setCount_person(int count_person) {
        this.count_person = count_person;
    }

    public int getCount_baby() {
        return count_baby;
    }

    public void setCount_baby(int count_baby) {
        this.count_baby = count_baby;
    }

    public int getCount_child() {
        return count_child;
    }

    public void setCount_child(int count_child) {
        this.count_child = count_child;
    }

    public int getCount_youth() {
        return count_youth;
    }

    public void setCount_youth(int count_youth) {
        this.count_youth = count_youth;
    }

    public int getCount_young() {
        return count_young;
    }

    public void setCount_young(int count_young) {
        this.count_young = count_young;
    }

    public int getCount_adult() {
        return count_adult;
    }

    public void setCount_adult(int count_adult) {
        this.count_adult = count_adult;
    }

    public int getCount_old() {
        return count_old;
    }

    public void setCount_old(int count_old) {
        this.count_old = count_old;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void mainWhile() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("Enter a birth year of %dth person > ", i + 1);
            birth_year = sc.nextInt();
            if (birth_year > 2023) {
                break;
            }
            age[i] = 2023 - birth_year + 1;
            if (age[i] < 7) {
                count_baby++;
            } else if (age[i] < 13) {
                count_child++;
            } else if (age[i] < 20) {
                count_youth++;
            } else if (age[i] < 30) {
                count_young++;
            } else if (age[i] < 60) {
                count_adult++;
            } else {
                count_old++;
            }
            count_person++;
            i++;
        }
        sc.close();
    }

    public void printAge() {
        for (i = 0; i < count_person; i++) {
            System.out.printf("%dth person are %d years old.\n", i + 1, age[i]);
        }
    }

    public void printResult() {
        System.out.printf("There are %d babys.\n", count_baby);
        System.out.printf("There are %d childs.\n", count_child);
        System.out.printf("There are %d youths.\n", count_youth);
        System.out.printf("There are %d youngs.\n", count_young);
        System.out.printf("There are %d adults.\n", count_adult);
        System.out.printf("There are %d olds.\n", count_old);
    }
}
