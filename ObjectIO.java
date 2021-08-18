/**
 * Object File IO.
 */

import java.io.*;

public class ObjectIO
{
    //The other filters allowed us to read and write primitive
    //type data.  This allows us to use class objects to
    //read and write data.
    public static void main(String[] args)throws IOException
    {

        java.util.Date d = new java.util.Date();
        String s = d.toString();
        System.out.println(s);
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("ex3out.dat"))) {

            //We can write normal data to a file like numbers and strings
            output.writeUTF("John");
            output.writeDouble(9.09);

            //We can also write our custom class objects to the file
            output.writeObject(new java.util.Date());
            output.writeObject(new customEx3(1, 2.0, "3"));

        }
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("ex3out.dat")))
        {
            String s1 = input.readUTF();
            double s2 = input.readDouble();

            //When we read the file and pull out our objects, it gets returned to us
            //as an object type.  We need to type cast the Object object to one of our
            //custom class objects.
            java.util.Date s3 = (java.util.Date)input.readObject();
            customEx3 s4 = (customEx3)input.readObject();

            System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        }
        catch(ClassNotFoundException e)
        {}
        catch (NullPointerException e)
        {
            System.out.println(e.toString());
        }
    }
}
