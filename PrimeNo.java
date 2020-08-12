import java.util.Scanner;
class PrimeNo
{
	public static void main(String args[])
	{
		int sum = 0;
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter the number to check prime numbers: ");
		int n = Input.nextInt();
		System.out.println("The prime numbers are: ");
		for(int i=1;i<=n;i++)
		{
			int count = 0;
			for(int j=1;j<=n;j++)
			{
				if(i%j == 0)
					count++;
			}
			if(count==2)
				System.out.println(+i);
		}
		sum = sum+i;
		System.out.println("The sum of the prime numbers is: "+sum);
	}
}
