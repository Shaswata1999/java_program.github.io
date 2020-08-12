import java.io.*;
import java.util.Scanner;
class CountWord
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = s.nextLine();
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) = " ")
            {
                count++;
            }
        }
        System.out.println("Total number of word is: "+count);
    }
}

//countwords(str)
