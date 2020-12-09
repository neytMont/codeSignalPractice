
public class alterSum {
	public int[] alternatingSums(int[] a) {
		int[] ans = new int[2];
		int firstSum = 0;
		int secondSum = 0;
		firstSum += a[0];
		if(a.length > 1) {
			for(int i = 1; i < a.length; i++ ) {
				if(i%2 != 0) {//odds
					secondSum += a[i];
				}
				else if(i%2 == 0) {//even
					firstSum += a[i];
				}
				
			}
		}
		
		ans[0]=firstSum;
		ans[1]=secondSum;

		return ans;
	}
	
}
