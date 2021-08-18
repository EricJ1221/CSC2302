import java.io.*;

/**
 * Raw binary IO
 */
public class RAW_Binary
{
    //For this we will use the FileInputStream/FileOutputStream
    //Just uses the read() and write() methods
    public static void main(String[] args)throws IOException
    {
        FileOutputStream output = new FileOutputStream("ex1out.dat");

        for(int i = 0; i < 10; i++)
        {
            output.write(i);
        }
        output.close();

        //Show them try with resources
        try(FileInputStream input = new FileInputStream("ex1out.dat")) {

            //Has no hasNext() method like File.  Have to assign a read to a variable
            //and check the variable.  If the variable in this case is -1, then it
            //reached the end of the file

            while (input.available() > 0)
                System.out.print(input.read());

            //We do not need this because with try-with-resources it automatically closes
            //input.close();
        }
        catch (Exception e){}
    }
}
