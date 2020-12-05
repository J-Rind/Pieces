package com.company;

import java.util.ArrayList;

class King extends Piece {
    public King(int x, int y, String t, Boolean white) {
        super(x, y, t, white);
    }

    @Override
    public void getRange(ArrayList<Piece> pieces){
        this.range.clear();
        int  pieceX = this.getX(); int pieceY = this.getY(); // X and Y coordinates for the king piece

        //Up
        if (this.getPiece(pieceX, pieceY+1, pieces) == 0 || this.getPiece(pieceX, pieceY+1, pieces) == 2)
            this.range.add(new int[] {pieceX, pieceY+1});

        //Up-right
        if (this.getPiece(pieceX+1, pieceY+1, pieces) == 0 || this.getPiece(pieceX+1, pieceY+1, pieces) == 2)
            this.range.add(new int[] {pieceX+1, pieceY+1});

        //Right
        if (this.getPiece(pieceX+1, pieceY, pieces) == 0 || this.getPiece(pieceX+1, pieceY, pieces) == 2)
            this.range.add(new int[] {pieceX+1, pieceY});

        //Down-right
        if (this.getPiece(pieceX+1, pieceY-1, pieces) == 0 || this.getPiece(pieceX+1, pieceY-1, pieces) == 2)
            this.range.add(new int[] {pieceX+1, pieceY-1});

        //Down
        if (this.getPiece(pieceX, pieceY-1, pieces) == 0 || this.getPiece(pieceX, pieceY-1, pieces) == 2)
            this.range.add(new int[] {pieceX, pieceY-1});

        //Down-left
        if (this.getPiece(pieceX-1, pieceY-1, pieces) == 0 || this.getPiece(pieceX-1, pieceY-1, pieces) == 2)
            this.range.add(new int[] {pieceX-1, pieceY-1});

        //Left
        if (this.getPiece(pieceX-1, pieceY, pieces) == 0 || this.getPiece(pieceX-1, pieceY, pieces) == 2)
            this.range.add(new int[] {pieceX-1, pieceY});

        //Up-left
        if (this.getPiece(pieceX-1, pieceY+1, pieces) == 0 || this.getPiece(pieceX-1, pieceY+1, pieces) == 2)
            this.range.add(new int[] {pieceX-1, pieceY+1});
    }

    public boolean kingCheck(ArrayList<Piece> pieces) {
        return true;
    }
}