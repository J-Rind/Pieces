package com.company;
import java.util.ArrayList;

public class Rook extends Piece {
    private int X;
    private int Y;
    private ArrayList<int[]> range = new ArrayList<>();
    //private int getPiece(int x,int y) {return 0, 1, 2}

    public void getRange(ArrayList<Piece> arr){
        for (int x = this.getX() + 1, y = this.getY(); x < 8; x++) {
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

        for (int x = this.getX() - 1, y = this.getY(); x > -1; x--) {
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

        for (int x = this.getX(), y = this.getY() + 1; y < 8; y++) {
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

        for (int x = this.getX(), y = this.getY() - 1; y > -1; y--) {
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