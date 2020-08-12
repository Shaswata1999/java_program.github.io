import java.io.*;
import java.util.Scanner;
import java.util.*;
class Character
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='a')
            {
                count++;
            }
        }
            System.out.println("The number of the letter is:"+count);
    }
}
