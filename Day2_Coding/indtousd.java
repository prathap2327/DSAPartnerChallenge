import java.util.*;
public class indtousd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inr = sc.nextDouble();
        double usd = inr / 83.5; 
        System.out.println("Equivalent USD: " + usd);
    }
}
