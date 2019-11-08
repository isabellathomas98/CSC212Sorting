package edu.smith.cs.csc212.sorting;
import java.util.Arrays;


import org.junit.Assert;
import org.junit.Test;

import edu.smith.cs.csc212.sorting.IterativeMergeSort;
import me.jjfoley.adt.ListADT;
import me.jjfoley.adt.impl.JavaList;

/**
 * 
 * testing methods in mergesort
 *
 */
public class MergeTest {
	//test if combine(merge) works
	@Test
	public void testMergeHelper() {
	
	ListADT<Integer> list1 = new JavaList<>(Arrays.asList(1,2,6,7,8));
	ListADT<Integer> list2 = new JavaList<>(Arrays.asList(3,4,5));
	ListADT<Integer> merged; //= new JavaList<Integer>();
	merged=IterativeMergeSort.merge(list1, list2);
	Assert.assertEquals(new JavaList<>(Arrays.asList(1,2,3,4,5,6,7,8)), merged);
	
	list1 = new JavaList<>(Arrays.asList(1,1));
	list2 = new JavaList<>(Arrays.asList(1));
	merged=IterativeMergeSort.merge(list1, list2);
	Assert.assertEquals(new JavaList<>(Arrays.asList(1,1,1)), merged);
	
	list1 = new JavaList<>(Arrays.asList(1));
	list2 = new JavaList<>(Arrays.asList(2,3));
	merged=IterativeMergeSort.merge(list1, list2);
	Assert.assertEquals(new JavaList<>(Arrays.asList(1,2,3)), merged);
	
	}
	//test if merge sort works
	@Test
	public void testIterativeMergeSort() {
		ListADT<Integer> input = new JavaList<Integer>();
		ListADT<Integer> bubbled = new JavaList<Integer>();
		
		for (int x : SortTestingHelpers.data) {
			input.addBack(x);
			bubbled.addBack(x);
		}

		// sort one of them with known-good:
		BubbleSort.sort(bubbled);
		// sort with maybe-broken radix-sort:
		ListADT<Integer> output = IterativeMergeSort.sort(input);
		
		// For debugging:
		// System.out.println(input);
		// System.out.println(output);
		// System.out.println(bubbled);

		Assert.assertEquals(bubbled, output);
		
	}
	
	
	
	
	

}
