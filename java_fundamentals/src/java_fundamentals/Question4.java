package java_fundamentals;
import java.util.*;

public class Question4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if ( n > 0)
		{
			System.out.println("The number is positive");
		}
		else if(n < 0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is zero");
		}

	}

}
