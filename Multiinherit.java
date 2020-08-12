import java.io.*;
import java.util.*;

class Animal
{
    void eat()
    {
        System.out.println("Animal can eat ");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog can bark ");
    }
}
class Cow extends Dog
{
    void eatgrass()
    {
        System.out.println("Cow can eat grass ");    
    }
}
class multiinherit
{
    public static void main(String[] args)
    {
        Cow obj = new Cow();
        obj.eat();
        obj.bark();
        obj.eatgrass();    
    }
}
