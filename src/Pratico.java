import java.util.Scanner;

public class Pratico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter single letter");
        String ask = input.next();
        char ch = ask.charAt(0);
        if ('A' <= ch && ch <= 'Z') {
            System.out.println("" + ch + " is upper case");
        } else if ('a' <= ch && ch <= 'z') {
            System.out.println("" + ch + " is lower");
        } else if ('0' <= ch && ch <= '9') {
            System.out.println("" + ch + " is digit");
        }

    }
}
