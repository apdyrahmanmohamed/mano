package Chap_10;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> {
    private static final int DEFAULT_CAPACITY = 3;
    private int top;
    private T[] stack;

    public ArrayStack(int size) {
        this.top = 0;
        this.stack = (T[]) new Object[size];
    }

    public ArrayStack() {
        this(3);
    }

    int size() {
        return this.top;
    }

    boolean isEmpty() {
        return this.top == 0;
    }

    void push(T element) {
        if (this.size() == this.stack.length) {
            this.expandCapacity();
        }

        this.stack[this.top] = element;
        ++this.top;
    }

    private void expandCapacity() {
        this.stack = Arrays.copyOf(this.stack, this.stack.length * 2);
    }

    int getLength() {
        return this.stack.length;
    }

    boolean isFull() {
        return this.top == this.stack.length;
    }

    void display() {
        if (this.isEmpty()) {
            System.out.println("the stack is empty :");
        } else {
            for(int i = this.top - 1; i >= 0; --i) {
                System.out.println(this.stack[i]);
            }
        }

    }

    T peek() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return this.stack[this.top - 1];
        }
    }

    T pop() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        } else {
            --this.top;
            T removedElement = this.stack[this.top];
            this.stack[this.top] = null;
            return removedElement;
        }
    }

    public T getElementByIndex(int i) {
        return this.stack[i];
    }

    private boolean isDuplicated(ArrayStack array, T element) {
        if (array.size() == 0) {
            return false;
        } else {
            for(int i = 0; i < array.size(); ++i) {
                if (array.getElementByIndex(i) == element) {
                    return true;
                }
            }

            return false;
        }
    }

    public String toString() {
        int var10000 = this.top;
        return "ArrayStack{top=" + var10000 + ", stack=" + Arrays.toString(this.stack) + "}";
    }

    public void mm(ArrayStack<T> s1, ArrayStack<T> s2) {
        int newSize = s1.size() + s2.size();
        if (this.stack.length < newSize) {
            this.stack = Arrays.copyOf(this.stack, newSize);
        }

        int i;
        boolean duplicated;
        for(i = 0; i < s1.size(); ++i) {
            duplicated = this.isDuplicated(this, s1.getElementByIndex(i));
            if (!duplicated) {
                this.push(s1.stack[i]);
            }
        }

        for(i = 0; i < s2.size(); ++i) {
            duplicated = this.isDuplicated(this, s2.getElementByIndex(i));
            if (!duplicated) {
                this.push(s2.stack[i]);
            }
        }

    }

    public static void main(String[] args) {
        ArrayStack<Integer> s1 = new ArrayStack(6);
        ArrayStack<Integer> s2 = new ArrayStack(4);
        ArrayStack<Integer> s3 = new ArrayStack(5);
        s1.push(20);
        s1.push(10);
        s1.push(30);
        s1.push(40);
        s2.push(500);
        s2.push(10);
        s2.push(30);
        s2.push(40);
        System.out.println(s3);
        s3.mm(s1, s2);
        s3.display();
    }
}
