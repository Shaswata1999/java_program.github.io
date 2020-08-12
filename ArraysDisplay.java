import java.util.Arrays;
class ArraysDisplay
{
    public static void main(String[] args)
    {
        int[] a={50,10,30,5,20};
        System.out.println("Arrays elements are: ");
        //System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        for(int i=0;i<5;i++)
            System.out.println(+a[i]);
    }
}
