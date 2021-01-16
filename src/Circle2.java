
public class Circle2 {
//	멤버변수
	int radius;
	String name;
	
//	아래의 것을 기본값으로 설정해줌. -> 기본생성자
//	이렇게 기본값을 설정해주지 않으면, Circle 처럼 기본값에 String에 null, int에 0 등이 들어간다. -> 오류가 생길 수 있다. 연산 할 때
//	->이렇게 기본값을 넣어주면, 적어도 getArea를 그냥 찍어줬을 때 최소한의 원의 크기 3.14 * 1 * 1 = 3.14로 나와준다. 
	public Circle2() {
		radius = 1;
		name = "";
	}
	
//	생성자
	public Circle2(int r, String n) {
		this.radius = r;
		this.name = n;
	}

//	넓이를 구하는 메서드. Circle과 Circle2가 달라진 것은 생성자를 이용했다는 것.
//	->생성자를 사용하여 사용자가 멤버변수에 데이터를 입력하지 않아도 정상적인 연산이 가능하도록, 초기값을 설정
	public double getArea() {
		double result = 3.14 * radius * radius;
		return result;
	}
}
