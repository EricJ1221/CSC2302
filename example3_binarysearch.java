/**
 * Binary Search
 */

import java.util.Arrays;

public class example3
{
    public static void main(String[] args)
    {
        //create an array of integers.
        int [] arr = {5, 6, 2, 78, 45, 67, 100, 34, 1, 0, 56, 23, 87, 91 , 90};

        //sort the array
        Arrays.sort(arr);

        //Verify they array is sorted
        for(int i : arr)
            System.out.print(i + " ");

        //Value we are searching for inside the array
        int value = 100;

        //Call the binary search with our array and target value
        int index = BinarySearch(arr, value);

        System.out.println("Index of: " + index);
    }

    //This is our helper method.  This method is responsible for taking the array
    //and finding the initial upper and lower bounds of the array
    public static int BinarySearch(int [] arr, int value)
    {
        int index = BSearch(arr, value, 0, arr.length - 1);
        return index;
    }

    //Recursive method that goes through the search.  Each time we recurse through the
    //method, we change the upper and lower bounds of the array essentially creating a
    //sub array which we are looking through.
    public static int BSearch(int [] arr, int value, int lower, int upper)
    {
        //Find the middle point between the upper and lower bounds
        int mid = (lower + upper)/2;

        //If we find the value at the mid point, we return the index which we found it
        if(arr[mid] == value)
        {
            return mid;
        }

        //If the upper and lower bounds ever cross, then we have exhausted our search of
        //the array and could not find the value.  We return -1 to show we did not find it
        else if(lower > upper)
        {
            return -1;
        }

        //If the value is greater than the point in the middle, then we know that our value
        //must exist in the upper half of this subarray.  Recompute the lower bound to be one
        //more than mid and call the method again
        else if(value > arr[mid])
        {
            lower = mid + 1;
            return BSearch(arr, value, lower, upper);
        }

        //If the value is less than the point in the middle, then we know that our value
        //must exist in the lower half of this subarray.  Recompute the upper bound to be one
        //less than mid and call the method again
        else
        {
            upper = mid - 1;
            return BSearch(arr, value, lower, upper);
        }

    }
}
