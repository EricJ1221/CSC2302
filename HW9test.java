import java.util.*;
import java.io.*;

public class HW9test                                             
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
        //Implement this method. This method should find the starting
        //point in the maze. You must go through the array and find the
        //coordinates of the 'S' character. This signifies the starting
        //point of the maze. When found you can begin finding the path
        //to the maze
      
        //find the number of rows in maze
        int rows = maze.length;
        //find the number of columns in maze
        int cols = maze[0].length;
      
        //initialize mazeSolved with false
        boolean mazeSolved = false;
      
        /*
            nested loops that goes through each point in the
            maze and finds 'S', starting point of the maze
        */
        for (int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                /*
                    if current character is 'S',
                    call FindPath to find the path
                */
                if (maze[i][j] == 'S') {
                    mazeSolved = FindPath(maze, i, j);
                }
            }
        }
      
        // return mazeSolved
        return mazeSolved;

    }

    //This method takes a copy of the maze and the coordinates of your
    //current position in the maze.
    public static boolean FindPath(char[][] maze, int x, int y)
    {
        //Implement the find path algorithm here. Follow the algorithm as
        //outlined by the
      
        //find the number of rows in maze
        int rows = maze.length;
        //find the number of columns in maze
        int cols = maze[0].length;
      
        //if the coordinates are outside the maze, return false
        if (x < 0 || y < 0 || x > rows || y > cols) {
            return false;
        }
      
        /*
            if the current position is wall or
            has been visited previously, return false
        */
        if (maze[x][y] == 'X' || maze[x][y] == '#') {
            return false;
        }
      
        // if the current position is the goal, return true
        if (maze[x][y] == 'G') {
            return true;
        }
      
        // mark the current postion as visited
        maze[x][y] = 'X';
      
        // print the maze
        printMaze(maze);
      
        System.out.println();
      
        /*
            check for all the directions and
            if any direction returns true, return true
        */
        if (FindPath(maze, x + 1, y)
                || FindPath(maze, x - 1, y)
                || FindPath(maze, x, y + 1)
                || FindPath(maze, x, y - 1)) {
            return true;          
        }
      
        /*
            if no direction returned true, backtrack
            and mark the current position as not visited
        */
        maze[x][y] = '.';
      
        // print the maze
        printMaze(maze);
      
        System.out.println();
     
        // if nothing worked, return false;
        return false;
      
    }
}