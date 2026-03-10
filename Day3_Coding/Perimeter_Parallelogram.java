import java.util.Scanner;

public class Perimeter_Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double side = sc.nextDouble();
        System.out.println(2 * (base + side));
    }
}
