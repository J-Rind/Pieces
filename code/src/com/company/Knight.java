package com.company;
import java.util.ArrayList;


public class Knight extends Piece {


    public Knight(int x, int y, String t, Boolean white) {
        super(x, y, t, white);
    }

    //parameters: arraylist of alive pieces
    //summary: clear range > iterate through each space the piece should be able to move to > add coordinates to range if empty
    //         add coordinate if enemy piece, end loop > end loop if friendly piece > end loop if out of board range
    //output: N/A
    //Note - this is the logic for the pieces, range determines valid moves, each piece is different with the only differnce being the spaces being checked and added
    @Override
    public void getRange(ArrayList<Piece> arr){
        this.range.clear();

        int X = this.getX();
        int Y = this.getY();

        while(X < 8 && Y < 8) {
            // getPiece: 0 = empty; 1 = same color; 2 = opposite color
            // 2-up/1-right
            if (getPiece(X + 1, Y + 2, arr) == 0 || getPiece(X + 1, Y + 2, arr) == 2) {
                this.range.add(new int[]{X + 1, Y + 2}); // Return int[] of tested coordinates
            }
            // 1-up/2-right
            if (getPiece(X + 2, Y + 1, arr) == 0 || getPiece(X + 2, Y + 1, arr) == 2) {
                this.range.add(new int[]{X + 2, Y + 1}); // Return int[] of tested coordinates
            }
            // 1-down/2-right
            if (getPiece(X + 2, Y - 1, arr) == 0 || getPiece(X + 2, Y - 1, arr) == 2) {
                this.range.add(new int[]{X + 2, Y - 1}); // Return int[] of tested coordinates
            }
            // 2-down/1-right
            if (getPiece(X + 1, Y - 2, arr) == 0 || getPiece(X + 1, Y - 2, arr) == 2) {
                this.range.add(new int[]{X + 1, Y - 2}); // Return int[] of tested coordinates
            }
            // 2-down/1-left
            if (getPiece(X - 1, Y - 2, arr) == 0 || getPiece(X - 1, Y - 2, arr) == 2) {
                this.range.add(new int[]{X - 1, Y - 2}); // Return int[] of tested coordinates
            }
            // 1-down/2-left
            if (getPiece(X - 2, Y - 1, arr) == 0 || getPiece(X - 2, Y - 1, arr) == 2) {
                this.range.add(new int[]{X - 2, Y - 1}); // Return int[] of tested coordinates
            }
            // 1-up/2-left
            if (getPiece(X - 2, Y + 1, arr) == 0 || getPiece(X - 2, Y + 1, arr) == 2) {
                this.range.add(new int[]{X - 2, Y + 1}); // Return int[] of tested coordinates
            }
            // 2-up/1-left
            if (getPiece(X - 1, Y + 2, arr) == 0 || getPiece(X - 1, Y + 2, arr) == 2) {
                this.range.add(new int[]{X - 1, Y + 2}); // Return int[] of tested coordinates
            }
        }
    }
}