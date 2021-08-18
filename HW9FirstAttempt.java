/******************************************************

name: Eric Oliver

name of file: HW9

**Description: This program contains...

*******************************************************/

/**
 * Created by Chris on 4/18/2016.
 */

import java.util.*;
import java.io.*;

public class HW9
{
    public static void main(String[] args)throws IOException
    {
        //Scanner input = new Scanner(new File("maze_hardmode.txt"));
        Scanner input = new Scanner(new File("C:/Users/erico/Documents/GitHub/CSC2302/maze.txt"));

        LinkedList<String> li = new LinkedList<>();

        while(input.hasNext())
            li.add(input.next());

        int rows = 0, cols = 0;

        rows = li.size();
        cols = li.get(0).length();

        char [][] maze = new char[rows][cols];

        for (int i = 0; i < rows; i++)
        {
            String s = li.get(i);
            for(int j = 0; j < cols; j++)
            {
                maze[i][j] = s.charAt(j);
            }
        }

        System.out.println();
         
        
        boolean solved = SolveMaze(maze, r, c);

        printMaze(maze);

        System.out.println("Maze solved:" + solved);
        System.out.println();


    }

    public static void printMaze(char [][] maze)
    {
      
        for(char [] ar : maze)
        {
            for(char a : ar)
            {
                System.out.print(a);
            }
            System.out.println();
        }
    }

    public static boolean SolveMaze(char[][] maze, int r, int c)
    {
    if(r >= 0 && r < 9 && c >= 0 && c < 10){
         return maze[r][c] == 'S';
         }
         return false;
         
      
    
    
        //Implement this method.  This method should find the starting
        //point in the maze.  You must go through the array and find the
        //coordinates of the 'S' character.  This signifies the starting
        //point of the maze.  When found you can begin finding the path
        //to the maze

    }
     
    //This method takes a copy of the maze and the coordinates of your
    //current position in the maze.
    
    public static boolean FindPath(char[][] maze, int x, int y)
    {
    if(SolveMaze(maze, r, c)){
      
      if(r == 8 && c == 2){
         return true;
      }
      
      maze[r][c] = 'X';
      
      //up
      boolean retunValue = FindPath(maze, r -1, c);
      
      
      //left
      if(!returnValue){
         retunValue = FindPath(maze, r, c - 1);
      }
      
      //down
      if(!returnValue){
         retunValue = FindPath(maze, r + 1, c);
      }
      
      
      //right
      if(!returnValue){
         retunValue = FindPath(maze, r, c + 1);
      }
        //Implement the find path algorithm here.  Follow the algorithm as
        //outlined by the 
    
      }
    }
}
