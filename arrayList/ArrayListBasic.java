package arrayList;
import java.util.*;

public class ArrayListBasic {

	public static void main(String[] args) {
		//Basic implementation of arrayList in java
		
		//This is without Generic which may cause problem in this you have to give condition 
//		ArrayList fruits = new ArrayList();
//		
//		fruits.add("Apple");
//		fruits.add(23);
		
		//System.out.println(fruits);
		
		
		//this contains generic 
		List <String> fruit = new ArrayList<String>();
		
		//in this we can not use int we have to use its raper class Integer and same for remaining variables
		
		fruit.add("Apple");
		fruit.add("Orange");
		
		List <String> add1 = new ArrayList<String>();
		add1.add("Banana");
		add1.add("Pineapple");
		add1.add("Hello");
		
		fruit.addAll(add1);
		System.out.println(Collections.binarySearch(fruit,"Apple"));
		//System.out.println(fruit);
		//fruit.removeAll(add1);		
		
//		System.out.println(fruit.set(1,"Papaya"));
//		System.out.println(fruit);
//		
		//Pair<String ,Integer> p1 = new Pair("Hemant", 20);
		//p1.GetDescription();
	}

}
