package Codingbat;
/*
 * Given two non-negative int values, return true if they have the same last digit, 
 * such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true


 */
public class LastDigit {
	
	static boolean lastDigit(int a, int b)
	{
		return( a % 10 == b % 10);
	}
	
	public static void main(String[] args)
	{
		System.out.println(lastDigit(7,27));
		System.out.println(lastDigit(6,27));
		System.out.println(lastDigit(4,115));
	}

}
