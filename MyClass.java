package strings;

public class MyClass {
	public static void main(String args[])
	{
		String a="Well";
		String ab="All is "+a;
		String abc="All is Well";
		String abcd="All is Well";
		System.out.println(abc.hashCode());//get hashcode using hashCode() method
		System.out.println(ab.hashCode());
		System.out.println(abc==ab.intern());//share memory
		System.out.println(abcd.hashCode());
	}

}
