/******************************************************

name: Eric Oliver

name of file: HW5

**Description: This program contains 

*******************************************************/

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW5{
   public static void main(String[] args) throws Exception{ //have to use string builder and read in text from file
         
      File inFile = new File("./prg5.txt");
      Scanner input = new Scanner(inFile);
      
      StringBuilder sb0 = new StringBuilder(input.nextLine());         //read and display the next string 
      System.out.println(sb0);     
      System.out.println("the length of this is: " + sb0.length());    //what is the length of this string
      System.out.println("the capacity of this is " + sb0.capacity()); //what is the capacity of this string
      
      String[] sb0Arr = sb0.toString().split(",");                     //split the string using commas a delimiter and display the result
      for(int index = 0; index < sb0Arr.length; index++){              //display the result
         System.out.print(sb0Arr[index] + " ");
      }
      System.out.println("");

      StringBuilder sb1 = new StringBuilder(input.nextLine());          //read and display the next string
      System.out.println(sb1);
      String sb1Str = sb1.toString();                                  
      sb1Str = sb1Str.replaceAll("e", "z");                             //replace all the e's with z's
      System.out.println(sb1Str);                                       //display the result
      
      StringBuilder sb2 = new StringBuilder(input.nextLine());
      StringBuilder sb3 = new StringBuilder(input.nextLine());
      System.out.println(sb2);                                          //read and display the next two strings
      System.out.println(sb3);
      sb2.append(sb3);                                                  //append the strings together
      System.out.println(sb2);                                          //the .append method adds a space between the strings, I noticed this isn't in the output and have decided to keep it this way.
      
      StringBuilder sb4 = new StringBuilder(input.nextLine());          //read and display the next string
      sb4.deleteCharAt(1);                                              //delete the second character
      System.out.println(sb4);                                          //display the result
      sb4.insert(0, "Q");                                               //Insert Q into index 0
      System.out.println(sb4);                                          //display the result
      
      StringBuilder sb5 = new StringBuilder(input.nextLine());          //read and display the next string
      System.out.println(sb5);                                          
      sb5.reverse();                                                    //reverse the string and display the result
      System.out.println(sb5);
      sb5.replace(4, 5, "J");                                           //once reversed, set the fifth character to "J"
      System.out.println(sb5);                                          //display the result
      
      StringBuilder sb6 = new StringBuilder(input.nextLine());          //read and display the next string
      System.out.println(sb6);                                          
      System.out.println(sb6.subSequence(0, 5));                         //display a substring from the first to the fifth letter
      System.out.println(sb6.subSequence(5, (sb6.length())));           //display a substring from the sixth to the last letter
      
      StringBuilder sb7 = new StringBuilder(input.nextLine());          //read and display the next string as a literal "String"
      String sb7Str = sb7.toString();                                              
      System.out.println(sb7Str);
      StringBuilder sb8 = new StringBuilder(input.nextLine());          //read and display the next string as an object
      System.out.println(sb8);
      
      System.out.println(sb7Str == sb8.toString());                     //use the primitive wa to find equality between the two strings, Answer: they are not equal
      System.out.println("is " + sb7 + ".equals() to " + sb8 + "? " + sb7.toString().equals(sb8.toString())); 
      //I was unsure if the above approach was right because I could not get it to output true with just the objects and the .equals modifier
      //I thought my code below was following more closely to the directions in the assignment
      //System.out.println("is " + sb7 + ".equals() to " + sb8 + sb7.equals(sb8));
      
      StringBuilder sb9 = new StringBuilder(input.nextLine());          //read and display three strings
      System.out.println(sb9);
      StringBuilder sb10 = new StringBuilder(input.nextLine());
      System.out.println(sb10);
      StringBuilder sb11 = new StringBuilder(input.nextLine());
      System.out.println(sb11);
      
      System.out.println(sb9.compareTo(sb10));                          //list these from greatest to least using the .compareTo method
      System.out.println(sb10.compareTo(sb11));                         //I am also moderately confused from this question because the directions ask us to list them from greatest to least 
      System.out.println(sb11.compareTo(sb9));                          // ,but the output has them listed from least to greatest. Is this a test? Did I win? lol
      
      System.out.println("the compareTo values sorted from greatest to least as the directions state \n" + sb11.compareTo(sb9) + " " + sb10.compareTo(sb11) + " " + sb9.compareTo(sb11));
      
      String s1 = "Green";
      String s2 = "Red Apple";
      String s3 = s1 + s2;
      System.out.print(s1+ s2.substring(3,9));

      
   } 
}