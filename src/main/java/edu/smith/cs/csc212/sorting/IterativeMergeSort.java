package edu.smith.cs.csc212.sorting;
import me.jjfoley.adt.ListADT;
import me.jjfoley.adt.impl.JavaList;

public class IterativeMergeSort {
	
	public static ListADT<Integer> sort(ListADT<Integer> input) {
		ListADT<ListADT<Integer>> queue = new JavaList<>();
		
		
		for(int i=0;i<input.size();i++) {
			ListADT<Integer> single=new JavaList<>();
			single.addBack(input.getIndex(i));
			queue.addBack(single);
		}
		
		while (queue.size()>1) {
			ListADT<Integer> first=queue.removeFront();
			ListADT<Integer> second=queue.removeFront();
			ListADT<Integer> combined = merge(first, second);
			queue.addBack(combined);
		}
		return queue.getBack();
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
