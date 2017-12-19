public class GameBoard {
    public GameBoard(){}
    public String[][] gameArray = new String [3][3];


    public void setClearedBoard(){
        for(int i = 0; i < gameArray.length;i++){
            for(int j = 0; j < gameArray.length ; j++){
                gameArray[i][j] = "b";

            }
        }
    }
    public void drawGameBoard(){
        System.out.println("  " + " 0 | 1 | 2 ");
        System.out.println("  " + "------------");
        System.out.println("0 " + " " + gameArray[0][0] +" | " + gameArray[0][1] + " | "+ gameArray[0][2]+" ");
        System.out.println("  " + "---|---|---");
        System.out.println("1 " + " " + gameArray[1][0] +" | " + gameArray[1][1] + " | "+ gameArray[1][2]+" ");
        System.out.println("  " + "---|---|---");
        System.out.println("2 " + " " + gameArray[2][0] +" | " + gameArray[2][1] + " | "+ gameArray[2][2]+" ");

    }


}
