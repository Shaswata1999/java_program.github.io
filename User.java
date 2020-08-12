import java.util.Scanner;
import java.util.Arrays;
class User
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = Input.nextInt();
        int a[] = new int[n];
        int largest = a[0];
        int smallest = a[0];
        for(int i=1;i<a.length;i++)
        {
             if(a[i]>largest)
            {
                largest = a[i];
            }
            if(a[i] < smallest)
            {
                smallest = a[i];
            }
        }     
        System.out.println("The largest value is: "+largest);
        System.out.println("The smallest number is: "+smallest);
    }
}
