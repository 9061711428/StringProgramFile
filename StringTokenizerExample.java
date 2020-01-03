package strings;
import java.util.StringTokenizer;
public class StringTokenizerExample { 
	public static void main(String args[])
	{
	
		String str="I , am , going , to , split, this, String by, space";
		StringTokenizer st=new StringTokenizer(str);//invoke StringTokenizer
		System.out.println("Split by space");
		while(st.hasMoreElements())//check next has any element is present or not
		{
		System.out.println(st.nextElement());
		
		}
		System.out.println();
		System.out.println("Split by ,");
		StringTokenizer st2=new StringTokenizer(str, ",");
		while(st2.hasMoreElements())
		{
		System.out.println(st2.nextElement());
		
		}
	}
	
}
