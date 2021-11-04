package labs.lab3;

public class Queen extends Piece {

    public Queen (boolean isWhite) {
        super.setValue(9);
        super.setWhite(isWhite);
    }

    @Override
    public void move() {
        System.out.println("Like bishop and rook");
    }

    @Override
    public String toString() {
        return "Queen{value='" + getValue() + "\'" + "}";
    }
}
