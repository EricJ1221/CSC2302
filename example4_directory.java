/**
 * Determine the size of a directory
 */

import java.io.*;

public class example4
{
    public static void main(String[] args)throws IOException
    {
        //Put the full path here to whatever directory you wish to read.
        String startingfile = "C:\\Users\\Chris\\Desktop\\Computer Security";

        double size = calcDirectorySize(startingfile);

        System.out.println(size/(1024*1024));
    }

    public static double calcDirectorySize(String s)
    {
        //Create a new file based on the string of the file you wish
        //to read
        File in = new File(s);

        return directory(in);
    }


    //Look at the file.  If the file is not a directory, return
    //the size in bytes.  If it is a directory, we need to check
    //all sub files inside the directory.
    public static double directory(File in)
    {
        //Counter to keep track of total size
        double size = 0;

        //If the file is a file, return the size of it.
        if(in.isFile())
            return in.length();
        else
        {
            //If the file is a directory, we get a list of all the files
            //inside of it.  A directory can contain files and subdirectories.
            //This method returns an array of File type
            File[] f = in.listFiles();
            for(int i = 0; i < f.length; i++)
            {
                //For each file in the array, send it back into this method recursively
                //getting the file size out and keeping track of the sum of all the files
                //in the directory.
                size += directory(f[i]);
            }
            return size;
        }
    }
}
