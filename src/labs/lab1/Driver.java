package labs.lab1;

public class Driver {

    public static void main(String[] args) {

        System.out.println("Default constructor");
        Mode1 persona1 = new Mode1();
        persona1.printDetails1();
        System.out.println("---------------------------");
        System.out.println("---------------------------");


        System.out.println("Constructor 2");
        Mode1 persona2 = new Mode1("Sarah", "Connor", 20, 100 );
        persona2.printDetails2();
        System.out.println("---------------------------");
        System.out.println("---------------------------");


        System.out.println("Constructor 3");
        Mode1 persona3 = new Mode1("Jhon", "Wick", 25, 100, true, false);
        persona3.printDetails3();
        System.out.println("---------------------------");
        System.out.println("---------------------------");
    }
}
