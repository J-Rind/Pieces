package com.company;
import java.util.ArrayList;


public class Rook extends Piece {

    private int X;
    private int Y;
    private String type;
    private Boolean isAlive;
    private Boolean isWhite;

    Rook(int x, int y, String t, Boolean white)
    {
        X = x;
        Y = y;
        type = t;
        isAlive = Boolean.TRUE;
        isWhite = white;
    }
    public ArrayList<int[]> range = new ArrayList<>();
    //private int getPiece(int x,int y) {return 0, 1, 2}


    public void getRange(ArrayList<Piece> arr){

        for (int x = this.X + 1, y = this.Y; x < 8; x++) {
            System.out.println("ye");
            if (getPiece(x,y, arr) == 0) {
                range.add(new int[] {x,y});
            }
            else if (getPiece(x,y, arr) == 1) {
                break;
            }
            else if (getPiece(x,y, arr) == 2) {
                range.add(new int[] {x,y});
                break;
            }
        }

        for (int x = this.X - 1, y = this.Y; x < 8; x--) {
            System.out.println("ye");
            if (getPiece(x,y,arr) == 0) {
                range.add(new int[] {x,y});
            }
            else if (getPiece(x,y,arr) == 1) {
                break;
            }
            else if (getPiece(x,y,arr) == 2) {
                range.add(new int[] {x,y});
                break;
            }
        }

        for (int x = this.X, y = this.Y + 1; y < 8; y++) {
            System.out.println("ye");
            if (getPiece(x,y,arr) == 0) {
                range.add(new int[] {x,y});
            }
            else if (getPiece(x,y,arr) == 1) {
                break;
            }
            else if (getPiece(x,y,arr) == 2) {
                range.add(new int[] {x,y});
                break;
            }
        }

        for (int x = this.X, y = this.Y - 1; y < 8; y--) {
            System.out.println("ye");
            if (getPiece(x, y,arr) == 0) {
                range.add(new int[]{x, y});
            } else if (getPiece(x, y,arr) == 1) {
                break;
            } else if (getPiece(x, y,arr) == 2) {
                range.add(new int[]{x, y});
                break;
            }
        }
    }
}
