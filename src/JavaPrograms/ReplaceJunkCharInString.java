package JavaPrograms;

public class ReplaceJunkCharInString {

	public static void main(String[] args)
	{
		//---Program to extract just the numbers in a given String--------
		String S = "78472&(())Test";
		String Res = S.replaceAll("[^0-9]", "");
		System.out.println(Res);
	}

}
