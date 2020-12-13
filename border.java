public class border {
	public String[] addBorder(String[] picture) {
		StringBuilder str = new StringBuilder();
		StringBuilder str1;
	
		String[] ans = new String[picture.length+2];
		
		int strLength = picture[0].length();
		
		for(int i  = 0; i < strLength+2; i++) {//how much asterisk the top & bottom border
			str.append("*");
		}
		
		ans[0] = str.toString();//top border
			
		for(int i = 0; i< picture.length; i++) {//putting side borders
			str1 = new StringBuilder();
			str1.append("*" + picture[i] + "*");
			ans[i+1] = str1.toString();
		}
		
		ans[ans.length-1] = str.toString(); //bottom border
		
		for(int i = 0; i < ans.length; i++) {//printing
			System.out.println(ans[i]);
		}
		return ans;
	}
}
