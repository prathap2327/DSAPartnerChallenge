import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res =0;
        int org = N;
        while(N>0)
        {
            int cur = N%10;
            res += cur*cur*cur;
            N = N/10;
        }
        if(res == org)
        {
            System.out.println("Armstrong");
        }
        else{
        System.out.println("Not Armstrong");
        }
	}
}
