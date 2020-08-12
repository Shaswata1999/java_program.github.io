import java.text.SimpleDateFormat;
import java.util.Date;
class PrintCurrentDate
{
    public static void main(String[] args)
    {
        Date dnow = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat sdf3 = new SimpleDateFormat("E");
        SimpleDateFormat sdf4 = new SimpleDateFormat("MMM");
        System.out.println("Current Date is: "+sdf1.format(dnow));
        System.out.println("Current Time is: "+sdf2.format(dnow));
        System.out.println("Today is: "+sdf3.format(dnow));
        System.out.println("Current Month is: "+sdf4.format(dnow));
    }
}
