package JavaPrograms;

import java.util.Scanner;

public class CalcNoOfWordsInString {

	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Sentence :");
		String Sentence = sc.nextLine();
		int WordsCount = 0;
		int length = Sentence.length();
		for(int i=0; i<length-1; i++)
		{
			if((Sentence.charAt(i)==' ')&&(Sentence.charAt(i+1)!= ' '))
			{
				WordsCount++;
			}
				
		}
		
		
		System.out.println("The number of words in the string is :"+WordsCount);
	}
		
	
}
	