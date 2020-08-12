import java.util.*;

class Swaping
{
    public static void main(String args[])
    {
        int x = 10;
        int y = 20;
        System.out.println("The value of x is:"+x);
        System.out.println("The value of y is:"+y);
        swapvalue(x,y);
    }
    public static void swapvalue(int a, int b)
    {
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap the value of x is: "+a);
        System.out.println("After swap the value of y is: "+b);
    }
}
