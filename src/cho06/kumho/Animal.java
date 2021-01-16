package cho06.kumho;

// 추상 클래스인 Animal 클래스
public abstract class Animal {
	public String kind;
	
//	추상 클래스 아님, 그래서 cat.breathe(); 사용 가능
	public void breate() {
		System.out.println("숨을 쉽니다.");
	}
	
//	추상 메서드, 추상 메서드는 코드 블럭이 없음, 자손 클래스에서 상속받아 오버라이딩으로 구현해야 함
//	추상 메서드는 코드블럭이 없기 때문에 매개변수가 들어가는 () 이후에 바로 ; 을 사용함
	public abstract void sound();
}
