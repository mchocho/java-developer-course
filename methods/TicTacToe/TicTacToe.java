public class TicTacToe
{
  public static final char p1 = '+';
  public static final char p2 = 'o';
  
  public static void main(String[] args)
  {
    do
    {
      System.out.println();
      runGame();
    }
    while(playAgain());
    System.out.println("Thanks for playing!");
  }

  public static boolean playAgain()
  {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String res;

    System.out.print("Wanna to play again: ");
    res = scanner.nextLine();

    return (res.toUpperCase().charAt(0) == 'Y');
  }

  public static void runGame()
  {
    char[][] board = new char[3][3];
    int gameResult = 0;
    int playerTurn = 0;

    for (int numberOfTurns = 0; gameResult == 0; /*No update*/)
    {
      playerTurn = (playerTurn == 1 ? 2 : 1);
      
      if (playerTurn == 1)
	playersMove(board); 
      else
	computersMove(board);

      gameResult = isGameOver(board, playerTurn, numberOfTurns);
      numberOfTurns++;
    }
    
    printBoard(board);

    switch(gameResult)
    {
      case 1:
	if (playerTurn == 1)
          System.out.println("You win! Great job.");
	else
          System.out.println("You lose. Unlucky.");
	break;
      default:
	System.out.println("This one's a tie.");
    }
  }

  public static void playersMove(char[][] board)
  {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int x, y;

    while(true)
    {
      printBoard(board);

      System.out.print("Please enter a position (x y): ");
      x = scanner.nextInt();
      y = scanner.nextInt();
      scanner.nextLine();

      if (x < 0 || x > 2 || y < 0 || y > 2)
      {
        System.out.println("Invalid move...\n\n");
        continue;
      }
      else if (positionReserved(board, x, y))
      {
        System.out.println("This position is reserved.\n\n");
        continue;
      }
      break;
    }

    board[x][y] = p1;
  }

  public static void computersMove(char[][] board)
  {
    java.util.Random random = new java.util.Random();
    int x, y;

    while (true)
    {
      x = random.nextInt(3);
      y = random.nextInt(3);

      if (!positionReserved(board, x, y))
        break;
    }

    board[x][y] = p2;
  }

  public static void printBoard(char[][] board)
  {
    for (int i = 0; i < 3; i++)
    {
      if (i > 0)
        System.out.println("------");
      for (int j = 0; j < 3; j++)
      {
        if (j > 0)
          System.out.print('|');
	System.out.print(board[i][j]);
      }
      System.out.println();
    }
    System.out.println("\n\n");
  }

  public static boolean positionReserved(char[][] board, int x, int y)
  {
     return (board[x][y] == p1 || board[x][y] == p2);
  }

  public static int isGameOver(char[][] board, int playerTurn, int numberOfTurns)
  {
    //0 - Game is not over
    //1 - Last player is winner
    //2 - Game is a tie
    char symbol = (playerTurn == 1 ? p1 : p2); 

    for (int i = 0; i < 3; i++)
    {
       //Top row, middle row, bottom row
       if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol)
         return (1);
       
       //Right column, middle column, right column
       if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)
	 return (1);
    }

    //Diagonal axis (left to right)
    if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
      return (1);

    //Diagonal axis (right to left)
    if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
      return (1);

    return (numberOfTurns == 8 ? 2 : 0);
  }
}
