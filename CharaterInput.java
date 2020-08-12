import java.io.*;
import java.util.Scanner;
import java.util.*;
class CharacterInput
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        System.out.println("Enter the letter to find: ");
        String l = sc.next();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(l)==l)
            {
                count++;
            }
        }
            System.out.println("The number of the letter is:"+count);
    }
}
