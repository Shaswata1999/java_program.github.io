import java.util.*;
class Animal
{
    void eat()
    {
        System.out.println("Every animal has favourite food. ");
    }
}
class Dog extends Animal
{
    void eat()
    {
        System.out.println("Dogs eat meat ");
    }
}
class BabyDog extends Dog
{    
    void eat()
    {
        System.out.println("Baby Dog drink milk.  ");
    }
    public static void main(String[] args)
    {
        Animal obj = new Animal();
        Animal dobj = new Dog();
        Animal bobj = new BabyDog();
        obj.eat();
        dobj.eat();
        bobj.eat();
    }
}
