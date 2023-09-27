package geomerty;

public class Circle {
    double radius;
    double xx;
    double yy;

Circle(double r, double x, double y){
    radius=r;
    xx=x;
    yy=y;

}

    public static double calculateCircleArea(double radius) {

        return Math.PI * radius * radius;
    }
    public void printCircleInfo() {
        System.out.println("Коло з радіусом " + radius + " і центром в точці (" + xx + ", " + yy + ")");
}
}
