import java.io.Console;
import java.util.Scanner;

public class Player {
    public boolean hasWon = false;
    public String gamePiece;
    public boolean goesFirst = false;
    public boolean isTurn = false;
    public int col,row,guessedNum;

    Scanner stdin = new Scanner(System.in);


    public int playerNumberGuess() {
        System.out.println("Please guess a number between one and one hundred!");
        this.guessedNum = stdin.nextInt();
        return this.guessedNum;
    }
    public void selectPiecePos(){
        System.out.println("please select the row");
        this.row = stdin.nextInt();
        if(this.row >=3){
            System.out.println("please select a row again between numbers 0 and 2");
            this.row = stdin.nextInt();
        }
        System.out.println("Please select the col");
        this.col = stdin.nextInt();
        if(this.col >=3){
            System.out.println("please select a col again between numbers 0 and 2");
            this.col = stdin.nextInt();
        }


    }

}

