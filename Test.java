import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        DoublyLinkedList<String>l= new DoublyLinkedList<>();
        Scanner in= new Scanner(System.in);
        int choice;
        while (true)
        {
            System.out.println("1 addFirst 2 addLast 3 removeFirst 4 removeLast 5 " +
                    "first 6 last 7 size 8 view all 0 exit");
            choice= in.nextInt();
            switch (choice)
            {
                case  1:
                    System.out.println("input name to add first");
                    l.addFirst(in.next());
                    System.out.println(l.first()+ " is added successfully");
                    break;
                case  2:
                    System.out.println("input name to add last");
                    l.addLast(in.next());
                    System.out.println(l.last()+ " is added successfully");
                    break;
                case 3:
                    System.out.println(l.removeFirst()+ "is removed ");
                    break;
                case 4:
                    System.out.println(l.removeLast()+ "is removed ");
                    break;
                case 5:
                    System.out.println(l.first()+ "is the first name ");
                    break;
                case 6:
                    System.out.println(l.last()+ "is the last name ");
                    break;
                case 7:
                    System.out.println(l.size()+ "is the size ");
                    break;
                case 8:
                    System.out.print( "All names are :  ");
                    while (!l.isEmpty())
                        System.out.print(l.removeFirst()+" ");
                    System.out.println();
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }
}
