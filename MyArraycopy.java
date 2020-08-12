import java.util.Arrays;

class MyArraycopy
{
    public static void main(String[] args)
    {
     int source[] = new int[10];
     int destination[] = new int[10];
     for(int i=0; i<source.length; i++)
     {
         source[i] = i;
     }
     destination = Arrays.copyOfRange(source,3,source[6]);
     System.out.println(Arrays.toString(destination));
    }
}
