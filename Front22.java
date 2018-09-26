package Codingbat;
/*
 * Given a string, take the first 2 chars and return the string with the 2 chars 
 * added at both the front and back, so "kitten" yields"kikittenki". 
 * If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */
public class Front22 {

	static String front22(String str)
	{
		String front;
		if(str.length() > 2)
		{
			front = str.substring(0, 2);
		}
		else
		{
			front = str;
		}
		
		return(front+str+front);
	}
	
	public static void main(String[] args)
	{
		System.out.println(front22("kitten"));
		System.out.println(front22("Ha"));
		System.out.println(front22("abc"));
	}
}
