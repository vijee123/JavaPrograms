package JavaPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	
		//dumb message in master to commit
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your String:");
		String myString = sc.next();
		int length = myString.length();
		String Rev = "";
		for(int i=length-1; i>=0; i--)
		{
			
			Rev = Rev+myString.charAt(i); 
		}
		System.out.println("The Reverse String is: "+Rev);
		
	}

}
