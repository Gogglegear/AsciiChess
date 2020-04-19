import java.util.ArrayList;
import java.util.Scanner;
public class AsciiChess
{
	public static void main(String [] args)
	{
	// Initialize Scanner
	Scanner S =  new Scanner(System.in);
	ArrayList<Integer> Board= new ArrayList<Integer>();
	// Create the Chess Board
   int x=0;
   int y=0;
	char [][] Chessboard = new char [x][y];
	// Ask for Ruleset
	System.out.print("Which ruleset would like to play?");
   System.out.println("For historical rulesets press [H]");
   System.out.println("For Non-Offical or Fairy Tale rulesets press [F] or Press [I] for Info");
   // Wait For Starting Input
   String Start = S.nextLine();
	}
}