import java.io.*;
import java.util.*;

class Animal
{
    void live()
    {
        System.out.println("They live in forest ");
    }
}
class Tiger extends Animal
{
    void meat()
    {
        System.out.println("They eat meat ");
    }
}
class Lion extends Animal
{
    void roar()
    {
        System.out.println("The can roar ");
    }
}
class Herachical
{
    public static void main(String[] args)
    {
        Tiger obj = new Tiger();
        Lion obj1 = new Lion();
        obj.live();
        obj.meat();
        obj1.live();
        obj1.roar();
    }
}
