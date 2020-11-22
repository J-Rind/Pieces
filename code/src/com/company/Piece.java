package com.company;

import java.security.KeyStore;

public class Piece {
    private int coordinate[][];
    private String type;
    private Boolean isAlive;
    private Boolean isWhite;

    Piece(int x, int y, String tipe, Boolean white)
    {
        coordinate = new int[x][y];
        type = tipe;
        isAlive = Boolean.TRUE;
        isWhite = white;
    }

    Piece()
    {}

    private void moveTo(int x, int y){} //function should change piece coordinates after error checking

    private boolean validMove(int x, int y){return true;} //takes destination coordinates and returns a boolean indicating if a move is valid or not

    private int getRange(){return 1;} //return type tbd, function should return the current range of movement for each piece, assuming empty board

    private boolean kingCheck(){return true;} //returns if this move will place the current player's king in check.



}
