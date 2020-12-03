
import java.util.ArrayList;
import java.util.List;

public class allLongestStrings {
	public String[] longestString(String[] inputArray) {
		int longestNum = 0;
		List<String> listString = new ArrayList<>();
		

		for(int i = 0; i < inputArray.length; i++) {//looking for the longest String
			int currElement = inputArray[i].length();
			if(longestNum <= currElement) {
				longestNum = currElement;
			}
		}
		for(int i = 0, k = 0; i < inputArray.length; i++) {//putting the elements in the new array
			if(inputArray[i].length() == longestNum) {
				listString.add(inputArray[i]);
				k++;
			}
		}
		return listString.toArray(new String[listString.size()]);
		
	}
}
