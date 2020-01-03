package stringmethods;

public class CompareToExample1 {
	public static void main(String args[])
	{
		String s1="hello";
		String s2="hello";
		String s3="meklo";
		String s4="hemlo";
		String s5="flag";
		System.out.println(s1.compareTo(s2));// return 0 if both are equal.
		System.out.println(s1.compareTo(s3));// return -5 if "h" is 5 times lower than "m".
		System.out.println(s1.compareTo(s4));// return -1 if "l" is 1 times lower than "m".
		System.out.println(s1.compareTo(s5));// return 2 if "h" is 2 times grater than "f".
	}

}
