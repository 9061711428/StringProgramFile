package stringmethods;

public class ConcatExample1 {
	public static void main(String args[])
	{
		String s1="java string";
		s1.concat("is mutable");//doesn't concat it,because string is immutable.
		System.out.println(s1);
		s1=s1.concat(" is immutable so assign it explicitly");// assign to an object when Strings are concat.
		System.out.println(s1);
	}

}
