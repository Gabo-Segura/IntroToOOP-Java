package labs.lab3;

public class Bishop extends Piece {

    public Bishop (boolean isWhite) {
        super.setValue(3);
        super.setWhite(isWhite);
    }

    @Override
    public void move() {
        System.out.println("Diagonally");
    }

    @Override
    public String toString() {
        return "Bishop{value='" + getValue() + "\'" + "}";
    }
}
