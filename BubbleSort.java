
public class BubbleSort {
	public static void sortNumberArray(int[] numArr) {
		int temp;
		boolean sorted = false;
		while(!sorted) {
			sorted=true;
			for(int i=0;i<numArr.length-1;i++) {
				
			if(numArr[i]>numArr[i+1]) {
				temp=numArr[i];
				numArr[i]=numArr[i+1];
				numArr[i+1]=temp;		
				sorted = false;
			}			
			}
			System.out.println("Bubble sorting:");
			for(int j=0;j<numArr.length;j++) {
				System.out.print(numArr[j]);
			}
		}			
	}

	public static void main(String[] args) {
		int[] numArr= {7, 4, 5, 2, 1};
		BubbleSort.sortNumberArray(numArr);

	}

}
