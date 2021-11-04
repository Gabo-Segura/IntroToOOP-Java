package labs.lab3;

public abstract class Piece {

    private int value;
    private boolean isWhite; // indicating whether the piece is White or Black.

    public Piece() {}

    public Piece(int value, boolean isWhite){
        this.value = value;
        this.isWhite = isWhite;
    }

    // get & set for value
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    // get & set for isWhite
    public boolean isWhite() {
        return isWhite;
    }
    public void setWhite(boolean white) {
        isWhite = white;
    }

    // This returns nothing
    public void move() {}

    @Override
    public String toString() {
        return "Piece{value='" + value + "\'" + "}";
    }

    @Override
    public boolean equals(Object o) {
        // defines what's equal for Piece

        // same memory address?
        if (this == o) { return true; }
        // same type?
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Piece piece = (Piece) o;
        return value == piece.getValue() && isWhite == piece.isWhite();
    }

}
