/*(1)^1+(3)^2+(3)^3 = 135*/

import java.util.Scanner;
import java.lang.Math;
class DisariumNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int copy =num; int d=0; int len=0; int sum=0;
        String s = Integer.toString(num);
        len=s.length();
        while(copy>0)
        {
            d = copy % 10;
            sum = sum+(int)Math.pow(d,len);
            len--;
            copy = copy / 10;
        }
        if(sum==num)
            System.out.println("The number is a Disarium number");
        else
            System.out.println("The number is not a Disarium number");
    }
}
