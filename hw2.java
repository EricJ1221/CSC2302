/******************************************************

name: Eric Oliver

name of file: hw2

**Description: This program will scan a text file from the computer and place the data into a 2D array, which we will sort by employee and 
calculate the employees hours worked, Gross Pay and Net pay. 
 
*******************************************************/

import java.io.File;
import java.util.Scanner;

public class hw2{
	public static void main(String[] args) throws Exception{                                      //You must add this throws Exception at the end before the {
      File inFile = new File("C:/Users/erico/Documents/GitHub/CSC2302/program2data.txt");          //Open a new file handle. You must provide the full path to
	                                                                                              //the file. Since the file is in the same foler, I just give
	   Scanner input = new Scanner(inFile);                                                       //it a name. //Scanner object takes in the file handle to read
      
      int firstLine = input.nextInt(); //declared and initialized integer for size of array
      
      int[][] arr = new int[firstLine][7]; //declared a 2D array and allocated memory to each.      
      int[] hours = new int[firstLine]; //declared array to calculate the hours each worker worked per week and allocated memory
      
      double wage = 7.50;      
      double tax = 0.90; //used .90 to not have to subtract the tax from GrossPay
      
      for(int worker = 0; worker < firstLine; worker++){                                            //The check here sees if there are any more lines left. If{                                                                
		   for(int day = 0; day < 7; day++){                                                          //it reaches the end of the file, it breaks the loop.
            arr[worker][day] = input.nextInt();                                                     //the nextLine method pulls a line of text from the file
            hours[worker] += arr[worker][day];                                                                  
         }                                                                                   
      }
      System.out.println("Employee      Rate    Hours Worked    Gross Pay      Net Pay");
      for(int worker = 0; worker < firstLine; worker++){
         System.out.printf("%4d",worker);
         System.out.print("         ");
         System.out.printf("$%3.2f",wage);    //the printf statments take up more lines of code than I'd like but it outputs cleanly
         System.out.print("       ");
         System.out.printf("%4d",(hours[worker]));
         System.out.print("          ");
         System.out.printf("$%5.2f",(wage * hours[worker]));
         System.out.print("       ");
         System.out.printf("$%5.2f",((wage * hours[worker]) * tax));
         System.out.println(" ");
      }               
	}
}
  	
		
