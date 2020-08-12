import java.io.*;
import java.util.*;

class Bike
{
    void wheeler()
    {
        System.out.println("Bike has two wheel. ");
    }
}
class fourwheeler
{
    void Door()
    {
        System.out.println("car has four doors. ");
    }
}
class Car extends Bike
{
    void machine()
    {
        System.out.println("Both have machine");
    }
}
class Multipleinheri
{
    public static void main(String[] args)
    {
        Car obj = new Car();
        obj.wheeler();
        //obj.Door();
        obj.machine();
    }
}
