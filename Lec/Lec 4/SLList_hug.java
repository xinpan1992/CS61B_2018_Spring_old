/** An SLList is a list of integers, which hides the terrible truth
   * of the nakedness within. */
public class SLList_hug {   
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
            //System.out.println(size);
        }
    } 

    /* The first item (if it exists) is at sentinel.next. */
    private IntNode sentinel;
    private int size;

    private static void lectureQuestion() {
        SLList_hug L = new SLList_hug();
        IntNode n = new IntNode(5, null);
    }

    /** Creates an empty SLList. */
    public SLList_hug() {
        sentinel = new IntNode(63, null);
        size = 0;
    }

    public SLList_hug(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public SLList_hug(int[] x) {
        sentinel = new IntNode(63, null);
        IntNode p = sentinel;
        size=0;
        for(int i=0; i< x.length; i++) {
            p.next = new IntNode(x[i], null);
            p=p.next;
            size++;
        }
        //size = x.length;  
        //if size is inside the for loop the it has to increment each time
        // if size is  outside, it can be tied to a fixed value.
    }


    /** Adds x to the front of the list. */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size = size + 1;
    }

    /** Returns the first item in the list. */
    public int getFirst() {
        return sentinel.next.item;
    }

    /** Adds x to the end of the list. */
    public void addLast(int x) {
        size = size + 1;        

        IntNode p = sentinel;

        /* Advance p to the end of the list. */
        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
    }

    /** Delet the first element of the list 
    Make sure the three Invariants are properly maintained
    
    The sentinel reference always points to a sentinel node.
    The front item (if it exists), is always at sentinel.next.item.
    The size variable is always the total number of items that have been added.*/
    public void deleteFirst(){
        if(sentinel.next == null) {   // empty list
            System.out.println("WARN : The SLList is empty!"); 
        } else if(sentinel.next.next == null) { // single element in the list
            sentinel.next = null;
            size--;
        }else {
            sentinel.next = sentinel.next.next;
            size--;
            }
    }
    
    
    /** Returns the size of the list. */
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        /* Creates a list of one integer, namely 10 */
        SLList_hug L = new SLList_hug();
        L.addLast(20);
        L.addLast(30);
        L.addLast(40);
        L.deleteFirst();
        System.out.println(L.size());

        int[] m = new int[] {1,2,3,4,5};
        SLList_hug M = new SLList_hug(m);
        System.out.println(M.size());
    }

}