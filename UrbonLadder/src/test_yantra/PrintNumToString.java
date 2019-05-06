package test_yantra;

import java.util.Scanner;

public class PrintNumToString {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number must not be start from zero ");
		int num=s.nextInt();
		String[] arr = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
		String[] arr2 = { " ", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty", "Hundred",
				"Thousands", "Milion" };
		if (num < 20) {
			String str = arr[num];
			System.out.println(str);
		} else if (num >= 20 && num < 30) {
			int num1 = num - 20;
			String str = arr2[1] + " " + arr[num1];
			System.out.println(str);
		} else if (num >= 30 && num < 40) {
			int num1 = num - 30;
			String str = arr2[2] + " " + arr[num1];
			System.out.println(str);
		}

		else if (num >= 40 && num < 50) {
			int num1 = num - 40;
			String str = arr2[3] + " " + arr[num1];
			System.out.println(str);
		}

		else if (num >= 50 && num < 60) {
			int num1 = num - 50;
			String str = arr2[4] + " " + arr[num1];
			System.out.println(str);
		}

		else if (num >= 60 && num < 70) {
			int num1 = num - 60;
			String str = arr2[5] + " " + arr[num1];
			System.out.println(str);
		}

		else if (num >= 70 && num < 80) {
			int num1 = num - 70;
			String str = arr2[6] + " " + arr[num1];
			System.out.println(str);
		}

		else if (num >= 80 && num < 90) {
			int num1 = num - 80;
			String str = arr2[7] + " " + arr[num1];
			System.out.println(str);
		}

		else if (num >= 90 && num < 100) {
			int num1 = num - 90;
			String str = arr2[8] + " " + arr[num1];
			System.out.println(str);
		}

		else if (num >= 100 && num < 1000) {
			int fdigit = num % 10;
			int secdigit = num % 100;
			secdigit = secdigit / 10;
			if (secdigit == 1) {
				fdigit = (secdigit * 10) + fdigit;
				secdigit = 0;
			} else if (secdigit > 1) {
				secdigit = secdigit - 1;
			}
			int thirdDigit = num % 1000;
			thirdDigit = thirdDigit / 100;
			String str = arr[thirdDigit] + " " + arr2[9] + " " + arr2[secdigit] + " " + arr[fdigit];
			System.out.println(str);
		} else if (num >= 1000 && num < 10000) {
			int fdigit = num % 10;
			int secdigit = num % 100;
			secdigit = secdigit / 10;
			if (secdigit == 1) {
				fdigit = (secdigit * 10) + fdigit;
				secdigit = 0;
			} else if (secdigit > 1) {
				secdigit = secdigit - 1;
			}
			int thirdDigit = num % 1000;
			thirdDigit = thirdDigit / 100;
			int hplace = arr2.length - 3;
			if (thirdDigit == 0) {
				hplace = 0;
			}
			int fourthDigit = num % 10000;
			fourthDigit = fourthDigit / 1000;
			String str = arr[fourthDigit] + " " + arr2[arr2.length - 2] + " " + arr[thirdDigit] + " " + arr2[hplace]
					+ " " + " " + arr2[secdigit] + " " + arr[fdigit];
			System.out.println(str);

		} else if (num >= 10000 && num < 100000) {
			int fdigit = num % 10;
			int secdigit = num % 100;
			secdigit = secdigit / 10;
			if (secdigit == 1) {
				fdigit = (secdigit * 10) + fdigit;
				secdigit = 0;
			} else if (secdigit > 1) {
				secdigit = secdigit - 1;
			}
			int thirdDigit = num % 1000;
			thirdDigit = thirdDigit / 100;
			int hplace = arr2.length - 3;
			if (thirdDigit == 0) {
				hplace = 0;
			}
			int fourthDigit = num % 10000;
			fourthDigit = fourthDigit / 1000;

			int thplace = arr2.length - 2;

			int fifthDigit = num % 100000;
			fifthDigit = fifthDigit / 10000;
             if (fifthDigit == 1) {
				fourthDigit = (fifthDigit * 10) + fourthDigit;
				String str = arr[fourthDigit] + " " + arr2[thplace] + " " + arr[thirdDigit] + " " + arr2[hplace] + " "
						+ arr2[secdigit] + " " + arr[fdigit];
				System.out.println(str);
			} else {
				if (fifthDigit != 0 && fifthDigit != 1) {
					fifthDigit = fifthDigit - 1;
				}

				String str = arr2[fifthDigit] + " " + arr[fourthDigit] + " " + arr2[thplace] + " " + arr[thirdDigit]
						+ " " + arr2[hplace] + " " + arr2[secdigit] + " " + arr[fdigit];
				System.out.println(str);
			}

		}

	}

}
