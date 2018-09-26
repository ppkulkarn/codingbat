package Codingbat;
/*
 * Given a string and a non-negative int n, return a larger string that is n copies of the
 *  original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
public class StringTimes {
	
	static String stringTimes(String str, int n)
	{
		String times ="";
		for(int i =0; i < n; i++)
		{
			times = times + str;
		}
		
		return times;
	}
	
	public static void main(String[] args)
	{
		System.out.println(stringTimes("Hi",3));
		System.out.println(stringTimes("Hi",2));
		System.out.println(stringTimes("Hi",1));
	}

}
