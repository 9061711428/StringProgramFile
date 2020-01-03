package stringmethods;

public class CharAtExample4 {
	public static void main(String args[]) {
		String str = "welcome to FACE portal";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == 't')// fectching the frequently occur character 't' from the string.
			{
				count++;// count number of times character is occur

			}
		}
		System.out.println("Frequency of t is:" + count);
	}

}
