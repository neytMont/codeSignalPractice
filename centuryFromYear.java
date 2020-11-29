
public class centuryFromYear {
	public int century(int year) {
		int ans;
		int centuryInt = year / 100;
		int remainder = year % 100;
		if(remainder > 0) {
			ans = centuryInt + 1;
		}
		else {
			ans = centuryInt;
		}
		return ans;
	}
}
