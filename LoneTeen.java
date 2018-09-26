package Codingbat;
/*
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
 * Given 2 int values, return true if one or the other is teen, but not both.

loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
 */
public class LoneTeen {
	
	static boolean loneTeen(int a, int b)
	{
		boolean aTeen = (a>=13 && a <= 19);
		boolean bTeen = (b >=13 && b <= 19);
		return((aTeen && !bTeen)||(!aTeen && bTeen));
	}
	
	public static void main(String[] args)
	{
		System.out.println(loneTeen(13,99));
		System.out.println(loneTeen(21,19));
		System.out.println(loneTeen(13,13));
	}

}
