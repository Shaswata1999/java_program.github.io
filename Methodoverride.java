import java.util.*;
class Person
{
    String firstname;
    String lastname;
    public Person(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }  
    public void print()
    {
        System.out.println("\t"+firstname+" "+lastname );
    }
}
class Proffessor extends Person
{
    public Proffessor(String firstname, String lastname)
    {
        super(firstname,lastname);
    }
    public void print()
    {
        System.out.println("Proffessor Details");
        super.print();
    }
}
public class Methodoverride
{
    public static void main(String[] args)
    {
        Proffessor pobj = new Proffessor("Atanu","Ghosh");
        pobj.print();
    }
}
