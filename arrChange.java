public class arrChange {
	public int arrayChange(int[] inputArray) {
		int count = 0;//count variable
		for(int i = 0; i < inputArray.length - 1; i++) {//loop through the array except the last element
			while(inputArray[i+1] <= inputArray[i]) {//while the next element is less than or equal to the current element
				inputArray[i+1]++;//add 1 to the next element 
				count++;//add the count
			}
		}
		return count;//return the count
	}
}
