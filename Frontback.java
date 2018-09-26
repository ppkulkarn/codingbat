package Codingbat;
/*
 * Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */
public class Frontback {

	static String frontBack(String str)
	{
		if(str.length() >= 2)
		{
			String front=str.substring(0, 1);
			String back=str.substring(str.length()-1, str.length());
			String mid = str.substring(1, str.length()-1);
			
			return(back+mid+front);
		}
		else
		{
			return str;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(frontBack("code"));
		System.out.println(frontBack("a"));
		System.out.println(frontBack("ab"));
	}
}
