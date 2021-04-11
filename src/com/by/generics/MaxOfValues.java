package com.by.generics;

import java.util.List;

public class MaxOfValues<T extends Comparable<T>> {

	public T getMaxOfValues(List<T> lsVal) {
		T maxVal = lsVal.stream().max((i, j) -> i.compareTo(j)).get();
		return maxVal;
	}
}
