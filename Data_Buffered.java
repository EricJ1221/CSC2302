/**
 * Filtered Stream.  Data vs buffer
 */
import java.io.*;

public class Data_Buffered
{
    public static void main(String[] args)throws IOException
    {
        //Write method in the first example only writes ints to a file
        //We need a binary file handle however to add the filter info
        try(DataOutputStream output = new DataOutputStream(new FileOutputStream("ex2out.dat")))
        {
            //Different ways to write strings.  writeChars = ascii, writeUTF = unicode
            output.writeUTF("hello");
            //Write a double to the file
            output.writeDouble(45.7);
            //Can still write ints or bytes from parent class as well
            output.write(12);

            //Again
            output.writeUTF("world");
            output.writeDouble(78.9);
            output.write(6);

        }
        catch (FileNotFoundException ex)
        {}

        try(DataInputStream input = new DataInputStream(new FileInputStream("ex2out.dat")))
        {
            //Need ot check for EOF.  EOF exception will be thrown, so read until the error
            //occurs and catch the exception.



            try {
                while (true) {
                    //.read() method inherited from parent.  So we can take the byte out and translate
                    //it back to an int.
                    System.out.println(input.readUTF() + " " + input.readDouble() + " " + input.read());
                }
            }
            catch (EOFException ex)
            {
                System.out.println("All data has been read");
            }
        }
        catch (FileNotFoundException e)
        {
        }


        //////////////////////////////////////////////////////////////////////////////////////
        /////////////////Buffer the info before reading and writing///////////////////////////
        try(BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("ex2buffout.dat")))
        {
            //Write two bytes to the file
            output.write(34);
            output.write(40);
        }
        catch (FileNotFoundException ex)
        {}

        try(BufferedInputStream input = new BufferedInputStream(new FileInputStream("ex2buffout.dat")))
        {
            //Check the available input first, then if there are still some bytes left, continue reading
            while(input.available() > 0)
                System.out.println(input.read());
        }
        catch (FileNotFoundException e)
        {
        }

    }
}


