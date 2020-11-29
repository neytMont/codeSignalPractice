
public class adjacentElementsProduct {
	public int adjacent(int[] inputArray) {
		int currHighest = 0;
		
		for(int i = 0; i < inputArray.length; i++) {//loop array
			if(i+1 == inputArray.length) {
				break;
			}
			int num1 = inputArray[i];//left element
			int num2 = inputArray[i+1];//right element
			int temp = num1 * num2;//product
			if(currHighest == 0) {
				currHighest = temp;
			}
			if(temp > currHighest) {
				currHighest = temp;
			}
		
		}
		return currHighest;
	}
}
