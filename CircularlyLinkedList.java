public class CircularlyLinkedList<E> {
    private Node<E> tail = null; // we store tail (but not head)
    private int size = 0; // number of nodes in the list
   public CircularlyLinkedList(){}
    public boolean isEmpty(){ return size == 0; }//عشان اعرف لو هي فارغة
    public int size(){ return size; }
    public E first(){
       if (isEmpty()) return null;
       return tail.getNext().getElement();
    }
    public E last(){
       if (isEmpty()) return null;
       return tail.getElement();
    }
    public void addFirst(E e) { // adds element e to the front of the list
        if (size == 0) {
            tail = new Node<>(e, null);
            tail.setNext(tail); // link to itself circularly
        } else {
            Node<E> newest = new Node<>(e, tail.getNext( ));
            tail.setNext(newest);
        }
        size++;
    }
    public void addLast(E e) { // adds element e to the end of the list
         addFirst(e); // insert new element at front of list
         tail = tail.getNext( ); // now new element becomes the tail
         }
    public E removeFirst() { // removes and returns the first element
         if (isEmpty()) return null; // nothing to remove
         Node<E> x = tail.getNext();
         if (x == tail) tail = null; // must be the only node left
         else tail.setNext(x.getNext()); // removes ”x” from the list
         size--;
         return x.getElement();
         }
    public void rotate(){ // rotate the first element to the back of the list
         if (tail != null) // if empty, do nothing
             tail = tail.getNext( ); // the old head becomes the new tail
         }





    private static class Node<E>{
        E element;
        Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
