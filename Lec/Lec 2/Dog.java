public class Dog {

    public int weight_in_pounds; 
    public static String cn_name = "狗";

    /* Constructor new to set weight of a dog
    */
    public Dog(int w) {
        weight_in_pounds = w;
    }

    public void make_noise() {
        if(weight_in_pounds <10) {
            System.out.println("yip!");
        } else if (weight_in_pounds <30) {
            System.out.println("bark!");
        } else {
            System.out.println("woooof!");
        }
    }

    public static Dog max_dog (Dog d1, Dog d2) {
        if(d1.weight_in_pounds > d2.weight_in_pounds) return d1;
        else                                          return d2;
    }

    public  Dog max_dog (Dog d) {
        if(this.weight_in_pounds > d.weight_in_pounds) return this;
        else                                           return d;
    }
}