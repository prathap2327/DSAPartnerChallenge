package Day4_Coding;

import java.util.Scanner;

public class sub_prod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int mul =1;
		int add=0;
	    while(N>0)
	    {
	        int cur = N%10;
	        mul *= cur;
	        add += cur;
	        N=N/10;
	        
	    }
	    int res =  mul-add;
	    System.out.println(res);
    }
}
