public class testDynamicArray
{
    public static void main(String []args)
    { 
    // type of object, name of object "i1", creating object
        IntegerArray       i1 =             new IntegerArray();//no clue...
        for(int i = 0; i < 10; i++)
            i1.insertAt(i,i);
        
        i1.Print();
        System.out.println(i1.indextAt(4));
        
        IntegerArray i2 = new IntegerArray(20); //4 , 10, 0, 0, 0, 0,...
        i2.insertAt(0,4);
        i2.insertAt(1,10);
      
        System.out.println(i2.size());
        System.out.println(i2.capacity());
        
        i2.Print();
        
        int []a = {4,10,23,4,50};
        IntegerArray i3 = new IntegerArray(20); //4, 10, 23, 4, 50, 0, 0, 0,... 
        System.out.println(i3.size());
        System.out.println(i3.capacity());
        
        i3.removeAt(2);
        System.out.println(i3.size());
        System.out.println(i3.capacity());
        i3.Print();
    }
}

class IntegerArray
{
    //Array that will store our integer values
    int []array;
    
    //Stores the number of values currently in the array
    int size;
    
    //Default constructor. The total capacity is 16 and is an empty array
    IntegerArray()
    {
        this.size = 0;
        array = new int[16];
    }
    
    //Constructor that takes an int to create an empty array of the specified values
    IntegerArray(int cap)
    {
        this.size = 0;
        array = new int[cap];
    }
    
    //Constructor that takes a normal array and creates storage for it with 10 extra slots
    IntegerArray(int []a)
    {
        this.size = a.length;
        array = new int[a.length + 10];
        
        for(int i = 0; i < a.length; i++)
            array[i] = a[i];
    }
    
    //Return the size variable. This is the number of values currently being stored in the object.
    public int size()
    {
    for(int index = 1; index < 4; index++)
      return i(index).length();
    }
        
    //Return the total number of spaces for the array in the object, including ones not being used.
    public int capacity()
    {
    for(int index = 1; index < 4; index++)
      return i(index).capacity();
    }
    
    /*//Returns the value at the given index
    public int indextAt(int i)
    {
    //return i()[i];
    }
    
    //Zero out the whole array. Be sure to reset the size.
    public void clearArray()
    {
    }
    
    //This will "remove" the value at a given index. You will do that by shifting all the other values down in space.
    //For example, the array {2,3,4,8,10,5,2}. Remove the 10, the array becomes {2,3,4,8,5,2}. You will need to shift the values
    //past 10 down in space. Be sure to update the size as well
    public void removeAt(int i)
    {
    }
    
    //Puts the value specified by val into the index i. Unlike above, no need to shift. Just overwrite whatever is at the location.
    //You will have to update size, but only if an insert is done in an "unused" space.
    public void insertAt(int i, int val)
    {
    }*/
    
    //Print out all the values in the array.
    public void Print()
    {
    System.out.println(toString());
    }
}

