package cho06.kumho;

public class SmartPhone extends Phone {
	public SmartPhone(String owner) {
		super(owner); // 부모 클래스의 생성자를 호출한다. (매개변수 하나 받는 형식 그대로)
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	public void sleep() {
		System.out.println("스마트폰 화면이 잠깁니다.");
	}
}
