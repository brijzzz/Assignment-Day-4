package com.bridgelabz.SnakeAndLedder;

public class SnakeAndLedder {

    static int playerPosition=0;
    static final int No_Play=1;
    static final int Ladder=2;
    static final int Snake=3;
    static final int win_position=100;
    static  final int start_position=0;




    private static void playGame(int option,int dieValue){

        switch(option){
            case No_Play:
                System.out.println("no play");
                break;
            case Ladder:
                if(playerPosition+dieValue<=win_position)
                playerPosition=playerPosition+dieValue;
                break;
            case Snake:
                if(playerPosition-dieValue<0)
                    playerPosition = 0;
                else
                playerPosition=playerPosition-dieValue;
                break;
            default:
        }
    }

    private static int dieRoll(){

        int dieValue=(int)(Math.random()*10%6)+1;
        return dieValue;
    }

    private static int getOption(){
        int option=(int)(Math.random()*10%3)+1;
        return option;
    }

    public static void main(String[] args) {

        while(playerPosition<win_position) {
            int dieValue = dieRoll();
            System.out.println("Die:" + dieValue);

            int option = (int)(Math.random() * 10 % 3)+ 1;
            System.out.println("option:" + option);

            playGame(option, dieValue);
            System.out.println("Position:"+playerPosition);

        }
    }
}