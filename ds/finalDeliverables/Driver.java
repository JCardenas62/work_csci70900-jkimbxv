import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {

	     boolean solved;
       /*
	     Maze m = new Maze("maze.dat");
       solved = m.solve(1,1);
       */


       Knights k = new Knights(3);
       k.solve(2,2,0);
    }
}
