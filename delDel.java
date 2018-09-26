package Codingbat;
/*
 * Given a string, if the string "del" appears starting at index 1, 
 * return a string where that "del" has been deleted. Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */
public class delDel {
	
	static String Deldel(String str)
	{
		
		if(str.substring(1, 4).equals("del"))
		{
			return(str.substring(0, 1)+str.substring(4, str.length()));
		}
		
		return str;
	}
	
	public static void main(String[] args)
	{
		System.out.println(Deldel("adelbc"));
		System.out.println(Deldel("adelHello"));
		System.out.println(Deldel("adebc"));
	}

}
