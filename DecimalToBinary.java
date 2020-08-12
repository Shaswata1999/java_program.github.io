import java.util.Scanner;
import java.io.IOException;
class DecimalToBinary
{
    public void converbinary()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal number: ");
        int num = sc.nextInt();
        int binary[] = new int[num];
        int index = 0;
        while(num>0)
        {
            binary[index++] = num%2;
            num = num/2;
        }
        System.out.println("Binary reoresentation is: ");
        System.out.println(" ");
        for(int i=(index-1);i>=0;i--)
        {
            System.out.print(binary[i]);
        }
    }
        public static void main(String[] args)
        {
            DecimalToBinary decimaltobinary = new DecimalToBinary();
            decimaltobinary.converbinary();
        }
}
