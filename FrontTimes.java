package Codingbat;

/*
 * Given a string and a non-negative int n, we'll say that the front of the string
 *  is the first 3 chars, or whatever is there if the string is less than length 3. 
 *  Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */
public class FrontTimes {
	
	static String frontTimes(String str, int n)
	{
		String frontTimes = "";
		String result="";
		if(str.length()>3)
		{
			frontTimes = str.substring(0,3);
		}
		else
		{
			frontTimes = str;
		}
		
		for(int i =0; i < n; i++)
		{
			result= result+frontTimes;
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		System.out.println(frontTimes("Hi",3));
		System.out.println(frontTimes("Hello",2));
		System.out.println(frontTimes("there",3));
	}

}
