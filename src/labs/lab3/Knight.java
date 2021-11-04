package labs.lab3;

public class Knight extends Piece {

    public Knight (boolean isWhite) {
        super.setValue(2);
        super.setWhite(isWhite);
    }

    @Override
    public void move() {
        System.out.println("Like an L");
    }

    @Override
    public String toString() {
        return "Knight{value='" + getValue() + "\'" + "}";
    }
}
