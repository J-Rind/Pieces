package com.company;

import java.security.KeyStore;


public class Piece {
    private int X;
    private int Y;
    private String type;
    private Boolean isAlive;
    private Boolean isWhite;


    Piece(int x, int y, String t, Boolean white)
    {
        X = x;
        Y = y;
        type = t;
        isAlive = Boolean.TRUE;
        isWhite = white;
    }

    Piece()
    {}

    public void moveTo(int x, int y){} //function should change piece coordinates after error checking

    private boolean validMove(int x, int y){return true;} //takes destination coordinates and returns a boolean indicating if a move is valid or not

    private int getRange(){return 1;} //return type tbd, function should return the current range of movement for each piece, assuming empty board

    private boolean kingCheck(){return true;} //returns if this move will place the current player's king in check.

    public void print(){
        System.out.println("Coordinate: (" + X + "," + Y + ")");
        System.out.println("isWhite: " + isWhite);
        System.out.println("Type: " + type);
        System.out.println("Status: " + isAlive);



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
