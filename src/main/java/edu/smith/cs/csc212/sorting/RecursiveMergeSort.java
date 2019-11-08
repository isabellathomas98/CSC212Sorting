package edu.smith.cs.csc212.sorting;

import me.jjfoley.adt.ListADT;
import me.jjfoley.adt.ListADT;
import me.jjfoley.adt.impl.JavaList;


public class RecursiveMergeSort {
	
//Use recursion to break down the list into pieces,
//sort those pieces and build it back up by calling combine.
//Split the list in half 
//until there are only tiny lists that remain.
	
	public static ListADT<Integer> sort(ListADT<Integer> input) {
		
	//Use recursion to break down the list into pieces,
		
		
		
	}
	
	////////COMBINE/MERGE METHOD
	public static ListADT<Integer> merge(ListADT<Integer> list1, ListADT<Integer> list2)
	{
		ListADT<Integer> merged = new JavaList<>();
		
		while(!list1.isEmpty() && !list2.isEmpty()) {
			
			if (list1.getFront()==list2.getFront()){
				merged.addBack(list1.removeFront());
				merged.addBack(list2.removeFront());
			}
			else if (list1.getFront() < list2.getFront()){
				merged.addBack(list1.removeFront());
			}
			//if (list1.getFront()>=list2.getFront()){
			else {
				merged.addBack(list2.removeFront());
			}
		}
		
		if(!list1.isEmpty()) {
			merged.addAll(list1);
			
		}
		
		else if(!list2.isEmpty()) {
			merged.addAll(list2);
		}
		return merged;
	}

}
