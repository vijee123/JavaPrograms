package JavaPrograms;

public class FindNoOfDiffChar {

	public static void main(String[] args) {
		
		String S = "Hi Welcome To Java Classes Tommorow At 2.00 p.m!!";
		int len = S.length();
		int UC_Count = 0;
		int LC_Count =0;
		int SpclCount = 0;
		int DigitCount = 0;
		for(int i=0; i<len; i++)
		 {
			char ch = S.charAt(i);
			if(ch>='a' && ch<='z')
				LC_Count++;
			else if (ch>='A' && ch<='Z')
				UC_Count++;
			else if (ch>='0' && ch<='9')
				DigitCount++;
			else if(ch!=' ')
				SpclCount++;
			}
		System.out.println("The number of upper case letters are: "+UC_Count);
		System.out.println("The number of lower case letters are: "+LC_Count);
		System.out.println("The number of digits are: "+DigitCount);
		System.out.println("The number of special characters are: "+SpclCount);

		
	}

}
