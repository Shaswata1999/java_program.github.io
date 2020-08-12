import java.io.*;
import java.util.*;

class CheckAlphabate
{
    public static void main(String[] args)
    {
        Scanner alph = new Scanner(System.in);
        System.out.println("Please Enter..");
        char ch = alph.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.println("It is an Alphabate. ");
        }
        else
            System.out.println("It is an Number. ");
    }
}
