package com.company;

import java.util.ArrayList;

class King extends Piece {
    public King(int[] coordinates) {
        super(coordinates);
    }

    // Params:
    // Board board: A copy of the current board; used to find out where pieces are
    // Returns:
    // boolean check: true = in-check; false = out-of-check
    boolean kingCheck(Board board) {
        boolean check = false;
        ArrayList<Piece> surrPieces = this.checkSurroundings(board); //Get pieces surrounding board

        if (surrPieces.size() > 0) {
            for (Piece surrPiece : surrPieces) { //Foreach piece in surrPieces
                if (surrPiece.isWhite != this.isWhite) { //If piece is opposite to king
                    if (surrPiece.getRange().contains(this.coordinates)) { //Is king in range of piece
                        check = true;
                        break;
                    }
                }
            }
        }
        return check;
    }

    // Params:
    // Board board: A copy of the current board; used to find out where pieces are
    // Returns:
    // ArrayList<Piece> pieces: An ArrayList of the pieces surrounding the king
    ArrayList<Piece> checkSurroundings(Board board) {
        ArrayList<Piece> pieces = new ArrayList<>();
        int[] kingCoords = this.coordinates;

        //Check rays for pieces
        //Above king
        for (int x = kingCoords[1], y = kingCoords[2] + 1; y < 8; y++) {
            if (board.squares[x][y].getPiece() != null) {
                pieces.add(board.squares[x][y].getPiece());
                break;
            }
        }

        //Below king
        for (int x = kingCoords[1], y = kingCoords[2] - 1; y > -1; y--) {
            if (board.squares[x][y].getPiece() != null) {
                pieces.add(board.squares[x][y].getPiece());
                break;
            }
        }
        //Right of king
        for (int x = kingCoords[1] + 1, y = kingCoords[2]; x < 8; x++) {
            if (board.squares[x][y].getPiece() != null) {
                pieces.add(board.squares[x][y].getPiece());
                break;
            }
        }
        //Left of king
        for (int x = kingCoords[1] - 1, y = kingCoords[2]; x > -1; x--) {
            if (board.squares[x][y].getPiece() != null) {
                pieces.add(board.squares[x][y].getPiece());
                break;
            }
        }
        //Up-Right
        for (int x = kingCoords[1] + 1, y = kingCoords[2] + 1; x < 8 && y < 8; x++, y++) {
            if (board.squares[x][y].getPiece() != null) {
                pieces.add(board.squares[x][y].getPiece());
                break;
            }
        }
        //Down-Right
        for (int x = kingCoords[1] + 1, y = kingCoords[2] - 1; x < 8 && y > -1; x++, y--) {
            if (board.squares[x][y].getPiece() != null) {
                pieces.add(board.squares[x][y].getPiece());
                break;
            }
        }
        //Down-Left
        for (int x = kingCoords[1] - 1, y = kingCoords[2] - 1; x > -1 && y > -1; x--, y--) {
            if (board.squares[x][y].getPiece() != null) {
                pieces.add(board.squares[x][y].getPiece());
                break;
            }
        }
        //Up-Left
        for (int x = kingCoords[1] - 1, y = kingCoords[2] + 1; x > -1 && y < 8; x--, y++) {
            if (board.squares[x][y].getPiece() != null) {
                pieces.add(board.squares[x][y].getPiece());
                break;
            }
        }

        //Get potential attacking knights
        //Right 1, Up 2
        if (kingCoords[1] + 1 < 8 && kingCoords[2] + 2 < 8)
            if (board.squares[kingCoords[1] + 1][kingCoords[2] + 2].getPiece() != null)
                pieces.add(board.squares[kingCoords[1] + 1][kingCoords[2] + 2].getPiece());
        //Right 2, Up 1
        if (kingCoords[1] + 2 < 8 && kingCoords[2] + 1 < 8)
            if (board.squares[kingCoords[1] + 2][kingCoords[2] + 1].getPiece() != null)
                pieces.add(board.squares[kingCoords[1] + 2][kingCoords[2] + 1].getPiece());
        //Right 2, Down 1
        if (kingCoords[1] + 2 < 8 && kingCoords[2] - 1 > -1)
            if (board.squares[kingCoords[1] + 1][kingCoords[2] - 1].getPiece() != null)
                pieces.add(board.squares[kingCoords[1] + 1][kingCoords[2] - 1].getPiece());
        //Right 1, Down 2
        if (kingCoords[1] + 1 < 8 && kingCoords[2] - 2 > -1)
            if (board.squares[kingCoords[1] + 1][kingCoords[2] - 2].getPiece() != null)
                pieces.add(board.squares[kingCoords[1] + 1][kingCoords[2] - 2].getPiece());
        //Left 1, Down 2
        if (kingCoords[1] - 1 > -1 && kingCoords[2] - 2 > -1)
            if (board.squares[kingCoords[1] - 1][kingCoords[2] - 2].getPiece() != null)
                pieces.add(board.squares[kingCoords[1] - 1][kingCoords[2] - 2].getPiece());
        //Left 2, Down 1
        if (kingCoords[1] - 2 > -1 && kingCoords[2] - 1 > -1)
            if (board.squares[kingCoords[1] - 2][kingCoords[2] - 1].getPiece() != null)
                pieces.add(board.squares[kingCoords[1] - 2][kingCoords[2] - 1].getPiece());
        //Left 2, Up 1
        if (kingCoords[1] - 2 < 8 && kingCoords[2] + 1 < 8)
            if (board.squares[kingCoords[1] - 2][kingCoords[2] + 1].getPiece() != null)
                pieces.add(board.squares[kingCoords[1] - 2][kingCoords[2] + 1].getPiece());
        //Left 1, Up 2
        if (kingCoords[1] - 1 < 8 && kingCoords[2] + 2 < 8)
            if (board.squares[kingCoords[1] - 1][kingCoords[2] + 2].getPiece() != null)
                pieces.add(board.squares[kingCoords[1] - 1][kingCoords[2] + 2].getPiece());

        return pieces;
    }
}
