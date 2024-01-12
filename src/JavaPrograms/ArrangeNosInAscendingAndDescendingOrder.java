package JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrangeNosInAscendingAndDescendingOrder {

	public static void main(String[] args)
	{
		// ----ArrangeNosInAscendingOrder-------------
		Scanner sc= new Scanner(System.in);
		System.out.println("How many numbers are you going to enter?");
		int NoCount = sc.nextInt();
		int[] a=new int[NoCount];
		for (int i=0; i<NoCount; i++)
		{
			System.out.println("Enter your number "+i);
			a[i] = sc.nextInt();
			
		}
		String myString = Arrays.toString(a);
		System.out.println("The entered numbers are: "+myString);
		Arrays.sort(a);
       		System.out.println("The numbers in ascending order are: "+Arrays.toString(a));
       		
       		System.out.print("The numbers in descending order are: [");
      	  
      	  for(int i=a.length-1; i>=0; i--)
      	  {
      		 System.out.print(a[i]+",");  
      	  }
      	  System.out.print("]");
	}}
