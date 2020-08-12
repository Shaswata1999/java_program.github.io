import java.util.Scanner;
class Amstrong
{
    public static void main(String[] args)
    {
        int total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int num = number;
        while(num!=0)
        {
            int temp = num%10;
            total = total+(temp*temp*temp);
            num = num/10;
        }
        if(total == number)
            System.out.println(number+ " "+"is an Amstrong number.");
        else
            System.out.println(number+" "+ "not an amstrong number.");
    }
}
