package com.company;

import java.util.ArrayList;

class King extends Piece {
    public King(int x, int y, String t, Boolean white) {
        super(x, y, t, white);
    }

    // Params:
    // ArrayList<Piece> pieces: An ArrayList of all the pieces on the board
    // Returns:
    // boolean check: true = in-check; false = out-of-check
    public boolean kingCheck(ArrayList<Piece> pieces) {
        boolean check = false;
        int[] kingCoords = new int[]{this.getX(), this.getY()};

        for (Piece piece : pieces) {
            if (piece.getColor() != this.getColor()) {
                for (int[] coordinate : piece.range) {
                    if (coordinate[0] == kingCoords[0] && coordinate[1] == kingCoords[1]) {
                        check = true;
                        break;
                    }
                }
            }
        }
        return check;
    }
    
    public boolean validCastling(ArrayList<Piece> pieces, Rook k) {
        // must be same color, same row
        if (k.getColor() != getColor() || k.getY() != getY())
            return false;
        // already moved
        if (k.getMoved() || getMoved())
            return false;
        
        // is any piece blocking?
        for (Piece piece : pieces) {
            if (piece.getY() == getY() &&
              (
                (piece.getX() > k.getX() && piece.getX() < getX()) ||
                (piece.getX() < k.getX() && piece.getX() > getX())
              ) )
                return false;
        }
        
        if (kingCheck(pieces))
            return false;
        
        // try moved and test checking
        int orgX = getX();
        int targetX = (k.getX() < getX()) ? (orgX - 2) : (orgX + 2);
        int step = (targetX < orgX) ? -1 : 1;
        
        int x = orgX;
        boolean checked = false;
        do
        {
            x += step;
            setX(x);
            if (kingCheck(pieces))
            {
                checked = true;
                break;
            }
            
        } while (x != targetX);
        setX(orgX);
        return !checked;
    }
    
    public boolean doCastling(ArrayList<Piece> pieces, Rook k) {
        if (!validCastling(pieces, k))
            return false;
        
        if (k.getX() < getX()) {
            setX(getX() - 2);
            k.setX(getX() + 1);
        } else {
            setX(getX() + 2);
            k.setX(getX() - 1);
        }
        
        k.setMoved(true);
        setMoved(true);
        return true;
    }
    
    
}