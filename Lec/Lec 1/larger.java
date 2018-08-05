public class larger {
    public static void main(String[] args) {
        System.out.println(larger(1,6));
    }

    public static int larger(int x, int y) {
    	if (x >y) return x;
    	return y;
    }
}