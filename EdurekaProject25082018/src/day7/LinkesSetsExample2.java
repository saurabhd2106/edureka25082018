package day7;

import java.util.LinkedHashSet;

public class LinkesSetsExample2 {

	public static void main(String[] args) {

		LinkedHashSet<String> linkedSet = new LinkedHashSet<>();

		linkedSet.add("Saurabh");
		linkedSet.add("Sagar");
		linkedSet.add("Sapna");
		linkedSet.add("Madira");
		linkedSet.add("Sagar");
		linkedSet.add("Pallavi");
		
	
		System.out.println(linkedSet);
		
		for(String temp:linkedSet){
			System.out.println(temp);
		}

	}

}
