import java.util.ArrayList;

public class commonCharacterCount {
	public int commonChar(String s1, String s2) {
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		int count = 0;
				
		ArrayList<Character> s1List = new ArrayList<>();
		ArrayList<Character> s2List = new ArrayList<>();
		
		//Populating the list
		for(int i = 0; i < s1Array.length; i++) {
			s1List.add(s1Array[i]);
		}
		for(int i = 0; i < s2Array.length; i++) {
			s2List.add(s2Array[i]);
		}
		
        //compare first list to second list while "cancelling" each same letter
		for(int i = 0; i < s1List.size(); i++) {
			for(int j = 0; j < s2List.size(); j++) {
				if(s1List.get(i) == s2List.get(j)) {
					count++;
					s2List.remove(j);
					break;
				}	
			}
			
		}
		
		return count;
	}
}
