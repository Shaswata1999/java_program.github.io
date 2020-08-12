import java.util.*;

class CallByValue
{
    public static void main(String[] args)
    {
        int orign = 10;
        System.out.println("The original value is: "+orign);
        System.out.println("the original value after change is: "+change(orign));
        System.out.println("The original value is: "+orign);
    }
    public static int change(int a)
    {
        a = 20;
        return a;
    }
}
