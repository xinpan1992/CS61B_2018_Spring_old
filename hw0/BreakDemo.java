public class BreakDemo {
    public static void main(String[] args) {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

        for (int i = 0; i < a.length; i += 1) {
            for (int j = 0; j < 3; j += 1) {
                System.out.println(a[i]);
                if (a[i].contains("horse")) { // only print array once if contains "horse"
                    break;                    //else print array three times
                }                
            }
        }
    }
}


// break : directly jump out of loop
// continue: still in the loop, but just skip this iteration, 
//                              and proceed to the next iteration