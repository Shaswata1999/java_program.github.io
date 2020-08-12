import java.util.*;
class Bank
{
    void interest()
    {
        System.out.println("Every bank give rate of interest. ");
    }
}
class SBI extends Bank
{
     void interest()
    {
        System.out.println("SBI rate of intersest is 8% ");
    }
}
class ICICI extends Bank
{
     void interest()
    {
        System.out.println("ICICI rate of intersest is 7.5% ");
    }
}
class AXIS extends Bank
{
     void interest()
    {
        System.out.println("AXIS rate of intersest is 7% ");
    }
}
class Polymorphism
{
    public static void main(String[] args)
    {
        Bank bobj = new Bank();
        Bank sobj = new SBI();
        Bank iobj = new ICICI();
        Bank aobj = new AXIS();
        bobj.interest();
        sobj.interest();
        iobj.interest();
        aobj.interest();
    }
}
