package com.company;

import java.util.ArrayList;

import java.security.PublicKey;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Piece> pieces = new ArrayList<Piece>();


        Rook wRook1 = new Rook(0,0,"Rook",true);
        Rook wRook2 = new Rook(7,0,"Rook",true);
        King wKing = new King(4,0,"King",true);
        Rook bRook1 = new Rook(0,7,"Rook",false);
        Rook bRook2 = new Rook(7,7,"Rook",false);
        King bKing = new King(4,7,"King",false);



        pieces.add(wRook1);
        pieces.add(wRook2);
        pieces.add(bRook1);
        pieces.add(bRook2);
        pieces.add(bKing);
        pieces.add(wKing);

        wKing.moveTo(3,0,wKing,pieces);
        bRook1.moveTo(3,7,bKing,pieces);
        if (wKing.kingCheck(pieces))
            System.out.println("White king in check!");

        wKing.moveTo(4,0,wKing,pieces);
        wRook2.moveTo(5,0,wKing,pieces);
        bKing.moveTo(5,7,bKing,pieces);







    }
}

