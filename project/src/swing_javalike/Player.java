package swing_javalike;
public class Player {
    public static int score,coinCount;
    private boolean action;

    //public static Card[] playerCard = new Card[14];
    //public static prizeClaw[] playerPrizeClaw = new prizeClaw[2];
    public static Coin[] coin = new Coin[5];
    public boolean getAction(){
        return this.action;
    }
    public void setAction(boolean action){
        this.action = action;
    }


}
