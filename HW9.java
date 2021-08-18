/******************************************************

name: Eric Oliver

name of file: HW9

**Description: This program contains my main method. I have added code to the SolveMaze method and the FindPath method to allow the maze to be solved. 

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
        Scanner input = new Scanner(new File("maze.txt"));

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

        boolean solved = SolveMaze(maze);

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

    public static boolean SolveMaze(char[][] maze)
    {
        //Implement this method.  This method should find the starting
        //point in the maze.  You must go through the array and find the
        //coordinates of the 'S' character.  This signifies the starting
        //point of the maze.  When found you can begin finding the path
        //to the maze
        
        int rows = maze.length;
        int cols = maze[0].length;
        
        boolean mazeSolved = false;
        
        for(int i = 0; i < rows; i++)
        {
          for(int j = 0; j < cols; j++)
          {
          if(maze[i][j] == 'S'){
            mazeSolved = FindPath(maze, i, j);
            }
          }
        }
        return mazeSolved;

    }

    //This method takes a copy of the maze and the coordinates of your
    //current position in the maze.
    public static boolean FindPath(char[][] maze, int x, int y){
        int rows = maze.length;
        int cols = maze[0].length;
        
        
        //Implement the find path algorithm here.  Follow the algorithm as
        //outlined by the
        
        
        //if the coordinates are outside the maze, return false
        if(x < 0 || y < 0 || x > rows || y > cols) {     
           return false;
        }
        
        if(maze[x][y] == 'X' || maze[x][y] == '#'){   //if the current position is wall or has been previously visited
           return false;
        }
        
        if(maze[x][y] == 'G'){   // if the current position is the goal, return true
            return true;
        }
        
        maze[x][y] = 'X';   //mark the current position as visited
        
        //printMaze(maze);     //print the maze
        
        System.out.println();
        
        if(FindPath(maze, x + 1, y) //check all directions and if any returns true, return true
            || FindPath(maze, x - 1, y)
            || FindPath(maze, x, y + 1)
            || FindPath(maze, x, y - 1))
         {
         return true;
         }
            
        maze[x][y] = '.';  //if no direction returned true, backtrack and make the current position as not Visited

        //printMaze(maze);  //print the maze

        System.out.println();
        
        return false;   //if nothing worked, return false;
         
    }
}
