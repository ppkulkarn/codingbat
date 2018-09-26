package Codingbat;
/*
 * Given a string, return true if the string starts with "hi" and false otherwise.

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */
public class StartsHi {
	
	static boolean startHi(String str)
	{
		if(str.length()>1)
				return(str.substring(0, 2).equals("hi"));
		return false;
	}
	
	public static void main(String[] args)
	{
		System.out.println(startHi("hi there"));
		System.out.println(startHi("hi"));
		System.out.println(startHi("hello hi there"));
	}

}
