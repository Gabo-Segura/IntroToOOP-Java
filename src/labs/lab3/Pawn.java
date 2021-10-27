package labs.lab3;

import java.util.Objects;

public class Pawn extends Piece {

    private boolean promoted;
    private Piece newPiece;

    public Pawn (boolean isWhite) {
        super.setValue(1);
        super.setWhite(isWhite);
        this.promoted = false;
        this.newPiece = null;
    }

    public Pawn (int value, boolean isWhite, boolean promoted, Piece newPiece) {
        super.setValue(value);
        super.setWhite(isWhite);
        this.promoted = promoted;
        promote(newPiece);
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public void promote(Piece newPiece) {
        setNewPiece(newPiece);
        setPromoted(true);
    }

    public void setNewPiece(Piece newPiece) {
        if (!promoted) {
            this.newPiece = null;
        } else{
            if (newPiece.getValue() == 1 || newPiece.getValue() == 1000) {
                this.newPiece = null;
                this.promoted = false;
                System.out.println("Sorry, a pawn can only be promoted to queen, rook, bishop, or knight");
            }
            else{
                this.newPiece = newPiece;
            }
        }
    }

    // Overrides
    @Override
    public void move() {
        System.out.println("Forward 1");
    }

    @Override
    public String toString() {
        return "labs.lab3.Pawn{" +
                "promoted=" + promoted +
                ", newPiece=" + newPiece +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pawn)) return false;
        if (!super.equals(o)) return false;
        Pawn pawn = (Pawn) o;
        return promoted == pawn.promoted && Objects.equals(newPiece, pawn.newPiece);
    }

}
