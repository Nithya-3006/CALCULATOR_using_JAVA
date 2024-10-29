package calculator;

public class Division implements Operations {
	int num1;
	int num2;
	
	public Division(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int method() {
		return num1 / num2;
		
	}
}
