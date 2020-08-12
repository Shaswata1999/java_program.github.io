/*reate a class named 'Member' having the following members:
    Data members
    1 - Name
    2 - Age
    3 - Phone number
    4 - Address
    5 - Salary
    It also has a method named 'printSalary' which prints the salary of the members.
    Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members                    'specialization'       and   'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.*/

import java.util.*;
import java.util.Scanner;

class Member
{
    String name,add,ph,dept,spel;
    int age;
    void info()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee: ");
        name = sc.next();
        System.out.println("Enter the age of the employee: ");
        age = sc.nextInt();
        System.out.println("Enter the phone number of the employee: ");
        ph = sc.next();
        System.out.println("Enter the address of the employee ");
        add = sc.next();
        System.out.println("Please enter the depertment of the employee :");
        dept = sc.next();
        System.out.println("What is the specilization of the employee?? ");
        spel = sc.next();
    }
}
class Manager extends Member
{
    double gross = 0.0; 
    double basic;
    void printSalary()
    {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the basic salary of the employee: ");
        basic = c.nextDouble();
        System.out.println("Enter TA of the employee: ");
        double t = c.nextDouble();
        double TA = t*basic;
        System.out.println("Enter DA of the employee: ");
        double d = c.nextDouble();
        double DA = d*basic;
        System.out.println("Enter HRA of the employee: ");
        double h = c.nextDouble();
        double HRA = h*basic;
        System.out.println("Enter Medical salary of the employee: ");
        double m = c.nextDouble();
        double Medical = m*basic;
        gross = basic+TA+DA+HRA+Medical;
    }
    void display()
    {
        System.out.println("        DETAILS OF THE EMPLOYEE       ");
        System.out.println("NAME OF THE EMPLOYEE: "+name);
        System.out.println("Depertment: "+dept);
        System.out.println("Specilization in"+spel);
        System.out.println("AGE = "+age);
        System.out.println("Contact Number : "+ph);
        System.out.println("Address : "+add);
        System.out.println("Basic Salary : "+basic);
        System.out.println("Monthly gross salary : "+gross);
    }
}
class Employee extends Member
{
    double gross = 0.0; 
    double basic;
    void printSalary()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the basic salary of the employee: ");
        basic = s.nextDouble();
        System.out.println("Enter TA of the employee: ");
        double t = s.nextDouble();
        double TA = t*basic;
        System.out.println("Enter DA of the employee: ");
        double d = s.nextDouble();
        double DA = d*basic;
        System.out.println("Enter HRA of the employee: ");
        double h = s.nextDouble();
        double HRA = h*basic;
        System.out.println("Enter Medical salary of the employee: ");
        double m = s.nextDouble();
        double Medical = m*basic;
        gross = basic+TA+DA+HRA+Medical;
    }
    void display()
    {
        System.out.println("        DETAILS OF THE EMPLOYEE       ");
        System.out.println("NAME OF THE EMPLOYEE: "+name);
        System.out.println("AGE = "+age);
        System.out.println("Contact Number : "+ph);
        System.out.println("Address : "+add);
        System.out.println("Basic Salary : "+basic);
        System.out.println("Monthly gross salary : "+gross);
    }
}
class Details
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("       PLEASE SELECT THE EMPLOYEE        ");
        System.out.println("\n1.Manager\n2.Employee");
        int ch = scan.nextInt();
        switch(ch)
        {
        case 1:
            Manager mobj = new Manager();
            System.out.println("Enter the number of manager ");
            int n = scan.nextInt();
            for(int i=0; i<n; i++)
            {
                mobj.info();
                mobj.printSalary();
                mobj.display();
                return;
            }
        case 2:
            Employee eobj = new Employee();
            System.out.println("Enter the number of employee ");
            int x = scan.nextInt();
            for(int i=0; i<x; i++)
            {
                eobj.info();
                eobj.printSalary();
                eobj.display();
                return;
            }
        }
    }
}
