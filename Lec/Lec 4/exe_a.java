public class exe_a { 
    public int first; 
    public exe_a rest;

    public exe_a(int f, exe_a r) { 
        this.first = f;
        this.rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

   /** if 2 numbers in a row are the same
       we add them together and make one large node. For example:
      1⇒1⇒2 ==>3 becomes 2⇒2⇒3 which becomes 4⇒3.
    */
    public void addAdjacent() {
         exe_a s = this;
         if (s.rest == null) {
             return;
         }
         exe_a p = s;
         while (p.rest != null) {
            if(p.rest.rest == null & p.first != p.rest.first) {  // deal with last two element
                return;                                          // if not same, jump out
             }
             if(p.first == p.rest.first){
                p.first += p.first;
             }
                p.rest = p.rest.rest;
         }
    }

    public static void main(String[] args) {
        exe_a   L = new exe_a(3,null);
                L = new exe_a(2, L);
                L = new exe_a(1, L);
                L = new exe_a(1, L);

                L.addAdjacent();

    }
}