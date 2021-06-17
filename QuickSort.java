
public class QuickSort {
	static int partition(int[] array, int begin, int end) {
	    int pivot = end;

	    int counter = begin;
	    for (int i = begin; i < end; i++) {
	        if (array[i] < array[pivot]) {
	        	
	            int temp = array[counter];
	            array[counter] = array[i];
	            array[i] = temp;
	            
	            counter++;
	        }
	        
	    }
	    
	    int temp = array[pivot];
	    array[pivot] = array[counter];
	    array[counter] = temp;
	    
	    return counter;
	}
	public static void quickSort(int[] array, int low, int high) {
		if (high <= low) return;
	    int pivot = partition(array, low, high);
	    
	    quickSort(array, low, pivot-1);
	    
	    quickSort(array, pivot+1, high);
	    
	    
	}
	public static void printArray(int[] array) {
		System.out.println("Quick sorting:");
		for(int j=0;j<array.length;j++) {
			System.out.print(array[j]+" ");
		}
	}

	public static void main(String[] args) {
		int[] numArr= {11,6, 4, 5,9, 2,10,13,7, 12,8};
		QuickSort.quickSort(numArr, 0, numArr.length-1);
		QuickSort.printArray(numArr);

	}

}
