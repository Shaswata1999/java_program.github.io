import java.util.Scanner;
class MagicNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while(n>0 || sum>9)
        {
            if(n==0)
            {
                n=sum;
                sum = 0;
            }
            sum = sum + n%10;
            n = n/10;
        }
        if(sum==1)
            System.out.println("The number is a magic number ");
        else
            System.out.println("The number is not a magic number ");
    }
}
