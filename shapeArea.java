
public class shapeArea {
	public int shape(int n) {
		//n=4 => 25
		//n=3 => 13
		//n=2 => 5
		//n=1 => 1
		//(n-1)(2n-1)+n
		//3(7)+4 = 25
		//2(5)+3 = 13
		//1(3)+2
		int formula = (n-1) * (2*n - 1) + n;
		return formula;
	}
}
