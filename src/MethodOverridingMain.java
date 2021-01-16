
public class MethodOverridingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		출력 방법 1---------------------------------------------
		Shape s= new Shape();
		Line l = new Line();
		Rect r = new Rect();
		
		s.draw();
		l.draw();
		r.draw();
		
		
//		오버라이딩 사용 시 부모 클래스의 메서드의 원형을 그대로 사용해야 하기 때문에 자식 클래스에서 메서드의 사용 방법을 강제로 지정할 수 있게 됨.
//		=> 추상 메서드를 사용하는 이유.(언어에 따라 가상 메서드라고도 함)

//		출력 방법 2---------------------------------------------
		Line line = new Line();
				
//		부모 클래스의 생성자로 객체를 생성함. 
		paint(new Shape());
		
		paint(line);
//		클래스의 다형성 때문에 부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 저장할 수 있음.
		paint(new Rect());
		paint(new Line());
	}
	
//	부모 클래스 타입으로 변수 하나 선언해서 위에서 생성한 객체를 p에 넣어준다. 그러면, p가 Shape의 멤버 변수와 멤버 메소드를 그대로 사용할 수 있다. 
	public static void paint(Shape p) {
		p.draw();
	}

}
