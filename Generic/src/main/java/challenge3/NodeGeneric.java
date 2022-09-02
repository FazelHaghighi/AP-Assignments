package challenge3;

public class NodeGeneric<T>{
    private T value;
    private NodeGeneric<T> next;

    public NodeGeneric(T value, NodeGeneric<T> next) {
        this.value = value;
        this.next = next;
    }
    public NodeGeneric<T> getNext() {
        return next;
    }
    public T getValue(){
        return value;
    }
}
