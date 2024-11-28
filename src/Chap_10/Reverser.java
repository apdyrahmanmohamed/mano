package Chap_10;

import java.util.Scanner;
import java.util.Stack;

public class Reverser {
    static String reverse(String input) {
        Stack<Character> s1 = new Stack();

        for(int i = 0; i < input.length(); ++i) {
            s1.push(input.charAt(i));
        }

        String result;
        for(result = ""; !s1.isEmpty(); result = result + String.valueOf(s1.pop())) {
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to reverse: ");
        String input = scanner.next();
        System.out.println("Reversed text: " + reverse(input));
    }
}
