import java.util.Scanner;
public class GreaterNumber
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);			
		int A = s.nextInt();			
		int B = s.nextInt();
		if(A > B)											
			System.out.println(A);
		else if(B > A)
			System.out.println(B);
		else
			System.out.println("Numbers are Equal");												
	}
}
