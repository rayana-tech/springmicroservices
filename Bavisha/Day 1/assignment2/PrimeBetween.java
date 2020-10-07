package assignment2;

public class PrimeBetween {

	public static void main(String[] args) {
		for(int i=2;i<100;i++) {
			checkPrime(i);
		}
		
	}

	private static void checkPrime(int num) {
		boolean flag =false;
		for(int i =2;i<=num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(num);
		}
		
	}

}
