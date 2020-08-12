import java.util.Arrays;
import java.util.Scanner;
class ReverseArray
{
    public static void main(String[] args)
    {
        int x;
        int number[] = new int[25];
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number you want to enter: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers: ");        
        for(int i=0;i<size;i++)
        {
            number[i] = sc.nextInt();
        }
        for(x=0;x<size;x++)
        {
            System.out.println("Input elements are: "+number[x]);
        }        
        //int j = 0;
        int j = x-1;
        x = 0;
        while(x<j)
        {
            int temp = number[x];
            number[x] = number[j];
            number[j] = temp;
            x++;
            j--;
        }
        System.out.println("Reverse array: ");
        for(int y=0; y<size;y++)
        {
            System.out.println(+number[y]);
        }
    }
}
