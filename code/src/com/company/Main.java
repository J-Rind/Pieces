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
//        Bishop wBishop1 = new Bishop(3,0,"Bishop",true);
//        Knight whiteKnight1 = new Knight(1,0,"WhiteKnight1",true);
//        Knight whiteKnight2 = new Knight(6,0,"WhiteKnight2",true);
//        Knight blackKnight1 = new Knight(1,7,"BlackKnight1",false);
//        Knight blackKnight2 = new Knight(6,7,"BlackKnight2",false);
        Pawn blackPawn1 = new Pawn(2,2,"BlackPawn1",false);
        Pawn whitePawn1 = new Pawn(1,1,"WhitePawn1",true);
        Pawn whitePawn2 = new Pawn(3,3,"WhitePawn1",true);
        Pawn whitePawn3 = new Pawn(3,1,"WhitePawn1",true);
        Pawn whitePawn4 = new Pawn(1,3,"WhitePawn1",true);
//      Bishop blackBishop1 = new Bishop(3,0,"BlackBishop1",false);



        pieces.add(wRook1);
        pieces.add(wRook2);
        pieces.add(bRook1);
        pieces.add(bRook2);
        pieces.add(bKing);
        pieces.add(wKing);
//        pieces.add(whiteKnight1);
//        pieces.add(whiteKnight2);
        pieces.add(whitePawn1);
        pieces.add(whitePawn2);
        pieces.add(whitePawn3);
        pieces.add(whitePawn4);
        pieces.add(blackPawn1);
//        pieces.add(blackBishop1);

        Piece.updateRange(pieces);

//      ====TESTING BLOCK====

/*      System.out.println("===Start Test===");

        System.out.println(blackPawn1.getName()+": "+blackPawn1.getX()+","+blackPawn1.getY());
        System.out.println("Moving: " + whiteKnight1.getName());
        whiteKnight1.moveTo(2,2,wKing,pieces);
        whiteKnight1.moveTo(1,0,wKing,pieces);

        System.out.println(whitePawn1.getName()+": "+whitePawn1.getX()+","+whitePawn1.getY());
        System.out.println("Moving: " + blackKnight2.getName());
        blackKnight2.moveTo(5,5,bKing,pieces);
        blackKnight2.moveTo(6,7,bKing,pieces);

        System.out.println("===End Test==");

        System.out.println("===Black Pawn===");
        blackPawn1.moveTo(6,4,bKing,pieces);
        blackPawn1.moveTo(6,2,bKing,pieces);
        System.out.println("===End Black Pawn===");

        System.out.println("===White Pawn===");
        whitePawn1.moveTo(1,3,wKing,pieces);
        whitePawn1.moveTo(1,5,wKing,pieces);
        System.out.println("===End White Pawn===");

        wKing.moveTo(3,0,wKing,pieces);
        bRook1.moveTo(3,7,bKing,pieces);
        if (wKing.kingCheck(pieces))
            System.out.println("White king in check!");

        wKing.moveTo(4,0,wKing,pieces);
        wRook2.moveTo(5,0,wKing,pieces);
        bKing.moveTo(5,7,bKing,pieces);*/

//        blackBishop1.moveTo(0,3,bKing,pieces);
//        blackBishop1.moveTo(3,6,bKing,pieces);
//        blackPawn1.moveTo(6,1,bKing,pieces);
//        wKing.moveTo(6,0,wKing,pieces);

blackPawn1.moveTo(3,1,bKing,pieces);
if(wKing.kingCheck(pieces)){
    System.out.println("White king in Check!");
}



    }
}

