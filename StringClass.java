package strings;

public class StringClass {
	public static void main(String args[])
	{
		String s1,s2;
		s1=new String("subi");
		s2=new String("subi");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());//Get hashcode of S1
		System.out.println(s2.hashCode());//Get hashcode of S2
		s2=s1+s2;//concact
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
	}

}
