package edu.smith.cs.csc212.sorting;

import me.jjfoley.adt.ListADT;


//Until unsorted is empty, take the first element off it
//and find the point where it should go in sorted 
//(the point where all previous elements are smaller, 
//and all following elements are equal to or greater than). 
//Insert it into sorted at this point.

public class InsertionSort {
	
	public static void sort(ListADT<Integer> input) {
		int N = input.size();
		
		//go thru unsorted which is all items from index 1 to the end
			for (int i=1; i<N; i++) {
				//to keep track of value of item we r at
				int current=input.getIndex(i);
				//j is the index before i, so the end of the sorted list
				int j=i-1;
				
				//so j is above 0 and if its value is greater than i,
				while ((j>-1)&&(input.getIndex(j)>current)) {
					//swap j and the one after it
					input.swap(j,j+1);
					//we r going backwards thru sorted 
					j--;
					//System.out.println(input);
					
				}
				//while thats not tru, current is the new value of our new sorted item
				input.setIndex(j+1,current);
				System.out.println(input);
				
			}
			System.out.println("**********");
		
		
		
	}

}
