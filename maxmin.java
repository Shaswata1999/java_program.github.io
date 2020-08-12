//import java.io.*;
import java.util.Scanner;
class maxmin
{
    public static void main(String args[])
    {
        Scanner Input = new Scanner(System.in);
        try{
            System.out.println("Enter first number: ");
            int x = Input.nextInt();
            System.out.println("Enter Second number: ");
            int y = Input.nextInt();

        if(x > y)
        {
            System.out.println("The maximum number is: "+x);
        }
        else
        {
            System.out.println("The maximum number is: "+y);
        }
          }catch(Exception e){}
    }
}
            
