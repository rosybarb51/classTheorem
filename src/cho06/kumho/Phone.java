package cho06.kumho;
// abstract 추상화 
public abstract class Phone {
	
//	아래의 멤버변수나 멤버메소드에 abstract가 안 붙어 있으면, 추상멤버는 아니다.
//	만약 abstract를 붙인 멤버메소드는 반드시 메인 클래스에서 반드시 구현해야 한다.
//	->보통 멤버변수에는 안 붙이고 멤버메서드에 붙인다.
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("휴대폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("휴대폰 전원을 끕니다.");
	}
	
	public void sleep() {
		System.out.println("휴대폰 화면을 끕니다.");
	}
	
	public void wakeUp() {
		System.out.println("휴대폰 화면을 켭니다.");
	}
}
