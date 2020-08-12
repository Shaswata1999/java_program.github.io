import java.util.*;

class Swaping
{
    public static void main(String args[])
    {
        int x = 10;
        int y = 20;
        System.out.println("The value of x is:"+x);
        System.out.println("The value of y is:"+y);
        x = x+y;
        x = x-y;
        y = x-y;
        System.out.println("The value of x after swap is:"+x);
        System.out.println("The value of y after swap is: "+y);
    }
}
