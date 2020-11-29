
public class makeArrayConsecutive2 {
	public int consecArray(int[] statues) {
		int count = 0;
		insertionSort(statues);

		//loop through the array
		for(int i = 0; i < statues.length; i++) {
			if(i+1 == statues.length) {
				break;
			}
			else {
				int num = statues[i];
				int num1 = statues[i+1];
				int temp = num1-num;
				
				if(temp > 1) {
					count += temp;
					count--;
				}	
			}
		}
	
		return count;
		
	}
	public int[] insertionSort(int[] statues){
		//insertion sort
		int[] arr = statues;
		for(int i = 1; i < arr.length; i++) {
			int curr = arr[i];
			int j = i-1;
			while(j >= 0 && curr < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = curr;
		}
		return arr;
	}
}
