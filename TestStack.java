public class TestStack {
    public static void main(String[] args) {
        LinkedStack<Integer>s= new LinkedStack<>();
        System.out.println(s.size()+" is the size of stack");
        s.push(11);
        s.push(13);
        s.push(15);
        System.out.println(s.top()+ "is the top");
        System.out.println(s.pop()+ " is poped");
        System.out.println(s.pop()+ " is poped");

        System.out.println(s.pop()+ " is poped");

        System.out.println(s.pop()+ " is poped");

    }
}
