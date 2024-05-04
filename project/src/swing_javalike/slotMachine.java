package swing_javalike;

public class slotMachine {
    public static int count = 3 , SW = 0;
    public static int Red=4,Green=4,Blue=4,White=4,Black=4;
    public static void slotMachineRed(int num){
        int sw = 0;
        if(count <= 0){
            // error
            SW = 1;
            count = 3;
        }else if(num == 1){
            count--;
            sw = 1;
            Coin.red++;
            Red--;
        }
        if(Red == 3 && sw == 1 && num == 2){
            Coin.red++;
            count++;
            Red--;
        }
    }
    public void slotMachineGreen(int num){
        int sw = 0;
        if(count <= 0){
            // error
            SW = 1;
        }else if(num == 1){
            count--;
            sw = 1;
            Coin.green++;
            Green--;
        }
        if(Green == 3 && sw == 1 && num == 2){
            Coin.green++;
            count++;
            Green--;
            SW = 1;
        }
    }
    public void slotMachineBlue(int num){
        int sw = 0;
        if(count <= 0){
            SW = 1;
            // error
        }else if(num == 1){
            count--;
            sw = 1;
            Coin.blue++;
            Blue--;
        }
        if(Blue == 3 && sw == 1 && num == 2){
            Coin.blue++;
            count++;
            Blue--;
            SW = 1;
        }
    }public void slotMachineWhite(int num){
        int sw = 0;
        if(count <= 0){
            // error
            SW = 1;
        }else if(num == 1){
            count--;
            sw = 1;
            Coin.white++;
            White--;
        }
        if(White == 3 && sw == 1 && num == 2){
            Coin.white++;
            count++;
            SW = 1;
            White--;
        }
    }public void slotMachineBlack(int num){
        int sw = 0;
        if(count <= 0){
            SW = 1;
            // error
        }else if(num == 1){
            count--;
            sw = 1;
            Coin.black++;
            Black--;
        }
        if(Black == 3 && sw == 1 && num == 2){
            Coin.black++;
            count++;
            Black--;
            SW = 1;
        }
    }
}

