
import java.io.File;
import java.util.Scanner;

public class scannerFileIO{
   public static void main(String[] args) throws Exception{
		File inFile = new File("C:/Users/erico/Documents/GitHub/CSC2302/program2data.txt");

		Scanner input = new Scanner(inFile);
      
      int firstLine = input.nextInt(); //declared an int variable and pulled it from the first line of the code
      
      int[][] arr = new int[firstLine][7]; //declare our 2d int array and we allocated memory for each spot
      int[] hours = new int[firstLine]; // declared a 1d int array and allocated memory for hours worker per worker per day
      
      double wage = 7.50;
      double tax = 0.10;

      for(int worker = 0; worker < firstLine; worker++){
         for(int day = 0; day < 7; day++){
            arr[worker][day] = input.nextInt();
            hours[worker] += arr[worker][day];    
         }
      }
      System.out.println("Employee      Rate    Hours Worked    Gross Pay      Net Pay");
	   for(int worker = 0; worker < firstLine; worker++){
         System.out.print(worker);
         System.out.print("         ");
         System.out.print(wage);
         System.out.print("          ");
         System.out.print(hours[worker]);
         System.out.print("          ");
         System.out.print(wage * hours[worker]);
         System.out.print("          ");
         System.out.print((wage * hours[worker]) - ((wage * hours[worker]) * tax));
         System.out.println(" ");
      }
	}
}