package stringmethods;

public class EndWithExample2 {
	public static void main(String args[])
	{
		String str="welcome to FACE.in";
		System.out.println(str.endsWith("in"));//return true 
		if(str.endsWith(".com"))//Strings are end with ".com" or not
		{
			System.out.println("String is ends with .com");
		}
		else
		{
			System.out.println("String is not ends with with .com");
		}
			
	}

}
