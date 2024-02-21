public class LinkedStack <E> implements Stack<E>{
   DoublyLinkedList<E>list= new DoublyLinkedList<>();
    @Override
    public E top() {
        return list.first();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }
}
