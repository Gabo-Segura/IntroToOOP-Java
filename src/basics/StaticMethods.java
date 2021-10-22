package basics;

public class StaticMethods {
    public static int addTwo(int a, int b) {
        return a + b;
    }

    public static String fullName(String first, String last) {
        return first + " " + last;
    }

    public static void main(String[] args) {
        int res = addTwo(10, 20);
        System.out.println(res);
        System.out.println(fullName("Derrick", "Park"));
    }

    public static String numberLoops(int n){
    //public String numberLoops(int n) {

        for (int row = 1; row <= n; row++) {
            for (int dot = 1; dot <= row * -1 + n; dot++) {
                System.out.print(".");
            }
            for (int num = 1; num <= row; num++) {
                System.out.print(row);
            }
            System.out.println();
        }
        System.out.println(numberLoops(3));
        return numberLoops(3);

    }
}
/*
def add_two(a: int, b: int) -> int:
    return a + b

def full_name(fn: str, ln: str) -> str:
    return fn + " " + ln;

 */