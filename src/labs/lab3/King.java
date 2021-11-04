package labs.lab3;

public class King extends Piece {

    public King (boolean isWhite) {
        super.setValue(1000);
        super.setWhite(isWhite);
    }

    @Override
    public void move() {
        System.out.println("One square");
    }

    @Override
    public String toString() {
        return "King{value='" + getValue() + "\'" + "}";
    }
}
