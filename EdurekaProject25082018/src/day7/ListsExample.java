package day7;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListsExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Saurabh");
		
		arrayList.add(45);
		arrayList.add(42);
		
		arrayList.add(2, 47);
		
		arrayList.add(0, 76);
		
		for(Integer temp:arrayList){
			System.out.println(temp);
		}
		
		System.out.println(arrayList.get(0));
		
		
	}

}
