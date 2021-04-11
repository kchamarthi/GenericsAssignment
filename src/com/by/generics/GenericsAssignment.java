package com.by.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAssignment {

	public static void main(String[] args) {
		List<Integer> lsInt = new ArrayList<Integer>();
		lsInt.add(345);
		lsInt.add(12345);
		lsInt.add(1);
		System.out.println(new MaxOfValues<Integer>().getMaxOfValues(lsInt));
		List<Float> lsFloat = new ArrayList<Float>();
		lsFloat.add(345.87f);
		lsFloat.add(345.85f);
		lsFloat.add(345.89f);
		System.out.println(new MaxOfValues<Float>().getMaxOfValues(lsFloat));
		List<String> lsString = new ArrayList<String>();
		lsString.add("Apple");
		lsString.add("Peach");
		lsString.add("Banana");
		System.out.println(new MaxOfValues<String>().getMaxOfValues(lsString));
	}

}
