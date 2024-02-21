public interface Stack<E> {
    E top();
    int size();
    boolean isEmpty();
    void push(E e);
    E pop();
}
