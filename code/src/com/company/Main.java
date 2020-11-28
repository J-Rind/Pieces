package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Piece> pieces = new ArrayList<Piece>();


        Rook wRook1 = new Rook(3,0,"Rook",true);
        King bKing1 = new King(4,7,"King",false);

        pieces.add(wRook1);
        pieces.add(bKing1);

        wRook1.getRange(pieces);

        boolean check = bKing1.kingCheck(pieces);

        System.out.println(check);
    }
}
