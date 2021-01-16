// 2020.12.24
// 백수정
// 문제 3)
public class Circle {
//	멤버변수
	String name;
	double radius;
	
// 생성자
	
	public Circle() {
		this("원", 1);
	}
	
	public Circle(int r) {
		this("원", r);
	}
	
	public Circle(String name, int radius) {
		this.name = name;
		this.radius = radius;
	}
	
//	출력하기위한 메서드
//	객체 생성 후 바로 CalArea 메서드를 사용 시 정확한 결과가 안 나온다. -> 왜냐하면 멤버변수의 초기화 부분이 존재하지 않기 때문에. 
//	클래스의 멤버변수를 객체화하면 : 멤버변수는 기본값을 가지게 된다. String(클래스타입)은 null 들어가고, double은 0 들어간다.-> 그래서 CalArea는 0을 포함한 값을 가지고 계산하기 때문에 정확한 결과가 안 나옴. 
//	->그래서 우리가 직접 접근해서 c.name = "삼각형"; c.r = 10; 처럼 우리가 값을 넣어줘야 한다. 그러나 오류가 없이 안정적으로 프로그램을 하기 위해서 Circle2처럼 생성자를 생성해서 사용한다. 
	public void CalArae() {
		System.out.println("\n\n< " + name + " >\n");
		System.out.printf("이름 : " + name + "\n반지름 : " + radius + "\n넓이 : " + "%.3f",(Math.PI * Math.pow(radius, 2)));
	}
}
