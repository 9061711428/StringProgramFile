package stringmethods;

public class ContainsExample3 {
	public static void main(String args[])
	{
		String str="To learn java visit focusacademy.in";
		if(str.contains("focusAcademy.in.com"))//string contains "focusAcademy.in.com"
		{
			System.out.println("This string contains focusacademy.in");
		}
		else
		{
			System.out.println("Result not found");
		}
	}

}
