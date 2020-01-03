package stringmethods;

import java.util.ArrayList;

public class EqualExample2 {
	public static void main(String args[])
	{
		String str1="FACENXT";
		ArrayList<String> list=new ArrayList<>();//create array list and add item to it
		list.add("FACE");
		list.add("FACEPREP");
		list.add("FACENXT");
		list.add("FACENOW");
		for(String str : list)
		{
			if(str.equals(str1))//condition for find matching or not
			{
				System.out.println("FACENXT is present");
			}
		}
		
	}

}
