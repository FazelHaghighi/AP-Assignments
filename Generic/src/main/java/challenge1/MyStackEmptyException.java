package challenge1;

public class MyStackEmptyException extends RuntimeException{
    public MyStackEmptyException() {
        super("Stack is empty!");
    }
}
