package swing_javalike;

public class Coin {

    public static int red,green,blue,white,black,gold;

    {
        Player.coinCount = red+green+blue+black+white+gold;
    }

    public static int red(int countCoin){
        int sw = 0;
            if(countCoin<red){
                red -= countCoin;
                Player.coinCount -= countCoin;
            }
            else if(countCoin<=specialCoin.specialCoinRed){
            }else {
                sw = 1;
                //ارور باید چاپ کنه
            }
            return sw;
    }
    public static int green(int countCoin){
        int sw = 0;
            if(countCoin<green) {
                green -= countCoin;
                Player.coinCount -= countCoin;
            }
            else if(countCoin<=specialCoin.specialCoinGreen){
            }else
                sw = 1;
            return sw;
        }

    public static int blue(int countCoin){
        int sw = 0;
            if(countCoin<blue){
                 blue -= countCoin;
                 Player.coinCount -= countCoin;
            }
            else if(countCoin<=specialCoin.specialCoinBlue){
            }else
                sw = 1;
            return sw;
    }
    public static int white(int countCoin){
        int sw = 0;
        if(countCoin<white){
            white -= countCoin;
            Player.coinCount -= countCoin;
        }
        else if(countCoin<=specialCoin.specialCoinWhite){
        }else
            sw = 1;
        return sw;
    }
    public static int black(int countCoin){
        int sw = 0;
        if(countCoin<black){
            black -= countCoin;
            Player.coinCount -= countCoin;
        }
        else if(countCoin<=specialCoin.specialCoinBlack){
        }else
            sw = 1;
        return sw;
    }

}




