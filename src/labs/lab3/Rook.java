package labs.lab3;

public class Rook extends Piece {

    public Rook (boolean isWhite) {
        super.setValue(5);
        super.setWhite(isWhite);
    }

    @Override
    public void move() {
        System.out.println("Horizontally or vertically");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
