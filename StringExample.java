package strings;

public class StringExample {

public static void main(String args[])
{
	String str="I, am, going, to, split, this, string by, space.";
	String[] str1=str.split(",");//Split string and replace commas
	for(String a:str1)//for each loop
		System.out.print(a);
}

}
