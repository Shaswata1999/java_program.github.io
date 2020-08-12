import java.util.Scanner;
class HappyNumber
{
    int rem=0,sum = 0;
    int sumsqdigit(int num)
    {
        int sum = 0;
        while(num!=0)
        {
            rem = num%10;
            sum = sum +(rem*rem);
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n;
        HappyNumber obj = new HappyNumber();
        while(temp>9)
        {
            temp = obj.sumsqdigit(temp);
        }
        if(temp==1)
            System.out.println("The number is happy number");
        else
            System.out.println("The number is not happy number");
    }
}
