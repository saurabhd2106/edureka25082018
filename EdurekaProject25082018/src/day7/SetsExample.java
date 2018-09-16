package day7;

import java.util.HashSet;

public class SetsExample {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("Saurabh");

		hashSet.add("Sagar");
		hashSet.add("Sapna");
		hashSet.add("Madira");
		hashSet.add("Sagar");
		hashSet.add("Pallavi");
		
	
		System.out.println(hashSet);
		
		for(String temp:hashSet){
			System.out.println(temp);
		}

	}

}
