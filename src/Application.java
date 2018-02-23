import java.util.ArrayList;

//a generic class is a class that works with other objects
//you specify what objects it works with when you instantiate it
//most important thing: using the array list with generics
//array list is part of the java collection, it manages arrays.

public class Application {

	public static void main(String[] args) {

		//before java 5, array lists looked like this:
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("orange");
		list.add("banana");
		//etc...
		
		String fruit = (String)list.get(1); //casts to string
		System.out.println(fruit); //prints orange
		
		//since java 5, we get generics
		//it will specify what type of object a class will work with:
		
		//this first line specifies they will be strings.
		ArrayList<String> strings1 = new ArrayList<String>();
		strings1.add("cat");
		strings1.add("dog");
		strings1.add("parrot");
		
		//the next line doesn't have to cast to string
		//because that was already defined up above.
		String animal = strings1.get(0);
		System.out.println(animal);

		//there can be more than one type
		//(he's covering this very briefly)
		
		HashMap<Integer, String> app = new HashMap<Integer, String>();
		
		//starting with java 7, you can declare like this:
		//the final brackets can just be<>
		//it saves time, especially if there are many parameters
		ArrayList<Integer> someList = new ArrayList<>();
		
		//most important thing to remember:
		//the strings1/animal syntax stuff
	}

}
