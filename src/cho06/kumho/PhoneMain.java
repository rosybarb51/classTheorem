package cho06.kumho;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Phone 클래스는 추상클래스이므로 객체를 생성할 수 없음. 그래서 아래는 오류남.
//		Phone p1 = new Phone("유재석"); 
//		Phone p2; // 객체가 아니라 그냥 부모 클래스 타입의 변수 생성은 할 수 있다. 위처럼 생성자 생성은 안된다. 객체 생성은 생성자가 객체를 생성해주는 것이다. new는 hip 영역에 생성한 객체를 등록해주고, 그 메모리 주소를 받아온다. 
		
//		Phone 클래스의 멤버를 사용하려면 1. Phone 클래스를 상속받아, 2. 자손클래스가 Phone 클래스의 멤버를 모두 구현하면 -> 사용할 수 있음.
		SmartPhone sp1 = new SmartPhone("아이유");
		
		sp1.turnOn();
		sp1.internetSearch();
		sp1.turnOff();
		sp1.sleep();
		sp1.wakeUp();
	}

}
