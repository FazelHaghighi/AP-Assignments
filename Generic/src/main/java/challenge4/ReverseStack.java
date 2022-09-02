package challenge4;

import challenge3.MyStackGeneric;
import java.util.Stack;
import static challenge3.MyStackGeneric.reverse;

public class ReverseStack {

    public static void main(String[] args) {
        MyStackGeneric<Integer> stack = new MyStackGeneric();
        MyStackGeneric<Integer> stack1 = new MyStackGeneric();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        reverse(stack,stack1);
        System.out.println("First Stack:");
        System.out.println(stack.pop().getValue());
        System.out.println(stack.pop().getValue());
        System.out.println(stack.pop().getValue());

        MyStackGeneric<String> stack2 = new MyStackGeneric();
        Stack<String> stack3 = new Stack();
        stack2.push("4");
        stack2.push("5");
        stack2.push("6");
        reverse(stack2,stack3);
        System.out.println("Second Stack:");
        System.out.println(stack2.pop().getValue());
        System.out.println(stack2.pop().getValue());
        System.out.println(stack2.pop().getValue());

        Stack<Double> stack4 = new Stack();
        MyStackGeneric<Double> stack5 = new MyStackGeneric();
        stack4.push(7.0);
        stack4.push(8.0);
        stack4.push(9.0);
        reverse(stack4,stack5);
        System.out.println("Third Stack:");
        System.out.println(stack4.pop());
        System.out.println(stack4.pop());
        System.out.println(stack4.pop());

        Stack<Character> stack6 = new Stack();
        Stack<Character> stack7 = new Stack();
        stack6.push('a');
        stack6.push('b');
        stack6.push('c');
        reverse(stack6,stack7);
        System.out.println("Fourth Stack:");
        System.out.println(stack6.pop());
        System.out.println(stack6.pop());
        System.out.println(stack6.pop());
    }
}
