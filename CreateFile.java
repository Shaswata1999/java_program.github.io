import java.io.*;
class CreateFile
{
    public static void main(String args[])
    {
        try
        {
            if(new File("input.txt").createNewFile())
            {
                System.out.println("Successfully file created");
            }
            else
            {
                System.out.println("Failed to created file");
            }
            }catch(IOException e)
            {
                System.err.println(e.getMessage());
            }
        
    }
}
