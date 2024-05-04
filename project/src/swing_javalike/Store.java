package swing_javalike;

public class Store {
    prizeClaw[] level0cardList = new prizeClaw[2];
    Card[] level1cardList = new Card[14];
    Card[] level2cardList = new Card[14];
    Card[] level3cardList = new Card[14];
    public void setLevel0cardList(){
        level0cardList[0] = new prizeClaw(3,5,0,0,0,5);
        level0cardList[1] = new prizeClaw(4,5,0,2,0,5);
        level0cardList[2] = new prizeClaw(3,0,5,0,6,0);
    }
    public void setLevel1cardList(){
        int level = 1;
        level1cardList[0] = new Card(1,level,3,0,1,0,0,"white");
        level1cardList[1] = new Card(0,level,2,0,2,0,0,"blue");
        level1cardList[2] = new Card(1,level,1,1,0,3,0,"black");
        level1cardList[3] = new Card(1,level,0,3,0,0,1,"red");
        level1cardList[4] = new Card(0,level,1,0,3,0,0,"green");
        level1cardList[5] = new Card(1,level,0,3,0,0,3,"white");
        level1cardList[6] = new Card(1,level,2,0,2,1,0,"blue");
        level1cardList[7] = new Card(1,level,3,0,0,2,0,"white");
        level1cardList[8] = new Card(0,level,1,0,0,3,0,"red");
        level1cardList[9] = new Card(1,level,0,1,2,0,1,"black");
        level1cardList[10] = new Card(0,level,0,2,2,0,0,"green");
        level1cardList[11] = new Card(0,level,1,0,0,3,0,"red");
        level1cardList[12] = new Card(1,level,3,3,0,0,0,"white");
        level1cardList[13] = new Card(1,level,2,0,0,3,0,"blue");
        level1cardList[14] = new Card(1,level,3,0,2,0,0,"black");
    }
    public void setLevel2cardList(){
        int level = 2;
        level2cardList[0] = new Card(2,level,4,0,0,2,0,"black");
        level2cardList[1] = new Card(3,level,3,3,0,0,1,"white");
        level2cardList[2] = new Card(4,level,0,0,3,3,2,"blue");
        level2cardList[3] = new Card(2,level,3,0,3,0,0,"red");
        level2cardList[4] = new Card(2,level,0,4,0,2,0,"green");
        level2cardList[5] = new Card(3,level,5,0,1,2,0,"black");
        level2cardList[6] = new Card(4,level,0,3,0,4,1,"red");
        level2cardList[7] = new Card(2,level,0,4,3,0,0,"white");
        level2cardList[8] = new Card(3,level,4,0,1,2,0,"blue");
        level2cardList[9] = new Card(4,level,2,5,0,0,1,"green");
        level2cardList[10] = new Card(2,level,0,0,0,2,4,"red");
        level2cardList[11] = new Card(4,level,3,0,4,1,0,"blue");
        level2cardList[12] = new Card(2,level,4,0,0,2,0,"black");
        level2cardList[13] = new Card(2,level,4,0,0,2,0,"black");
        level2cardList[14] = new Card(3,level,4,3,0,0,0,"white");
    }
    public void setLevel3cardList(){
        int level = 3;
        level3cardList[0] = new Card(3,level,3,3,1,0,0,"blue");
        level3cardList[1] = new Card(4,level,0,3,1,4,0,"red");
        level3cardList[2] = new Card(5,level,0,1,4,3,2,"black");
        level3cardList[3] = new Card(3,level,3,0,1,0,3,"green");
        level3cardList[4] = new Card(3,level,3,3,1,0,0,"blue");
        level3cardList[5] = new Card(4,level,4,3,0,1,0,"white");
        level3cardList[6] = new Card(3,level,3,3,1,0,0,"black");
        level3cardList[7] = new Card(5,level,4,0,3,0,3,"red");
        level3cardList[8] = new Card(4,level,0,3,0,2,4,"green");
        level3cardList[9] = new Card(5,level,0,4,4,0,2,"white");
        level3cardList[10] = new Card(4,level,0,3,4,1,0,"white");
        level3cardList[11] = new Card(3,level,3,0,1,0,3,"blue");
        level3cardList[12] = new Card(5,level,4,0,0,3,3,"red");
        level3cardList[13] = new Card(4,level,3,0,0,2,4,"white");
        level3cardList[14] = new Card(5,level,0,4,0,4,2,"white");
    }

}
