package calculator;

public class Factorial implements Operations {
	int fact = 1;
	public Factorial(int fact) {
		
		this.fact = fact;
	}
	public int method(int fact) {
		if(fact == 1) return 1;
		return fact*method(fact - 1);
	}
	
	@Override
	public int method() {
		
		return 0;
	}
	
}
