package com.company;

import java.util.ArrayList;

import java.security.PublicKey;

public class Main {

    public static void main(String[] args) {
        Piece wPawn1 = new Piece(0,1,"Pawn",true);
        Piece wPawn2 = new Piece(1,1,"Pawn",true);
        Piece wPawn3 = new Piece(2,1,"Pawn",true);
        Piece wPawn4 = new Piece(3,1,"Pawn",true);
        Piece wPawn5 = new Piece(4,1,"Pawn",true);
        Piece wPawn6 = new Piece(5,1,"Pawn",true);
        Piece wPawn7 = new Piece(6,1,"Pawn",true);
        Piece wPawn8 = new Piece(7,1,"Pawn",true);
        Piece wRook1 = new Piece(1,0,"Rook",true);
        Piece wRook2 = new Piece(7,0,"Rook",true);
        Piece wKnight1 = new Piece(2,0,"Knight",true);
        Piece wKnight2 = new Piece(6,0,"Knight",true);
        Piece wBishop1 = new Piece(3,0,"Bishop",true);
        Piece wBishop2 = new Piece(5,0,"Bishop",true);
        Piece wKing = new Piece(5,0,"King",true);
        Piece wQueen = new Piece(4,0,"Queen",true);

        Piece bPawn1 = new Piece(0,6,"Pawn",false);
        Piece bPawn2 = new Piece(1,6,"Pawn",false);
        Piece bPawn3 = new Piece(2,6,"Pawn",false);
        Piece bPawn4 = new Piece(3,6,"Pawn",false);
        Piece bPawn5 = new Piece(4,6,"Pawn",false);
        Piece bPawn6 = new Piece(5,6,"Pawn",false);
        Piece bPawn7 = new Piece(6,6,"Pawn",false);
        Piece bPawn8 = new Piece(7,6,"Pawn",false);
        Piece bRook1 = new Piece(1,7,"Rook",false);
        Piece bRook2 = new Piece(7,7,"Rook",false);
        Piece bKnight1 = new Piece(2,7,"Knight",false);
        Piece bKnight2 = new Piece(6,7,"Knight",false);
        Piece bBishop1 = new Piece(3,7,"Bishop",false);
        Piece bBishop2 = new Piece(5,7,"Bishop",false);
        Piece bKing = new Piece(5,7,"King",false);
        Piece bQueen = new Piece(4,7,"Queen",false);

        ArrayList<Piece> pieces = new ArrayList<Piece>();
        pieces.add(wPawn1);
        pieces.add(wPawn2);
        pieces.add(wPawn3);
        pieces.add(wPawn4);
        pieces.add(wPawn5);
        pieces.add(wPawn6);
        pieces.add(wPawn7);
        pieces.add(wPawn8);
        pieces.add(wRook1);
        pieces.add(wRook2);
        pieces.add(wKnight1);
        pieces.add(wKnight2);
        pieces.add(wBishop1);
        pieces.add(wBishop2);
        pieces.add(wKing);
        pieces.add(wQueen);

        pieces.add(bPawn1);
        pieces.add(bPawn2);
        pieces.add(bPawn3);
        pieces.add(bPawn4);
        pieces.add(bPawn5);
        pieces.add(bPawn6);
        pieces.add(bPawn7);
        pieces.add(bPawn8);
        pieces.add(bRook1);
        pieces.add(bRook2);
        pieces.add(bKnight1);
        pieces.add(bKnight2);
        pieces.add(bBishop1);
        pieces.add(bBishop2);
        pieces.add(bKing);
        pieces.add(bQueen);

        for (int i =0; i < pieces.size(); i++){
            pieces.get(i).print();
        }





    }




}
