
// Shape 클래스를 상속받은 Line 클래스
public class Line extends Shape {
//	부모 클래스에 똑같이 존재하는 메소드
	@Override // 어노테이션 - 부모 클래스의 메소드와 형태가 똑같은지 검사해준다.
	public void draw() {
		System.out.println("Line");
	}
}
