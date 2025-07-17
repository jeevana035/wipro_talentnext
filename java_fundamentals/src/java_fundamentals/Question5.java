package java_fundamentals;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if( n1 % 10 == n2 % 10)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
