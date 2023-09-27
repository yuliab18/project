package geomerty;

public class Rectangle {
    double length;
    double width;
    String color;
    Rectangle( double l, double w, String c){
        length=l;
        width=w;
        color=c;

    }
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    public void printRectangleInfo() {
        System.out.println("Прямокутник з довжиною " + length + ", шириною " + width + " та кольором " + color);
    }
}
