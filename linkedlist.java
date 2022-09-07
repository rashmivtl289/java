import java.util.LinkedList;
import java.util.List;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<Character>();

        ll.add('A');
        ll.add('B');
        ll.add('C');
        System.out.println("Contents:"+ll);

        ll.addLast('Z');
        ll.addFirst('X');
        System.out.println("Contents after call addFirst() and addLast():"+ll);
        
        ll.add(4,'E');
        ll.add(4,'D');
        System.out.println("After adding to given position:"+ll);
         
        ll.poll();
        System.out.println("After poll:"+ll);

        System.out.println("first and last element:"+ll.getFirst() +" "+ll.getLast());
        
        List<Character> sub = ll.subList(2,5);
        
        System.out.println("Contenets of sublist:"+sub);
        
        LinkedList<Character> ll2=new LinkedList<Character>(sub);
        ll.removeAll(ll2);
        System.out.println("After removing ll2 from ll:"+ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("After call removeFirst() and removeLast():"+ll);

        ll.set(0, Character.toLowerCase(ll.get(0)));
        System.out.println("After change:"+ll);

    }
}
