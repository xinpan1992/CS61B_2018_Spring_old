public class SLList {
    private IntNode first;
    private int size;

    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
        size ++;
    }

    /** Returns the first item in the list */ 
    public int getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list */
    //IntNode p = first; // put it avove the func will cause the p pointing to null.
    public void addLast(int x) {
        size ++;
        IntNode p = first;

        // take care of add a element to a empty list 
        if(p == null) {
            first = new IntNode (x, null);
            return;
        }

        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);

        // if used the code below
        // the last addLast(x) will trigger a new loop that will first make p points back to the 
        // begining of the list
        //   IntNode p = first;
        //   if(p.next == null) {
        //      p.next = new IntNode(x, null);
        //   } 
        //   else {
        //       p = p.next;
        //       addLast(x);
        //   }

        // if used the code below.
        // first = first.next will change the contetn of list.
        // and will only have the last two items of the list.
        // if(first.next == null) {
        //    first.next = new IntNode(x, null);
        // } 
        // else {
        //     first = first.next;
        //     addLast(x);
        // }

    }

    public int size_iterate(){
        IntNode p = first;
        int n = 1;
        while(p.next != null) {
            n++;
            p = p.next;
        }
        return n;
    }

    private static int size(IntNode p) {
        if(p.next == null) {
            return 1;
        } return 1 + size(p.next);
    }

    public int size_recursive(){
        return size(first);
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        SLList L = new SLList(5);
        L.addLast(10);
        L.addLast(15);
        L.addLast(20);
        L.addLast(25);
        System.out.println("USING ITERATIVE WAY Size of L is " + L.size_iterate());
        System.out.println("USING RECURSIVE WAY Size of L is " + L.size_recursive());
        System.out.println("USING ++ WAY Size of L is " + L.size());

    }
}