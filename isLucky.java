
public class isLucky {
	public boolean lucky(int n) {
		char[] num = ("" + n).toCharArray();
		
		int half = num.length/2 - 1;
	
		int firstHalfSum = 0;
		int secondHalfSum = 0;
	
		for(int i = 0; i < num.length; i++) {//loop through the num
			if(i <= half) {//add the first half
				firstHalfSum += Character.getNumericValue(num[i]);
			}
			else if (i > half){//add the second half
				secondHalfSum += Character.getNumericValue(num[i]);
			}
		}
		
		System.out.println(firstHalfSum + "\n" + secondHalfSum);
		
		if(firstHalfSum == secondHalfSum) {
			return true;
		}
		else{
			return false;
		}
		
	}
}
