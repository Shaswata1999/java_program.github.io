import java.util.Scanner;
class DuckNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String s = sc.nextLine();
        int num = 0;
        int len = s.length();
        for(int i=0; i<len; i++)
        {
            char ch = s.charAt(i);
            if(ch=='0')
                num++;
        } 
        char fr = s.charAt(0);
        if(num>0 && fr!='0')
            System.out.println("The number is duck number");
        else
            System.out.println("The number is not duck number");
    }
}
