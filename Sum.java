import java.util.Scanner;
class Sum
{
	public static void main(String args[])
	{
		int s = 0;
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter the three didgit number: ");
		int n = Input.nextInt();
		while(n!=0)
		{
			int rem = n%10;
			s = s+rem;
			n = n/10;
		}
		System.out.println("The sum of the three digit number is: "+s);
	}
}
