/******************************************************

name: Eric Oliver

name of file: Bonus 1 - Dynamic Array

**Description: This program contains a main method, constructors and methods to print out a set of integer arrays and manipulate them as we choose.

*******************************************************/


public class DynamicArray
{
    public static void main(String []args)
    {
        IntegerArray i1 = new IntegerArray();
        for(int i = 0; i < 10; i++)
            i1.appendVal(i);
        
        i1.Print();
        System.out.println(i1.indextAt(4));
        
        IntegerArray i2 = new IntegerArray(20);
        i2.appendVal(4);
        i2.appendVal(10);
      
        System.out.println(i2.size());
        System.out.println(i2.capacity());
        
        i2.Print();
        
        int []a = {4,10,23,4,50};
        IntegerArray i3 = new IntegerArray(a);
        System.out.println(i3.size());
        System.out.println(i3.capacity());
        
        i3.removeAt(2);
        System.out.println(i3.size());
        System.out.println(i3.capacity());
        i3.Print();
    }
}

class IntegerArray {
    //Array that will store our integer values
    int[] array;

    //Stores the number of values currently in the array
    int size;

    //Default constructor. The total capacity is 16 and is an empty array
    IntegerArray() {
        this.size = 0;
        array = new int[16];
    }

    //Constructor that takes an int to create an empty array of the specified values
    IntegerArray(int cap) {
        this.size = 0;
        array = new int[cap];
    }

    //Constructor that takes a normal array and creates storage for it with 10 extra slots
    IntegerArray(int[] a) {
        this.size = a.length;
        array = new int[a.length + 10];

        for (int i = 0; i < a.length; i++)
            array[i] = a[i];
    }

    //Return the size variable. This is the number of values currently being stored in the object.
    public int size() {
        return size; 
    }

    //Return the total number of spaces for the array in the object, including ones not being used.
    public int capacity() {
        return array.length;
    }

    //Returns the value at the given index
    public int indextAt(int i) {
        return array[i];
    }

    //Zero out the whole array. Be sure to reset the size.
    public void clearArray() {
      for(int index = 0; index < array.length; index++){
         array[index] = 0;
      }
      size = 0;
    }

    //This will "remove" the value at a given index. You will do that by shifting all the other values down in space.
    //For example, the array {2,3,4,8,10,5,2}. Remove the 10, the array becomes {2,3,4,8,5,2}. You will need to shift the values
    //past 10 down in space. Be sure to update the size as well
    public void removeAt(int i) {
       for(int index = i; index < array.length-1; index++){
         array[index] = array[index + 1];
       }
       size = size-1;  
    }

    //Add the value to the next available space in the array. The next available space will be based on the current size
    public void appendVal(int val){
       array[size] = val;
       size++;
    }

    //Print out all the values in the array.
    public void Print( ) {
      for(int index = 0; index < size; index++){
         System.out.print(array[index] + ", ");
      }
      System.out.println("");
    }
    
}