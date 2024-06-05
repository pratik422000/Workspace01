package practice_2024;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[]args) {
		
		ArrayList al1 = new ArrayList(); // Empty array list 
		
		al1.add(10); // ArrayList are index based data structure
		al1.add(0,20); // We can manually mention index in Arraylist.
		al1.add("Pratik"); // Array List can store different data types
		al1.add(40.44);
		al1.add(70);
		al1.add(70); // Array List can store duplicate values
		al1.add(null); // Array List can store any number of null values
		
		 // Array List does not follow sorting order
		
		ArrayList al2 = new ArrayList(al1); // Cllection C Constructor  ArrayList / It is used to build an array list that is initialized with the elements of the collection c.
		
		ArrayList al3 = new ArrayList(); 
		al3.add(88);
		al3.add("Prajwal");
		
		al1.addAll(al3); 	// AddAll method is doing same job as collection c  constructor. // It is adding all elements from array list 1 to another array list.
		
		System.out.println(al1);
		
	//	al1.remove(2);		// .remove method with index - is removing the element placed at the mentioned index.
		
		al1.remove("Pratik"); 	// .remove method with object - is removing the same mentioned object from array list. Here int is not working.
		
		al1.removeAll(al3); 	// .removeAll method removes all the matching elements from mentioned collection
		
	//	al1.clear();		// .clear method removes all the elements from collection.
		
		al1.set(2, "Durga"); 	// .set method replaces the mentioned element at mentioned index.
		
		
		System.out.println(al1.size()); 	//.size method returns the elements count in the collection.
		System.out.println(al1.get(4)); 	//.get method returns the element present at the mentioned index value
		System.out.println(al1.indexOf("Durga"));  	// .indexOf method writes the index of the given object.
		
		System.out.println(al1);
		
	}

}
