public class DogLauncher {

	// public static void main(String[] args) {
	// 	Dog d1 = new Dog(10);
	// 	Dog d2 = new Dog(20);
	// 	System.out.println(d1.cn_name);
	// 	System.out.println(Dog.cn_name);

	// 	Dog dmax = Dog.max_dog(d1,d2);
	// 	dmax.make_noise();

	// 	Dog dmax2 = d1.max_dog(d2);
	// 	dmax2.make_noise();
	// 	//d.weight_in_pounds = 35;
	// 	//d.make_noise();
	// }

    public static void main(String[] args) {
   		Dog smallDog = new Dog(5);
   		Dog mediumDog = new Dog(25);
   		Dog hugeDog = new Dog(150);
 
   		Dog[] manyDogs = new Dog[4];  
        manyDogs[0] = smallDog;
   		manyDogs[1] = hugeDog;    	   
        manyDogs[2] = new Dog(130);
 
   		int i = 0;
   		while (i < manyDogs.length) {
       		Dog.max_dog(manyDogs[i], mediumDog).make_noise();
       		i = i + 1;
        }
    }

}