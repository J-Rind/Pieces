Here are modifications made to the files:

The Piece.java:
   A new field is added: private Boolean moved;
             and getMoved(), setMoved() .
     It's the flag used to determine if the piece has been moved.

The Rook.java:
   In the moveTo method, after print statement, add setMoved(true)
     to update the flag.

The King.java
   Add doCastling and validCastling methods.


