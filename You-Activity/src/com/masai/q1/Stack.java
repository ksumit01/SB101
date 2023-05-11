package com.masai.q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack<E> {

    private ArrayList<E> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    public void push(E element) {
        elements.add(element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void show() {
        System.out.println(elements);
    }

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to push into the stack");
        String in = scanner.nextLine();
        st.push(in);
        System.out.println(st.peek()) ;
        st.show();
       
        Stack<Integer> s = new Stack<>();
        System.out.println("Enter the Integer to push into the stack");
        int input = scanner.nextInt();
        s.push(input);
        System.out.println(s.peek()) ;
        s.show();
        
    }
}

