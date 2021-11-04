package tests;

public class TestOne {

    private void checkIndex(int index, int size) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
    }



    public static void main(String[] args) {
        System.out.println(checkBalance("if (a(4) > 9) { foo(a(2)); }")); // -1
        System.out.println(checkBalance("for  (i=0;i<(3};i++) { foo{)); )")); // -1
        System.out.println(checkBalance("if (x) {")); // 8

    }

    public static String checkBalance(String expr) {
        expr.contains("");
        return expr;
    }

}
