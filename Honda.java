import java.util.*;
class Bike
{
    int speed_limit = 100;
}
class Honda extends Bike
{
    int speed_limit = 150;
    public static void main(String[] args)
    {
        Bike obj = new Honda();
        System.out.println(obj.speed_limit);
    }
}
