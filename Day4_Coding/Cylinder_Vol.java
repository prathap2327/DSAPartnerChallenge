package Day4_Coding;

public class Cylinder_Vol {
    public static void main(String[] args) {
        double radius = 3.0;
        double height = 5.0;
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.printf("Volume of the cylinder: %.2f", volume);
    }
}
