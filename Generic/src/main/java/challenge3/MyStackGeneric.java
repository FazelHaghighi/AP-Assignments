package challenge3;

import challenge1.MyStackEmptyException;

import java.util.Stack;

public class MyStackGeneric<T> {
    private int elementCount = 0;
    private NodeGeneric<T> top;

    public void push(T value){
        top = new NodeGeneric(value,top);
        elementCount++;
    }
    public NodeGeneric<T> pop(){

        if (top == null){
            throw new MyStackEmptyException();
        }
        NodeGeneric<T> temp = top;
        top = top.getNext();
        return temp;
    }
    public NodeGeneric<T> top(){
        if (top == null){
            throw new MyStackEmptyException();
        }
        return top;
    }
    public synchronized int size() {
        return elementCount;
    }
    public static<T> void reverse(MyStackGeneric<T> s1, MyStackGeneric<T> s2){
        int tempSize = s1.size();
        for (int i = 0; i < tempSize - 1; i++){
            T temp = s1.top.getValue();
            for (int j = 0; j < tempSize - i; j++){
                s2.push(s1.pop().getValue());
            }
            s1.push(temp);
            for (int j = 0; j < tempSize - i - 1; j++){
                s1.push(s2.pop().getValue());
            }
        }

    }
    public static<T> void reverse(MyStackGeneric<T> s1, Stack<T> s2){
        int tempSize = s1.size();
        for (int i = 0; i < tempSize - 1; i++){
            T temp = s1.top.getValue();
            for (int j = 0; j < tempSize - i; j++){
                s2.push(s1.pop().getValue());
            }
            s1.push(temp);
            for (int j = 0; j < tempSize - i - 1; j++){
                s1.push(s2.pop());
            }
        }

    }
    public static<T> void reverse(Stack<T> s1, MyStackGeneric<T> s2){
        int tempSize = s1.size();
        for (int i = 0; i < tempSize - 1; i++){
            T temp = s1.peek();
            for (int j = 0; j < tempSize - i; j++){
                s2.push(s1.pop());
            }
            s1.push(temp);
            for (int j = 0; j < tempSize - i - 1; j++){
                s1.push(s2.pop().getValue());
            }
        }

    }
    public static<T> void reverse(Stack<T> s1, Stack<T> s2){
        int tempSize = s1.size();
        for (int i = 0; i < tempSize - 1; i++){
            T temp = s1.peek();
            for (int j = 0; j < tempSize - i; j++){
                s2.push(s1.pop());
            }
            s1.push(temp);
            for (int j = 0; j < tempSize - i - 1; j++){
                s1.push(s2.pop());
            }
        }

    }
    public static void main(String[] args){
        MyStackGeneric<Integer> stack = new MyStackGeneric();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop().getValue());
        System.out.println(stack.pop().getValue());
        System.out.println(stack.top().getValue());
        System.out.println(stack.pop().getValue());
        try {
            System.out.println(stack.pop().getValue());
        }
        catch (MyStackEmptyException e){
            System.out.println(e.getMessage());
        }
        System.out.println(stack.pop().getValue());
    }
}
