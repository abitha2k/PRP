import java.util.Scanner;
public class SumOfNum
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);			
		int A = s.nextInt();			
		int B = s.nextInt();
		int C = A+B;
		if(C&2==0)
			System.out.println("Sum is Even");
		else
			System.out.println("Sum is Odd");
	}
}
