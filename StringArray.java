import java.util.Scanner;
import java.util.*;
class StringArray
{
	public static void main(String args[])
	{
		Scanner Input = new Scanner(System.in);
		try
		{
			System.out.println("Enter the number of employee you want to enter: ");
			int x = Input.nextInt();
			String[] name = new String[x];
			for(int i=0;i<x;i++)
			{
				System.out.println("Enter" +(i+1)+ "Employee name: ");
				name[i] = Input.next();
			}
            Arrays.sort(name);
            System.out.println("The employee names are: ");
			for(String element : name)
            {
			    
                System.out.println(element);
            }
            
		}catch(Exception e){}
	}
}
