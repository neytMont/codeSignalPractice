public class similar {
	public boolean areSimilar(int[] a, int[] b) {
	    if(Arrays.equals(a, b)){
		return true;
	    }
	    ArrayList<Integer> bList = new ArrayList<>();//make the second array a list
	    for(int i = 0; i < b.length; i++) {//add elements of b to arraylist
		bList.add(b[i]);
	    }
	    int count = 2;//how many swaps
	    while(count < 1) {//
		for(int i = 0; i < a.length; i++) {

		    if(a[i] != bList.get(i)) {//if the element on a is not equal to element on b
			count--;//subtract 1 to count

			int x = bList.indexOf(a[i]);//index of right element
			int curr = bList.indexOf(b[i]);//current index thats wrong
			System.out.println(x + " "+ a[i] +"\n" + curr + " " + b[i]);
			if(bList.contains(a[i])) {//look for the element
			    Collections.swap(bList, x, curr);//swap
			    continue;
			}

		    }
		    count--;
		}
		if(count > 1) {
		    break;
		}
		return true;
	    }
	    return false;
	}
}
