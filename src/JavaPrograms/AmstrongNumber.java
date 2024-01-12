package JavaPrograms;

import java.util.Scanner;

public class AmstrongNumber {
	
	public static void main(String args[])
	{
		
		//Adding a comment for GIT
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int no = sc.nextInt();
		int a = no;
		int j, i=0;
		while (no>0)
		{
			j = no%10;
			i = (j*j*j)+i;
			no = no/10;
		}
		
		if(i==a)
			System.out.println("This is an Amstrong number..");
		else
			System.out.println("This is NOT an Amstrong number...");
		
	}

}
