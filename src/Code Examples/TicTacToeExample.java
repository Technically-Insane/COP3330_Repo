import java.util.Scanner;

public class TicTacToeExample {

    public static void main(String[] args) {
        
        //Initialize Scanner Object
        Scanner scanner = new Scanner(System.in);

        //Prompt User for input
        System.out.print("Enter move: ");
        
        //Declare 'move' variable; a 1D array that the 0th and 1st index represent the y and x component of the intended move 
        int[] move = new int[2];

        //Assign the indexes their respective input
        move[0] = scanner.nextInt();
        move[1] = scanner.nextInt();

        //Call printBoard method
        printBoard(move);
        
    }
    /** This function takes the 'move' variable and does 
     * math to determine how to print the board.
     *  @param move the User inputted move variable.
     */
    public static void printBoard(int[] move)
    {
        //Declare what an empty line looks like
        String defaultLine = " | | ";
        
        //Initialize an edited line
        String editLine = "";

        //Switch statement comparing the 'move's x component as to where to place the 'X' and setting the 'editLine' accordingly.
        switch(move[0])
        {
            // IF X = 0
            case 0 -> editLine = "X| | ";
            // IF X = 1
            case 1 -> editLine = " |X| ";
            // IF X = 2
            case 2 -> editLine = " | |X";
        }

        //Print 'defaultLine' 3 times, and when the y component matches 'i', print the 'editLine' instead.
        for(int i = 0; i < 3; i++)
        {
            if(move[1] == i)
            {
                System.out.println(editLine);
            }

            else
            {
                System.out.println(defaultLine);
            }

            //If this was not the last line, add pretty formatting :)
            if(i != 2)
            {
                System.out.println("- - -");
            }
        }
    }
}