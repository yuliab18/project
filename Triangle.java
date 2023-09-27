package geomerty;

public class Triangle {
    double side1;
    double side2;
    double side3;
    boolean isEquilateral;
     Triangle(double s1, double s2, double s3){
         side1= s1;
         side2= s2;
         side3 = s3;
     }

    public static double calculateTriangleArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public void printTriangleInfo() {
        System.out.println("Трикутник зі сторонами " + side1 + ", " + side2 + " і " + side3);
    }
}
