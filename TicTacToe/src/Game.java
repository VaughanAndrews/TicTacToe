
import java.util.Scanner;

public class Game {

    public Player player1;
    public Player player2;
    public GameBoard gameboard;
    Scanner stdin = new Scanner(System.in);

    public Game() {
        gameboard = new GameBoard();
        player1 = new Player();
        player2 = new Player();

        gameSetup();
    }

    public void decideWhosFirst() {
        player1.playerNumberGuess();
        System.out.println(player1.guessedNum);
        player2.playerNumberGuess();
        System.out.println(player2.guessedNum);
        int number = (int) Math.floor((Math.random() * 99) + 1);
        System.out.println(number);
        if (number - player1.guessedNum <= number - player2.guessedNum && number - player1.guessedNum >= 0) {
            player1.goesFirst = true;
            player1.isTurn = true;
            System.out.println("player 1 goes first");
        } else {
            player2.goesFirst = true;
            player2.isTurn = true;
            System.out.println("player 2 goes first");
        }


    }

    public void selectGamePiece() {
        System.out.println("Select your gamePiece");
        if (player1.goesFirst) {
            player1.gamePiece = stdin.next();
            if (player1.gamePiece.equals("X")) {
                System.out.println("Player one is X & player 2 is O");
                player2.gamePiece = "O";
            } else {
                System.out.println("Player one is O & player 2 is X");
                player2.gamePiece = "X";
            }
        } else {
            player2.gamePiece = stdin.next();
            if (player2.gamePiece.equals("X")) {
                System.out.println("Player one is O & player 2 is X");
                player1.gamePiece = "O";
                System.out.println(player1.gamePiece);
            } else {
                player2.gamePiece = "0";
                System.out.println("Player one is X & player 2 is O");
                player1.gamePiece = "X";
            }
        }

    }

    public void turnChange() {
        if (player1.isTurn) {
            player2.isTurn = true;
            player1.isTurn = false;
        } else {
            player1.isTurn = true;
            player2.isTurn = false;
        }
    }

    public void setPiece() {
        if (player1.isTurn) {
            player1.selectPiecePos();
            gameboard.gameArray[player1.row][player1.col] = player1.gamePiece;
            gameboard.drawGameBoard();
            System.out.println("It is now player 2s turn");
            turnChange();

        } else {
            player2.selectPiecePos();
            gameboard.gameArray[player2.row][player2.col] = player2.gamePiece;
            gameboard.drawGameBoard();
            System.out.println("It is now player 1s turn");
            turnChange();
        }


    }

    public void gameSetup() {
        gameboard.setClearedBoard();
        gameboard.drawGameBoard();
        decideWhosFirst();
        selectGamePiece();
        while (player1.hasWon == true || player2.hasWon == false) {
            setPiece();
            winCheck();
        }
    }

    public void winCheck() {
        
    }
}


