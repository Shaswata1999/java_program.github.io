/*Create a super class Employee having attributes eId, eName, basicSal, da, ta, hra, ma, grossSal. Create getter and setter methods of all the attributes and overwrite toString() method to display an employee object appropriately. Your class should also have calculateSalary() method. There are three subclasses: Manager, TechnicalStaff, Labour. 
Salary of a Manager is calculated as follows:
TA=0.15 * basic; DA= 0.7*basic; HRA=0.24*basic; Medical= 0.2*basic; gross= basic +TA+DA+HRA+Medical
Salary of a TechnicalStaff is calculated as:
TA=0.1 * basic; DA= 0.5*basic; HRA=0.2*basic; Medical= 0.2*basic; gross= basic +TA+DA+HRA+Medical
Salary of a Labour is calculated as:
TA=0.1 * basic; DA= 0.3*basic; HRA=0.1*basic; Medical= 0.1*basic; gross= basic +TA+DA+HRA+Medical*/

import java.util.Scanner;
import java.util.*;

class Employee
{
    int eID, basic,i;
    String name;
    void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee ID: ");
        eID = sc.nextInt();
        System.out.println("Enter the name of the employee : ");
        name = sc.next();
        System.out.println("Enter the basical of the employee: ");
        basic = sc.nextInt();
    }
}
class Manager extends Employee
{
    double TA, DA, HRA, Medical;
    double gross = 0;
    void cal()
    {
        TA = 0.2*basic;
        DA = 0.2*basic;
        HRA = 0.5*basic;
        Medical = 0.22*basic;
        gross = basic+TA+DA+HRA+Medical;
    }
    void dis()
    {
       System.out.println("Name of the employee: "+name);
       System.out.println("ID of the employee: "+eID);
       System.out.println("Basic salary is: "+basic);
       System.out.println("Gross salary is: "+gross);
    }  
}
class TechnicalStaff extends Employee
{
	double gross = 0.0;
	void cal()
	{
		double TA = 0.1*basic;
		double DA = 0.5*basic;
		double HRA = 0.2*basic;
		double Medical = 0.2*basic;
		gross = basic+TA+DA+HRA+Medical;
	}
    void dis()
    {
       System.out.println("Name of the employee: "+name);
       System.out.println("ID of the employee: "+eID);
       System.out.println("Basic salary is: "+basic);
       System.out.println("Gross salary is: "+gross);
    }
}
class Labour extends Employee
{
    double gross = 0.0;
	void cal()
	{
		double TA = 0.1*basic;
		double DA = 0.3*basic;
		double HRA = 0.1*basic;
		double Medical = 0.1*basic;
		gross = basic+TA+DA+HRA+Medical;
	}
    void dis()
    {
       System.out.println("Name of the employee: "+name);
       System.out.println("ID of the employee: "+eID);
       System.out.println("Basic salary is: "+basic);
       System.out.println("Gross salary is: "+gross);
    }
}
class Salary
{
    public static void main(String[] args)
    {
        double total_salary = 0.0,avg = 0.0;
        System.out.println("              PLEASE SELECT THE STAFF           ");
	    Scanner s = new Scanner(System.in);
	    System.out.println("\n1.Manager\n2.Technical Staff\n3.Labour");
	    int ch = s.nextInt();
	    switch(ch)
	    {
		    case 1:
            Manager mobj = new Manager();
            System.out.println("Enter the numeber of manager: ");   
            int n = s.nextInt();
            for(int i=0; i<n; i++)
            {
                mobj.display();
                mobj.cal();
                mobj.dis();
                total_salary = total_salary+mobj.gross;
                avg = total_salary/n;
            }
            System.out.println("Total salary paid by the company is: "+total_salary);
            System.out.println("Avarage salary of all the manager is: "+avg);
            break;
		    case 2:
			TechnicalStaff tobj = new TechnicalStaff();
            System.out.println("Enter the numeber of technical staff: ");   
            int x = s.nextInt();
            for(int i=0; i<x; i++)
            {
			    tobj.display();
			    tobj.cal();
			    tobj.dis();
                total_salary = total_salary+tobj.gross;
                avg = total_salary/x;
            }
            System.out.println("Total salary of all technical staff is: "+total_salary);
            System.out.println("Avarage salary of all the manager is: "+avg);
            break;
            case 3:
            Labour lobj = new Labour();
            System.out.println("Enter the numeber of labour: ");   
            int y = s.nextInt();
            for(int i=0; i<y; i++)
            {
                lobj.display();
                lobj.cal();
                lobj.dis();
                total_salary = total_salary+lobj.gross;
                avg = total_salary/y;
            }	
            System.out.println("Total salary paid by the company is: "+total_salary);
            System.out.println("Avarage salary of all the manager is: "+avg);	
            break;
            default : System.out.println("Error choice...");
	    }
    }
}
