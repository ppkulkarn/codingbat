package Codingbat;
/*
 * Given a string, return true if the first instance of "x" in the string is
 *  immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */
public class DoubleXX {

	
	static boolean doubleXX(String str)
	{
		for(int i = 0; i < str.length()-1; i++)
		{
			if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x')
				return true;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		System.out.println(doubleXX("axxbb"));
		System.out.println(doubleXX("axaxax"));
		System.out.println(doubleXX("xxxxx"));
	}
	
}
