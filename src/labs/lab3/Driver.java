package labs.lab3;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        ArrayList<Piece> newPiece = new ArrayList<Piece>();
        newPiece.add(new Pawn(false));
        newPiece.add(new Knight(false));
        newPiece.add(new Bishop(false));
        newPiece.add(new Rook(false));
        newPiece.add(new Queen(false));
        newPiece.add(new King(false));

        for (Piece i : newPiece){
            i.move();
        }

        Pawn p1 = new Pawn (1, true, true, new Queen(true));
        Pawn p2 = new Pawn (1, true, false, null);
        Pawn p3 = new Pawn (1, false, false, null);
        Pawn p4 = new Pawn (1, false, true, new Queen(true));
        Pawn p5 = new Pawn (1, true, true, new Knight(true));

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));

    }

}
