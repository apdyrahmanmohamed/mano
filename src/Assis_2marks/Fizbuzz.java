package Assis_2marks;

import java.util.Scanner;

public class Fizbuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("soo gali number ka weyn 0");
        int num = input.nextInt();
        if (num <= 0) {
            System.out.println(" soo gali number ka weyn 0");
        }

        if (num % 5 == 0 && num % 2 == 0) {
            System.out.println("fazzbuzz");
        } else if (num % 5 == 0) {
            System.out.println("fazz");
        } else if (num % 2 == 0) {
            System.out.println("buzz");
        } else {
            System.out.println("ka bax");
        }

    }
}
