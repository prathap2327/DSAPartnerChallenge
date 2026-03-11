package Day5_coding;

public class Sum_Of_Digits {
	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int number = 1234;
		int result = sumOfDigits(number);
		System.out.println("The sum of the digits is: " + result);
	}
}
