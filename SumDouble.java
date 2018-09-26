package Codingbat;
/*
 * Given two int values, return their sum. Unless the two values are the same, 
 * then return double their sum.
 */
public class SumDouble {
	
	static int sumDouble(int a, int b)
	{
		if(a == b)
		{
			return(2 * (a+b));
		}
		else
		{
			return(a+b);
		}
	}
	
	static int sumDouble1(int a, int b)
	{
		int sum = a + b;
		if(a == b)
		{
			sum = 2 * sum;
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		System.out.println(sumDouble(10,20));
		System.out.println(sumDouble(10,10));
		System.out.println(sumDouble(30,20));
		
		System.out.println(sumDouble1(3,3));
	}

}
