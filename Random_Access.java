/**
 * Random file access.
 */

import java.util.*;
import java.io.*;

public class Random_Access
{
    public static void main(String[] args)throws IOException
    {
        try(RandomAccessFile inout = new RandomAccessFile("ex5.dat","rw"))
        {
            //Clear out the file if it already exists
            inout.setLength(0);

            //Write some integers to the file
            for(int i = 0; i < 200; i++)
                inout.writeInt(i);

            // Display the length of the file
            System.out.println("Current file size is " + inout.length());

            //Move the file pointer to the beginning of the file (the first number)
            inout.seek(0);

            //Read the first integer from the file
            System.out.println("The first number is " + inout.readInt());

            //Becaues an int is 32 bits (4 bytes) when you read an int from the file the file
            //pointer moves 4 bytes over.
            System.out.println("The Second number is " + inout.readInt());

            //Move the pointer back to the second number again
            inout.seek(1 * 4);
            System.out.println("The Second number once again is " + inout.readInt());

            //Move to the tenth number.  If you think of it like an index, it would be position
            //9 in the array, but we need to account for 4 bytes per int.  So we say 9 * 4
            inout.seek(9 * 4);
            System.out.println("The tenth number is " + inout.readInt());

            //Move back to tenth number and modify it then print it out
            inout.seek(9 * 4);
            inout.writeInt(555);
            //Have to move back because write moved the file pointer
            inout.seek(9 * 4);
            System.out.println("The new tenth number is " + inout.readInt());

            //Can also just read the first 4 bytes of the file;
            inout.seek(0*4);
            System.out.println(inout.read() + " " + inout.read() + " " + inout.read() + " " + inout.read());

            //Returns a Long, gets the current position in the file of the file pointer
            System.out.println(inout.getFilePointer());
        }

    }
}
