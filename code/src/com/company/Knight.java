package com.company;
import java.util.ArrayList;


public class Knight extends Piece {


    public Knight(int x, int y, String t, Boolean white) {
        super(x, y, t, white);
    }

    @Override
    public void getRange(ArrayList<Piece> arr){
        range.clear();

        int X = this.getX();
        int Y = this.getY();

        if(getPiece(X + 1, Y + 2, arr) == 0 || getPiece(X + 1, Y + 2, arr) == 1){
            range.add(new int[] {X,Y});
        }

        if(getPiece(X + 2, Y + 1, arr) == 0 || getPiece(X + 2, Y + 1, arr) == 1){
            range.add(new int[] {X,Y});
        }

        if(getPiece(X + 2, Y - 1, arr) == 0 || getPiece(X + 2, Y - 1, arr) == 1){
            range.add(new int[] {X,Y});
        }

        if(getPiece(X + 1, Y - 2, arr) == 0 || getPiece(X + 1, Y - 2, arr) == 1){
            range.add(new int[] {X,Y});
        }

        if(getPiece(X - 1, Y - 2, arr) == 0 || getPiece(X - 1, Y - 2, arr) == 1){
            range.add(new int[] {X,Y});
        }

        if(getPiece(X - 2, Y - 1, arr) == 0 || getPiece(X - 2, Y - 1, arr) == 1){
            range.add(new int[] {X,Y});
        }

        if(getPiece(X - 2, Y + 1, arr) == 0 || getPiece(X - 2, Y + 1, arr) == 0){
            range.add(new int[] {X,Y});
        }

        if(getPiece(X - 1, Y + 2, arr) == 0 || getPiece(X - 1, Y + 2, arr) == 0){
            range.add(new int[] {X,Y});
        }

    }
}