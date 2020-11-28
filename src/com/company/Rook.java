package com.company;
import java.util.ArrayList;

public class Rook extends Piece {


    private int X;
    private int Y;
    private ArrayList<int[]> range = new ArrayList<>();
    //private int getPiece(int x,int y) {return 0, 1, 2}


    public void getRange(){

        for (int x = this.X + 1, y = this.Y; x < 8; x++) {
            if (getPiece(x,y) == 0) {
                range.add(new int[] {x,y});
            }
            else if (getPiece(x,y) == 1) {
                break;
            }
            else if (getPiece(x,y) == 2) {
                range.add(new int[] {x,y});
                break;
            }
        }

        for (int x = this.X - 1, y = this.Y; x < 8; x--) {
            if (getPiece(x,y) == 0) {
                range.add(new int[] {x,y});
            }
            else if (getPiece(x,y) == 1) {
                break;
            }
            else if (getPiece(x,y) == 2) {
                range.add(new int[] {x,y});
                break;
            }
        }

        for (int x = this.X, y = this.Y + 1; y < 8; y++) {
            if (getPiece(x,y) == 0) {
                range.add(new int[] {x,y});
            }
            else if (getPiece(x,y) == 1) {
                break;
            }
            else if (getPiece(x,y) == 2) {
                range.add(new int[] {x,y});
                break;
            }
        }

        for (int x = this.X, y = this.Y - 1; y < 8; y--) {
            if (getPiece(x, y) == 0) {
                range.add(new int[]{x, y});
            } else if (getPiece(x, y) == 1) {
                break;
            } else if (getPiece(x, y) == 2) {
                range.add(new int[]{x, y});
                break;
            }
        }
    }
}