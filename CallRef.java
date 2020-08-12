import java.util.*;

class CallRef
{
    int a = 10;
    int b = 20;
    public static void main(String args[])
    {
        CallRef CallRefobj = new CallRef();
        public void swapCallRef(CallRefobj);
    }
    public void swapCallRef(CallRef obj1)
    {
        int temp;
        temp = obj1.a;
        obj1.a = obj1.b;
        obj1.b = temp;
        System.out.println("the swap value is: "+obj1.a+obj1.b);
    }
}
