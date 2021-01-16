
public class Shape {
//	객체 하나 생성
	public Shape next;
	
//	객체 하나 생성해서 값을 null을 줌
	public Shape() {
		next = null;
	}
	
//	자손 클래스가 오버라이딩을 진행할 메서드
	public void draw() {
		System.out.println("Shape");
	}
}
