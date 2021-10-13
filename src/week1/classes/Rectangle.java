package week1.classes;

public class Rectangle {
    int width;
    int height;
    String color;


    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw() {
        String Letter = color.substring(0, 1);
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                System.out.print(Letter);
            }
            System.out.println();
        }
    }
}
