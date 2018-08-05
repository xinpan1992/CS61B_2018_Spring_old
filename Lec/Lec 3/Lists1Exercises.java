public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        if (L == null) {
            return null;   // this code deals with the last IntList with null rest.
        }
        IntList Q = new IntList (L.first + x, null);
        Q.rest = incrList(L.rest, x);
        return Q;
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        if(L == null) {
            return null; // this code deals with the last IntList with null rest.
        }
        L.first = L.first + x;
        L.rest  = dincrList(L.rest, x);
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        IntList L_X = new IntList (0,null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        System.out.println("Before any operation");
        System.out.println("L " + L);
        System.out.println("L " + L.get(0) +" " + L.get(1) +" " + L.get(2));
        System.out.println("After incrList");
        L_X = incrList(L,3);
        System.out.println("L_X " + L_X);
        System.out.println("L_X " + L_X.get(0) +" " + L_X.get(1) +" " + L_X.get(2));
        System.out.println("L " +L.get(0) +" " + L.get(1) +" " + L.get(2));
        System.out.println("After dincrList");
        L= dincrList(L,3);
        System.out.println("L " + L);
        System.out.println("L " + L.get(0) +" " + L.get(1) +" " + L.get(2));  
    }
}