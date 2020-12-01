
public class almostIncreasingSequence {
	public boolean incSequence(int[] sequence) {
		int count = 0;
		int size = sequence.length;
		if(size == 1) {
			return true;
		}
		for(int i = 0; i < size-1 && count <= 1; i++) {
			if(sequence[i] >= sequence[i+1]) {
				count++;
				if(i>0 && (i+2)<size && sequence[i-1] >= sequence[i+1] && sequence[i] >= sequence[i+2]) {
					count++;
				}
			}
		}
		return (count<=1);
	}
}
//{1,2,3}
