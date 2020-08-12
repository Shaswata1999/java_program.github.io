import java.util.*;

class Switch
{
    public static void main(String[] args)
    {
        Scanner day = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 7 : ");
        int d = day.nextInt();
        switch(d)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
