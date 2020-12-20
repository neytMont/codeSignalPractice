
public class similar {
	public boolean areSimilar(int[] a, int[] b) {
		ArrayList<Integer> bList = new ArrayList<>();
		for(int i = 0; i < b.length; i++) {
			bList.add(b[i]);
		}

		int count = 0;
		while(count <= 1) {
			for(int i = 0; i < a.length; i++) {

				if(a[i] != bList.get(i)) {
					count++;

					int x = bList.indexOf(a[i]);//the right num
					int curr = bList.indexOf(b[i]);//current index
					if(bList.contains(a[i])) {
						Collections.swap(bList, x, curr);
					}

				}
			}
			if(count > 1) {
				break;
			}
			return true;
		}
		return false;
	}
}
