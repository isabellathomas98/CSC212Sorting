package edu.smith.cs.csc212.sorting;
import me.jjfoley.adt.ListADT;


//Until unsorted is empty, scan it for the smallest remaining element.
//Remove that element from unsorted and add it to the tail of sorted. 
//One way to do this: Loop through all the nodes,
//keeping the index of the smallest element seen so far as you continue to scan through the list, 
//then remove that element by index.

public class SelectionSort {
	public static void sort(ListADT<Integer> input) {
		int N = input.size();
		//loop thru all the elements
		for(int i=0;i<N-1;i++) {
			int min=i;
			for(int k=i+1;k<N;k++) {
				//look for smallest element
				if(input.getIndex(k)<input.getIndex(min)) {
					//set new min once found
					min=k;
					//swap that with the the item you were at
					input.swap(min,k);
					//System.out.println(input);
				}
			}
			
			//so we dont have problem with duplicates
			if (min!=i) {
				input.swap(i,min);
			}
			
	System.out.println(input);
	
		}
		System.out.println("sorted");
		}
	
	}