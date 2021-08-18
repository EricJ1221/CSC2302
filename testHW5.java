 import java.io.File;
 import java.util.Scanner;
 
 public class testHW5{
    public static void main(String[] args) throws Exception{
   
    File inFile = new File("C:/Users/erico/Documents/GitHub/CSC2302/prg5.txt");
    Scanner input = new Scanner(inFile);
   
   
    StringBuilder sb = new StringBuilder(input.nextLine());
    System.out.println(sb);
    System.out.println("The length  of this is: " + sb.length());
    System.out.println("The capacity of this is " + sb.capacity());
    String[] sbArray = sb.toString().split(",");
    for(int i = 0; i < sbArray.length; i++)
       System.out.print(sbArray[i] + " ");
   
   
    StringBuilder sb2 = new StringBuilder(input.nextLine());
    System.out.println(sb2);
    /*System.out.println(sb2.toString().replace("e", "z"));*/
   }   
}


//If i comment out line 26, it won't print anything. My understanding of StringBuilder is limited at the moment. 



