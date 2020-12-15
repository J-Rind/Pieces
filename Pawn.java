package com.company;
import java.util.ArrayList;


public class Pawn extends Piece {
	
	private boolean firstMove = true;
	private boolean firstMoveTwo = false;
	
	public boolean getFirstMoveTwo() {
		return firstMoveTwo;
	}
	
    public Pawn(int x, int y, String t, Boolean white) {
        super(x, y, t, white);
    }
    
    //I had to override the moveTo function to add some detail such as firstMove and firstMoveTwo
    @Override
    public void moveTo(int x, int y, King myKing, ArrayList<Piece> arr){

        int[] myCoords = new int[]{this.getX(), this.getY()};
        int moved = 0;

        updateRange(arr);

        for (int[] coordinate : this.range) {
            if (coordinate[0] == x && coordinate[1] == y) {
            	//check for first move and first move two
                if (firstMove && Math.abs(getY() - y) == 2) {
                	firstMoveTwo = true;
                }else {
                	firstMoveTwo = false;
                }
                firstMove = false;
                this.setX(x);
                this.setY(y);
                System.out.println("Piece Moved to: (" + x + "," + y + ")");
                moved++;
                break;
            }
        }

        updateRange(arr);

        if (myKing.kingCheck(arr) == true)
        {
            System.out.println("!! king is in check, moving piece back !!");
            this.setX(myCoords[0]);
            this.setY(myCoords[1]);
        }

        if(moved != 1)
        {
            System.out.println("piece not moved, not in range");
        }



    }
    
    @Override
    public void getRange(ArrayList<Piece> arr){
        this.range.clear();

        int X = this.getX();
        int Y = this.getY();
        
        // Moving 2 spaces for first move
        if (firstMove){                //??If piece has not been moved
            if (this.getColor()) {
                for (int x = X, y = Y + 1; y <= y + 2; y++) {
                    if (getPiece(x, y, arr) == 0) {
                        this.range.add(new int[]{x, y});
                    } else if (getPiece(x, y, arr) == 1 || getPiece(x, y, arr) == 2) {
                        break;
                    }
                }
            }else if (this.getColor() == false) {
                for (int x = X, y = Y; y <= y - 2; y-- ) {
                    if (getPiece(x, y, arr) == 0) {
                        this.range.add(new int[]{x, y});
                    } else if (getPiece(x, y, arr) == 1 || getPiece(x, y, arr) == 2) {
                        break;
                    }
                }
            }
        }else {
            if (this.getColor()){
                // Up-Right
                if (this.getPiece(X + 1, Y + 1, arr) == 2){
                    this.range.add (new int [] {X, Y});
                }
                // Up-Left
                if (this.getPiece(X - 1, Y + 1, arr) == 2){
                    this.range.add (new int [] {X, Y});
                }
                // Up
                if (this.getPiece(X, Y + 1, arr) == 0){
                    this.range.add (new int [] {X, Y});
                }
            }
            else if (!this.getColor()){
                // Down-Right
                if (this.getPiece(X + 1, Y - 1, arr) == 2){
                    this.range.add (new int [] {X, Y});
                }
                // Down-Left
                if (this.getPiece(X - 1, Y - 1, arr) == 2){
                    this.range.add (new int [] {X, Y});
                }
                // Down
                if (this.getPiece(X, Y + 1, arr) == 0){
                    this.range.add (new int [] {X, Y});
                }
            }
        }
        //En passant:
        Pawn right = getPawn(X+1,Y, arr);
        Pawn left = getPawn(X-1,Y, arr);
        if (right != null && right.getColor() != getColor() && right.firstMoveTwo) {
        	if (this.getColor() && this.getPiece(X + 1, Y + 1, arr) == 0){
                this.range.add (new int [] {X, Y});
                //Important! remove variable right from Board
        	}else if (!this.getColor() && this.getPiece(X + 1, Y - 1, arr) == 0){
                this.range.add (new int [] {X, Y});
                //Important! remove variable right from Board
        	}
        }
        if (left != null && left.getColor() != getColor() && left.firstMoveTwo) {
        	if (this.getColor() && this.getPiece(X - 1, Y + 1, arr) == 0){
                this.range.add (new int [] {X, Y});
                //Important! remove variable left from Board
        	}else if (!this.getColor() && this.getPiece(X - 1, Y - 1, arr) == 0){
                this.range.add (new int [] {X, Y});
                //Important! remove variable left from Board
        	}
        }

    }
    
    //Checks if piece is a pawn, and returns it if it is
    private Pawn getPawn(int x, int y, ArrayList<Piece> arr) {
    	for (int i =0; i < arr.size(); i++){
            if (arr.get(i).getX() == x && arr.get(i).getY() == y )
            {
                if (arr.get(i) instanceof Pawn) {
                	return (Pawn) arr.get(i);
                }
            }


        }
        return null;
    }
}