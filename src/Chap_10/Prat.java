package Chap_10;

import java.util.Stack;

public class Prat {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack();
        s1.push(20);
        s1.push(30);
        s1.push(40);
        System.out.println("original stack is:" + s1.toString());
        System.out.println("top element is:" + String.valueOf(s1.peek()));
        System.out.println("removed element is:" + String.valueOf(s1.pop()));
        System.out.println("stack after accessioning operation is:" + String.valueOf(s1));
    }
}
