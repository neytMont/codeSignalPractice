
public class sortHeight {
	public int[] sortByHeight(int[] arr) {
		int[] ans = new int[arr.length];
		int[] people = new int[arr.length];
		int pIndex = 0;
		int numTrees = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == -1) {
				ans[i] = arr[i];//trees
				numTrees++;
			}
			if(arr[i] != -1) {
				people[pIndex] = arr[i];//people
				pIndex++;
			}
		}
		
		for(int i = 0; i < people.length; i++) {//sorting the people
			int curr = people[i];
			if(curr != 0) {
				int j = i - 1;
				while(j >= 0 && curr < people[j]) {
					people[j+1] = people[j];
					j--;			
				}
				people[j+1] = curr;
			}
		}
		int j = 0;
		for(int i = 0; i < ans.length; i++) {
			if(ans[i] == -1) {
				continue;
			}
			
			while( j < people.length - numTrees) {
				ans[i] = people[j];
				break;
			}
			j++;
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		for(int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + ", ");
		}
		System.out.println();
		for(int i = 0; i < people.length; i++) {
			System.out.print(people[i] + ", ");
		}
		return ans;
		
	}
}


/**
 *  int t;
    
    for(int i=0; i<a.length; i++)
        for(int j=i+1; j<a.length; j++)
            if(a[i]>a[j] && a[i]!=-1 && a[j]!=-1) {
                
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
    
    return a;
}
*/
