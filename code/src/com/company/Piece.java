package com.company;
import java.util.ArrayList;

import java.security.KeyStore;


public class Piece {
    private int X;
    private int Y;
    private String type;
    private Boolean isAlive;
    private Boolean isWhite;
    public ArrayList<int[]> range = new ArrayList<>();

    Piece(int x, int y, String t, Boolean white)
    {
        X = x;
        Y = y;
        type = t;
        isAlive = Boolean.TRUE;
        isWhite = white;
        range = new ArrayList<>();
    }

    Piece()
    {}

    /*public void moveTo(int x, int y, King myKing, ArrayList<Piece> arr){

        int[] myCoords = new int[]{this.getX(), this.getY()};
        int moved = 0;


        for (int[] coordinate : this.range) {
            if (coordinate[0] == myCoords[0] && coordinate[1] == myCoords[1])
                {
                    this.setX(x);
                    this.setY(y);
                    System.out.println("Piece Moved to: (" + x + "," + y + ")");

                    moved++;
                    break;
                }

        if(moved != 1)
        {
            System.out.println("piece not moved, not in range");
        }





            if(myKing.kingCheck(arr) == false) //this is the fucntion for king check, this needs quite a bit more work.
            {
            this.setX(x);
            this.setY(y);
            System.out.println("Piece Moved to: (" + x + "," + y + ")");
            }else{
                System.out.println("invalid move, king is in check");
                }


    } //function should change piece coordinates after error checking*/



    public void getRange (){} //return type tbd, function should return the current range of movement for each piece, assuming empty board

    public boolean kingCheck(){return true;} //returns if this move will place the current player's king in check.

    public void print(){
        System.out.println("Coordinate: (" + X + "," + Y + ")");
        System.out.println("isWhite: " + isWhite);
        System.out.println("Type: " + type);
        System.out.println("Status: " + isAlive);



    }

    public int getPiece(int dX, int dY,ArrayList<Piece> arr)
    {
        for (int i =0; i < arr.size(); i++){
            if (arr.get(i).getX() == dX && arr.get(i).getY() == dY )
            {
                if (arr.get(i).getColor() == this.isWhite)
                {return 1;}
                else {return 2;}
            }


        }
        return 0;

    }

    public int getX(){return X;}
    public int getY(){return Y;}
    public String getType(){return type;}
    public Boolean getAlive(){return isAlive;}
    public Boolean getColor(){return isWhite;}

    public void setX(int x){X = x;}
    public void setY(int y){Y = y;}
    public void setType(String tipe){type = type;}
    public void setIsAlive(Boolean s){isAlive = s;}
    public void setIsWhite(Boolean a){isWhite = a;}
}
