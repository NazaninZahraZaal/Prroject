package swing_javalike;

public class Game {
    private static Player player1,player2;
    private static Player currentPlayer;
    public Game(){
        this.player1 = new Player();
        this.player2 = new Player();
        this.currentPlayer = player1;
    }
    public static void playerAction(){
        //انجام عملیات بازیکنا
        currentPlayer.setAction(true);
        if(currentPlayer.getAction())
            togglePlayer();
    }
    private static void togglePlayer(){
        if(currentPlayer == player1)
            currentPlayer = player2;
        else currentPlayer = player1;
        currentPlayer.setAction(false);
    }

}
