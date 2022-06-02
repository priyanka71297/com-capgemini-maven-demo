package com.capgemini.demo.col;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
	public static void main(String[] args) {
//		 List marks = new ArrayList();// accept all type of data
		List<Integer> marks = new ArrayList();// accepts only integer type data

		marks.add(78);
		marks.add(89);
//		marks.add("Pass");
//		marks.add("abc");
		System.out.println(marks);
	}

}
