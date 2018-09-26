package Codingbat;
/*
 * Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false


 */
public class StringE {
	
	static boolean stringE(String str)
	{
		return(str.substring(1, 3).contains("e"));
	}
	
	public static void main(String[] args)
	{
		System.out.println(stringE("Hello"));
		System.out.println(stringE("Heelle"));
		System.out.println(stringE("Heelele0"));
	}

}
