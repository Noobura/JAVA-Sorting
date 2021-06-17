
public class InsertSort {
	public static void sortNumberArray(int[] numArr) {
		
		for(int i=1;i<numArr.length;i++) {
				
			        int current = numArr[i];
			        int j = i - 1;
			        while(j >= 0 && current < numArr[j]) {
			            numArr[j+1] = numArr[j];
			            j--;
			        }
			        // at this point we've exited, so j is either -1
			        // or it's at the first element where current >= a[j]
			        numArr[j+1] = current;
			   
		}	
			System.out.println("Insert sorting:");
			for(int j=0;j<numArr.length;j++) {
				System.out.print(numArr[j]);
			}
	}


	public static void main(String[] args) {
		int[] numArr= {7, 4, 5, 2, 1};
		InsertSort.sortNumberArray(numArr);
	}
}
