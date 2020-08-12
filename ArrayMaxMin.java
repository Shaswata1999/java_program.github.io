import java.util.Arrays;
class ArrayMaxMin
{
    public static void main(String[] args)
    {
        int a[] = {12,5,30,21,17};
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
