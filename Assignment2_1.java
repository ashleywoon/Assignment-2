import java.util.Scanner;

public class Assignment2_1
{
	static public void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		double guess, r, n;

		System.out.print("Enter your positive square root: ");
		n = input.nextDouble();
		guess = n/2;

		for (int i=5; i>0; i--)
		{
			r = n/guess;
			guess = (guess + r)/2;
		}
		System.out.printf("%.2f", guess);
	}
}