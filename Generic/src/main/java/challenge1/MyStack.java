package challenge1;

public class MyStack {

    private Node top;
    public void push(int x){
        top = new Node(x,top);
    }
    public Node pop(){

        if (top == null){
            throw new MyStackEmptyException();
        }
        Node temp = top;
        top = top.getNext();
        return temp;
    }
    public Node top(){
        if (top == null){
            throw new MyStackEmptyException();
        }
        return top;
    }

    public static void main(String[] args){
        MyStack stack = new MyStack();
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
