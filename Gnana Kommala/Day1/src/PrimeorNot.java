
public class PrimeorNot {

	static void checkPrime(int n) {
		int i, m = 0, flag = 0;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= n/2; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else
	}

	public static void main(String args[]) {
		checkPrime(11);
		checkPrime(32);
		checkPrime(137);
		checkPrime(20);
	}
}
