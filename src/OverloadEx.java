
public class OverloadEx {
	
	public int getSum(int a, int b) {
		return a + b;
	}
	
	public int getSum(int a, int b, int c ) {
		return a + b + c;
	}
	
	public double getSum(int a, double b) {
		return a + b;
	}
	
	public double getSum(double a, int b) {
		return a + b;
	}
	
//	메서드 오버로딩
//	메서드의 이름은 동일하다.
//	매개변수의 개수가 다르거나,
//	매개변수의 타입이 다르거나,
//	매개변수의 순서가 다르면 된다.
}
