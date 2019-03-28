//Swap odd indexed elements with its immediate next even indexed elements of given array?
package Java_Assignment2;

public class SwapOddIndexOfArrayToEvenIndex {
	public static void main(String[] args) {

		int[] c = { 1, 2, 3, 4, 5, 6 };
		String str1 = "";
		String str2 = "";
		for (int i = 0; i < c.length; i++) {
			if (i % 2 == 0) {
				str1 = str1 + c[i];
			} else {
				str2 = str2 + c[i];
			}
		}

		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		String str3 = "";
		for (int i = 0; i < c.length / 2; i++) {
			str3 = str3 + c2[i];
			str3 = str3 + c1[i];
		}

		int res = Integer.parseInt(str3);
		System.out.println("resut = " + res);
	}
}
