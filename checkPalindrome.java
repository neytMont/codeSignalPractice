
public class checkPalindrome {
	public boolean checkPalin(String input) {
		int stringLength = input.length();
		if(stringLength == 1) {//check if there is only one letter in the input
			return true;
		}
		else{
			char[] palin = input.toCharArray();//input to a char array
			int count = stringLength;//for decrementing 
			int mid = stringLength/2;//look for middle
			int i = 0;
			while(i < mid) {
				for(i = 0; i < count; i++) {//loops through the array
					char char1 = palin[i];//first letter
					char char2 = palin[count-1];//letter opposite of first letter
					if(char1!=char2) {//if first letter is not equal second letter
						return false;
					}
					count--;//decrement the count
				}
			}
			return true;
		}
	}
}
