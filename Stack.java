import java.util.Scanner;
import java.util.*;

class Stk
{
    int top,n,num[];
    void push_stack()	
    {
        Scanner sc = new Scanner(System.in);
	   	if(top>(n-1))                           //10
	   	{
	   		System.out.println("Stack overflow..");
	   		return;
	    }
	    System.out.println("enter the elements...");
	    int element = sc.nextInt();
	    if(top==-1)
	    {
	    	top = 0;
	    	num[top] = element;                 //20
	       	top++;
	    }
	    else
        {
           	num[top] = element;
            top++;
        }
    }
    void display_stack()
    {                                           //30
        int i,n,num[];
	  	for(i=int n-1;i>=0;i--)
	    {
	  	    System.out.println(+num[i]);
	    }
    } 
    void pop_stack()
    {
	    int top,i,num[];
	    if(top<0)                                   //40
	    {
	    	System.out.println("stack is empty....");
	    	return;
	    }
	    top--;
	    for(i=top;i>=0;i--)
		    System.out.println(+num[i]);
    }
}
class Stack                                             //50
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.put.println("Enter the size of the stack");
        int size = s.nextInt();
        stk s = new stk(size);
        do
        {
            System.out.print("\n1.push\n2.Pop\n\n3.Display\n4.exit\nEnter your choice : ");                     //60
			ch=s.nextInt();
            switch(ch)
            {
                case 1: s.push_stack();
                break;
                case 2: s.display_stak();
                break;
                case 3: s.pop_stack();
                break;
                case 4: break;          //70
                default: System.out.print("\nPlease enter a valid input!!!");
			    break;
            }
        }while(ch!=4);
    }
}
