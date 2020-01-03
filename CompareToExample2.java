package stringmethods;

public class CompareToExample2 {
	public static void main(String args[])
	{
		String s1="hello";
		String s2="";
		String s3="me";
		System.out.println(s1.compareTo(s2));//return 5(length of s1),because String s1 is grater than s2,ie s2 is an empty string.
		System.out.println(s2.compareTo(s3));//return -2(length of s3),because s2 is less than s3.
	}

}
