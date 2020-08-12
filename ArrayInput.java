import java.util.Arrays;
import java.util.Scanner;

class ArrayInput
{
    public static void main(String[] args)
    {
        int sum = 0;
        int avg = 0;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = Input.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter" +(i+1)+" elements to array:: ");
            a[i] = Input.nextInt();
            sum = sum+a[i];
        }
        avg = sum/n; 
        System.out.println(Arrays.toString(a));
        System.out.println("The sum of the array element is: "+sum);
        System.out.println("The avarage of the array element is: "+avg);
    }
}

