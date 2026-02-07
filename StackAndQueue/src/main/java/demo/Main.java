package demo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /*
        Stack<Integer> numbers = new Stack<>();
        System.out.println("Is empty: " + numbers.empty());
        numbers.push(4); // thêm phần tử
        numbers.push(10);
        numbers.push(-32);

        System.out.println("Stack: ");
        for(Integer e: numbers) {
            System.out.println(e);
        }

        System.out.println("Get first: " + numbers.peek()); // -32
        numbers.pop(); // get and remove first element;
        numbers.pop();
        System.out.println("Get first: " + numbers.peek()); // 10
         */

        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(10);
        numbers.add(-20);
        System.out.println("First: " + numbers.peek()); // 3
        numbers.remove(); // Get and remove first element (get and remove 3)
        System.out.println("Get and remove : " + numbers.remove()); // 4
        System.out.println("First: " + numbers.peek()); // 10
    }
}
