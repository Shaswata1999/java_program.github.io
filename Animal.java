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
class sinheritence
{
    public static void main(String[] args)
    {
        Dog obj = new Dog();
        obj.eat();
        obj.bark();    
    }
}

