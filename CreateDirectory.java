import java.io.*;
class CreateDirectory
{
    public static void main(String args[])
    {
            if(new File("docs").mkdir())
            {
                System.out.println("Successfully directory created");
            }
            else
            {
                System.out.println("Failed to created directory");
            }
    }
}
