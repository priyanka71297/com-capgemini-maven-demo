package com.capgemini.demo.col;

import java.util.HashMap;

public class practice {

	public static void main(String[] args) {


		HashMap<Integer, String> name = new HashMap<>();
		name.put(1, "Priyanka");
		name.put(2, "Aditi");
		name.put(3, "Rani");
		name.put(4, "Rani");
		name.put(5, "Divya");
		name.put(6, "Aditi");
		System.out.println(name);
		System.out.println(name.get(5));
		name.put(7, "Rohini");
		System.out.println(name.keySet());
		System.out.println(name.values());
		
		HashMap<Integer, Integer> mark = new HashMap<>();

		mark.put(1, 78);
		mark.put(2, 56);
		mark.put(3, 89);
		mark.put(4, 97);
		mark.put(5, 75);
		mark.put(6, 45);
		System.out.println(mark);
		mark.remove(4);
		System.out.println(mark.values());
		
	}

}