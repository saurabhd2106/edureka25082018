package day7;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<>(Collections.reverseOrder());

		treeSet.add("Saurabh");

		treeSet.add("Sagar");
		treeSet.add("Sapna");
		treeSet.add("Madira");
		treeSet.add("Sagar");
		treeSet.add("Pallavi");
		
	
		System.out.println(treeSet);
		
		for(String temp:treeSet){
			System.out.println(temp);
		}

	}

}
