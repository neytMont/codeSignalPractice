public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**2.
		  	centuryFromYear cfn = new centuryFromYear();
		  	System.out.println(cfn.century(1905));
		*/
		/**3.
		 	String ex = "hlbeeykoqqqqokyeeblh";
			System.out.print(ex.length());
			checkPalindrome cp = new checkPalindrome();
			Boolean ans = cp.checkPalin(ex);
			if(ans) {
				System.out.print("Yes");
			}
			else {
				System.out.print("nah");
			}
		 */
		/**4.
		 * 	int[] num = {-23, 4, -3, 8, -12};
		adjacentElementsProduct aep = new adjacentElementsProduct();
		System.out.print(aep.adjacent(num));
		
		 */
		/**5.
		 * shapeArea sa = new shapeArea();
		System.out.print(sa.shape(3));
		 */
		/**6.
		 * makeArrayConsecutive2 mac = new makeArrayConsecutive2();
		int[] num = {6,2,3,8};
		System.out.print(mac.consecArray(num));
		 */
		/**7.
		 * almostIncreasingSequence ais = new almostIncreasingSequence();
		int[] num = {1,3,2,1};
		int[] num1 = {1,3,2};
		System.out.print(ais.incSequence(num) + "\n" + ais.incSequence(num1));
		 */
		/**9.
		 * allLongestStrings als = new allLongestStrings();
		String[] input = {"aba", "aa", "ad", "vcd", "aba"};
		String[] output = als.longestString(input);
		for(int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
		System.out.println("==========================================");
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
		 */
		/**10 check and done
		 * 
		 */
		/**11.
		 * isLucky il = new isLucky();
		System.out.print(il.lucky(1230));
		 */
		/**12.
		 * 		sortHeight sh = new sortHeight();
		int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
		System.out.println(sh.sortByHeight(a));
		 */
		/**13.reverseInParen rip = new reverseInParen();
		String in = "foo(bar(baz))blim";
		System.out.print(rip.reverseInParentheses(in));
		 * 
		 */
		/**14.alterSum as = new alterSum();
		int[] q1 = {100, 50};
		int[] q2 = {50, 0};
		as.alternatingSums(q1);
		System.out.println();
		as.alternatingSums(q2);
		 * 
		 */
		
		/**15.		border b = new border();
		String[] q = {"wzy**"};
	
		b.addBorder(q);
		 * 
		 */

		/**16.
		 * 
		 */
		similar s = new similar();
		int[] a = {597, 762, 255, 896, 548, 569, 654, 438, 523, 784, 557, 565, 157, 481, 785, 455, 429, 465, 715, 8, 840, 463, 156, 539, 209, 956, 910, 550, 978, 553, 955, 699, 628, 669, 285, 976, 585, 466, 123, 782, 781, 457, 389, 110, 850, 925, 1, 224, 793, 283, 869, 310, 839, 868, 172, 373, 135, 171, 853, 226, 842, 411, 66, 840, 202, 483, 723, 427, 140, 742, 134, 612, 13, 782, 214, 741, 178, 354, 663, 889, 174, 845, 25, 401, 411, 274, 556, 877, 479, 594, 399, 347, 317, 205, 626, 5, 779, 978, 349, 292};
		int[] b = {597, 762, 255, 896, 548, 569, 654, 438, 523, 784, 557, 565, 157, 481, 785, 455, 429, 465, 715, 8, 840, 463, 156, 539, 209, 956, 910, 550, 978, 553, 955, 699, 628, 669, 285, 976, 585, 466, 123, 782, 781, 457, 389, 110, 850, 925, 1, 224, 793, 283, 869, 310, 839, 868, 172, 373, 135, 171, 853, 226, 842, 411, 66, 840, 202, 483, 723, 427, 140, 742, 134, 612, 13, 782, 214, 741, 178, 354, 663, 889, 174, 845, 25, 401, 411, 274, 556, 877, 479, 594, 399, 347, 317, 205, 626, 5, 779, 978, 349, 292};
		System.out.println(s.areSimilar(a, b))
		;
		
	}

}
