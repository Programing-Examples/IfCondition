package main.java.com.company;

public class Main {

    public static void main(String[] args) {
        int x = 9;
        int y = 15;

        if (x == 9) {
            System.out.println("X is equals to 9");
        }

        if (x <= 9) {
            System.out.println("X is also less or equals to 9");
        }

        if (x != 10) {
            System.out.println("X is different to 10");
        }

        if (x > 10) {
            System.out.println("If the condition is false, we are not entering here");
        }

        //Several conditions
        if (x > 5 && y < 20 && x != y) {
            System.out.println("X is greater than 5, and Y is less than 20, and X is different to Y");
        }

        if (x == 10 || y == 15) {
            System.out.println("X is equals to 10 or Y is equals to 15");
        }

        //If-else
        if (x <= 8) {
            System.out.println("X is less or equals than 8");
        }else {
            System.out.println("X is greater than 8");
        }

        if (y < 15) {
            System.out.println("Y is less than 15");
        } else {
            if (y > 15) {
                System.out.println("Y is greater than 15");
            } else {
                System.out.println("Y is equals to 15");
            }
        }
    }
}
