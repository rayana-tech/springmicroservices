
public class Factorial {
	static int factorial(int n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1);
	}
	static int primeOrNot(int num) {
		boolean flag = false;
		for(int i = 2; i <= num/2; ++i)
        {
         if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
		return num;
	}
	public static void main(String[] args) {
		int num = 5;
		int fact = factorial(5);
		System.out.println("Factorial of " + num + " is " + fact);
		System.out.println("Factorial of " + num + " is " + primeOrNot(fact));
	}
}