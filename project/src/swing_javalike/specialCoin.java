package swing_javalike;

public class specialCoin {
    public static int specialCoinRed,specialCoinGreen,specialCoinBlue,specialCoinWhite,specialCoinBlack;
    public static void special_coin(String color){
        switch (color){
            case "red":
                specialCoinRed();
                break;
            case "green":
                specialCoinGreen();
                break;
            case "blue":
                specialCoinBlue();
                break;
            case "white":
                specialCoinWhite();
                break;
            case "black":
                specialCoinBlack();
        }
    }
    public static void specialCoinRed(){
        specialCoinRed++;
    }
    public static void specialCoinGreen(){
        specialCoinGreen++;
    }
    public static void specialCoinBlue(){
        specialCoinBlue++;
    }
    public static void specialCoinWhite(){
        specialCoinWhite++;
    }
    public static void specialCoinBlack(){
        specialCoinBlack++;
    }
}
