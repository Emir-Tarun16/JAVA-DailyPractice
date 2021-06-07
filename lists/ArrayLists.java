//Various Imp Methods in Collection -> List Framework

package lists;

import java.lang.*;
import java.util.List;
import java.util.ArrayList;


public class ArrayLists {
	
	public static void main(String []args) {
		
		List<String> fruits= new ArrayList();
		List<String> vegetable = new ArrayList();
		
		//Various Methods in List of Collection
		
		
		//Add - Adds the element in the Array
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Strawberry");
		fruits.add("Banana");
		fruits.add("Mango");
		
		//AddAll
		vegetable.add("Carrot");
		vegetable.add("Spicer");
		
		fruits.addAll(vegetable);
		
		//get
		System.out.println(fruits.get(1));
		
		//set
		System.out.println(fruits.set(4, "Kiwi"));
		
		//remove
		System.out.println(fruits.remove(3));
		
		//removeAll
		List<String> rem = new ArrayList();
		rem.add("Scooter");
		rem.add("Bike");
		rem.add("car");
		
		fruits.addAll(rem);
		System.out.println(fruits);
		System.out.println(fruits.removeAll(rem));
		
		
		//clear
		vegetable.clear();
		
		//size
		System.out.println(fruits.size());
		
		//contains
		System.out.println(fruits.contains("Kiwi"));
		
		//isEmpty()
		System.out.println(fruits.isEmpty());
		
		//toArray()
		
		System.out.println(fruits);
		
		Pair<String, Integer> p1= new Pair("Stefan",23);
		Pair<Boolean, String> p2= new Pair(true,"cold Blooded");
		
		p1.getDescription();
		p2.getDescription();
		
	}
	
}
