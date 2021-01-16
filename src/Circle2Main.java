
public class Circle2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 pajeon = new Circle2(10, "자바 파전");
		
		double area = pajeon.getArea();
		System.out.println(pajeon.name + "의 면적은 " + area);
		
		Circle2 kimchijeon = new Circle2();
		kimchijeon.name = "김치전";
		area = kimchijeon.getArea();
		System.out.println(kimchijeon.name + "의 면적은 " + area);
	}

}

// 문제 1) 제목과 저자를 나타내는 title과 author 멤버 변수를 가진 Book 클래스를 작성하고, 생성자를 작성하여 멤버 변수를 초기화하고 화면에 출력하는 프로그램을 작성하세요. 
// 조건 1. 책 2권의 정보를 출력하세요.
// 조건 2. 