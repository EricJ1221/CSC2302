/*This file will show how to echo the contents of a file
* using Scanner
*/

//Need both File and Scanner libraries
import java.io.File;
import java.util.Scanner;

public class scannerFileIO{
	public static void main(String[] args) throws Exception{
	
   	File inFile = new File("C:\home\courses\csci2302-001\csci2302-00112\program2data.txt");
   	
   	Scanner input = new Scanner(inFile);
      
      int firstLine = input.nextInt();
   	//System.out.print(numWorkers);
      int[][] arr = new int[firstLine][7];
      int[] hours = new int[firstLine];
      int days;
      double wage = 7.50;
      double tax = .90;
   
		//while(input.hasNextLine())
      for(int workers = 0; workers < firstLine; workers++){
         for(days = 0; days < 7; days++){
            arr[workers][days] = input.nextInt();
            hours[workers] += arr[workers][days];
            //System.out.print(arr[workers][days]);   
            } 
         }
		
         System.out.println("Employee      Rate    Hours Worked    Gross Pay      Net Pay");
         for(int workers = 0; workers < 27; workers++)
            System.out.println("   " + workers + "          " + wage + "         " + hours[workers] + "             " + (hours[workers]*wage) + "            " + (((hours[workers]*wage)*tax)) + "      ");
          
	}
}