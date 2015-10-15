//******************************************************************************************
// Programming Projects 10.4 
// Sorting.java
// Ryan Gens
// Modify the Sorting program from chapter 10 so the sorting functions sort in a descending
// order.
//******************************************************************************************
public class Sorting {
	public static void selectionSort(Comparable[] list){
		int min;
		Comparable temp;
	
		for (int index = 0; index < list.length - 1; index++){
			min = index;
			for(int scan = index+1; scan< list.length; scan++)
				// Since the compareTo function is designed to return
				// a 1 if the contact object is greater than the object
				// it is being compared to, changing the < operation to 
				// > will sort the list in a descending order instead of
				// an ascending order.
				if (list[scan].compareTo(list[min])>0)
					min = scan;
			
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}


	public static void insertionSort(Comparable[] list){
		for(int index = 1; index < list.length; index++){
			Comparable key = list[index];
			int position = index;
			
			// Since the compareTo function is designed to return
			// a 1 if the contact object is greater than the object
			// it is being compared to, changing the < operation to 
			// > will sort the list in a descending order instead of
			// an ascending order.
			while(position > 0 && key.compareTo(list[position-1])>0){
				list[position] = list[position -1];
				position--;
			}
			list[position]= key;
		}
	}
}