package swing_javalike;

public class Card {
    public int point;
    public int level;
    public int red, green, blue, white, black;
    public String colorSpecialCoin;

    {
        Coin.red(this.red);
        Coin.green(this.green);
        Coin.blue(this.blue);
        Coin.white(this.white);
        Coin.black(this.black);
    }

    public void playerPoint(int point) {
        this.point = point;
        Player.score += point;
    }

    public void specialCoinGetter(String colorSpecialCoin){
        specialCoin.special_coin(colorSpecialCoin);
    }
    public Card(int point, int level, int red, int green, int blue, int white, int black, String colorSpecialCoin) {
        playerPoint(point);
        this.level = level;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.white = white;
        this.black = black;
        this.colorSpecialCoin = colorSpecialCoin;
        specialCoinGetter(colorSpecialCoin);
    }


}



