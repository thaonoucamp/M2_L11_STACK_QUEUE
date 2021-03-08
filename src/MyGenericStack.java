import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    // cai dat phuong thuc push;
    public void push(T element) {
        stack.addFirst(element);
    }

    // cai dat phuong thuc pop;
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    // cai dat phuong thuc size();
    public int size() {
        return stack.size();
    }

    // cai dat phuong thuc kiem tra mang trong hay khong isEmpty;
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }


}
