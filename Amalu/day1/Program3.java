package Assignemnet1;

public class Program3 {

	public static void main(String[] args) {
		int arra[]= {10,34,100,26,45,35,90};
		int largest=0;
		for(int x:arra)
		{
			if(x>largest)
				largest=x;
		}
System.out.println("largest="+largest);
	}

}
