package hello;

public class Factorial {
	public static void main(String args[]) {
		
	int fact = 120;
	int num = 5;
	
	
	
	for (int i = 1; i < num; i++ ) {
		fact = fact / i;
		System.out.println(fact);
	}
  }
}