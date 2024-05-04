package swing_javalike;

public class prizeClaw {
        public int point;
        public static int special_red,special_green,special_blue,special_white,special_black;
        public void playerPoint(int point){
            Player.score += point;
        }
        public int coinSpecial(){ //این تابع رو موقعی که کارتاور انتخاب کرد باید صدا بزنی
            int sw = 0;
            if(specialCoin.specialCoinRed<special_red) {
                sw = 1;
            }
            if(specialCoin.specialCoinGreen<special_green) {
                sw = 1;
            }
            if(specialCoin.specialCoinBlue<special_blue) {
                sw = 1;
            }
            if(specialCoin.specialCoinWhite<special_white){
                sw = 1;
            }
            if(specialCoin.specialCoinBlack<special_black){
                sw = 1;
            }
            return sw;
        }
        public prizeClaw(int point,int special_red,int special_green,int special_blue,int special_white,int special_black){
            playerPoint(point);
            this.special_red = special_red;
            this.special_green = special_green;
            this.special_blue = special_blue;
            this.special_white = special_white;
            this.special_black = special_black;
        }

    }

