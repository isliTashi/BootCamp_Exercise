public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return Math.PI * radius * radius;
    }


    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }

    public static void main(String[] args) {
       
        System.out.println("Circle area: " + area(5.0));
        System.out.println("Rectangle area: " + area(5.0, 4.0));
        System.out.println("Invalid circle area: " + area(-1));
        System.out.println("Invalid rectangle area: " + area(-1.0, 4.0));
    }
}