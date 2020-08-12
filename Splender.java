import java.util.*;
class Bike
{
    void run()
    {
        System.out.println("Bike can run.");    
    }
}
class Splender extends Bike
{
    void run()
    {
        System.out.println("This bike speed is 100 kmn/h");    
    }
    public static void main(String[] args)
    {
        Bike bobj = new Splender();
        bobj.run();
    }
}
