import java.util.*;

class Bank
{
    int Empid;
    String EmpName;
    
    public Bank(int id, String name)
    {
        this.Empid = id;
        this.EmpName = name;
    }
    void display()
    {
        System.out.println("ID: "+Empid + "Name: "+EmpName);
    }
    public static void main(String args[])
    {
        Bank Bankobj1 = new Bank(1234,"Ram");
        Bank Bankobj2 = new Bank(6321,"Karim");
        Bankobj1.display();
        Bankobj2.display();
    }
}
