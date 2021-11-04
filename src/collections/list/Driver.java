package collections.list;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        MyArrayList<Integer> al = new MyArrayList<>(10);
        for (int i = 0; i < 15; i++) {
            al.add(i + 1);
        }
        printOut(al);

        // test    public int indexOf(Object o) {
        System.out.printf("a.indexOf(4) = %d\n", al.indexOf(4));

        // test    public int lastIndexOf(Object o) {
        System.out.printf("a.contains(6) = %b\n", al.contains(6));
        System.out.printf("a.contains(16) = %b\n", al.contains(16));
        // test         public boolean containsAll(Collection<?> c) {
        Collection<Integer> c = Arrays.asList(2, 4, 6, 8);
        Collection<Integer> d = Arrays.asList(2, 4, 16, 8);
        System.out.printf("a.containsAll(2,4,6,8) = %b\n", al.containsAll(c));
        System.out.printf("a.containsAll(2,4,16,8) = %b\n", al.containsAll(d));
        // test    public List<E> subList(int fromIndex, int toIndex) {
        System.out.printf("a.subList(4,8) = ");
        //printList(al.subList(4, 8));
        // test toArray(t[] a)
        Integer[] arr = al.toArray(new Integer[5]);
        System.out.printf("a.toArray(new Integer[5]) = ");
        printArray(arr);
        arr = al.toArray(new Integer[25]);
        System.out.printf("a.toArray(new Integer[25]) = ");
        printArray(arr);
        // test    public boolean addAll(Collection<? extends E> c) {
        al.addAll(Arrays.asList(20, 30, 40));
        System.out.printf("a.addAll(Arrays.asList(20,30,40)) = ");
        printOut(al);
        // test    public void add(int index, E element) {
        al.add(7, 100);
        System.out.printf("a.add(7,100) = ");
        printOut(al);
        // test    public boolean addAll(int index, Collection<? extends E> c) {
        al.addAll(2, Arrays.asList(10, 20, 30));
        System.out.printf("a.addAll(2,(10,20,30)) = ");
        printOut(al);
        al.addAll(11, Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
        System.out.printf("a.addAll(11,(9,8,7,6,5,4,3,2,1,0)) = ");
        printOut(al);
        // test     public boolean remove(Object o) {
        System.out.printf("a.remove(100) = %b | ",al.remove(Integer.valueOf(100)));
        printOut(al);
        // test    public E remove(int index) {
        System.out.printf("a.remove(15) = %s | ",al.remove(15));
        printOut(al);
        // test    public boolean removeAll(Collection<?> c) {
        System.out.printf("a.removeAll((20,30,40)) = %b | ",al.removeAll(Arrays.asList(20,30,40)));
        printOut(al);
        // test    public boolean retainAll(Collection<?> c) {
        System.out.printf("a.retainAll((10,11,12,13,15,16,17,18,19)) = %b | ",al.retainAll(Arrays.asList(10,11,12,13,15,16,17,18,19)));
        printOut(al);
        // test    public void clear() {
        al.clear();
        System.out.printf("a.clear() = ");
        printOut(al);

        System.out.printf("==================================");

        MyLinkedList<String> LL = new MyLinkedList<>();
        LL.add(0, "First");
        LL.add(1, "Second");
        LL.add(2, "Third");
        LL.add(3, "Fourth");

        System.out.println(LL);

        //LL.removeFirst();
        //LL.removeLast();
        LL.lastIndexOf("Second");

        System.out.println(LL);

    }

    private static void printArray(Integer[] arr) {
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    private static void printOut(List<Integer> a) {
        System.out.print("[ ");
        for (Integer integer : a) {
            System.out.print(integer + " ");
        }
        System.out.println("]");
    }

}
