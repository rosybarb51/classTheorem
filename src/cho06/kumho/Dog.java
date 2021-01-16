package cho06.kumho;

// 추상 클래스를 상속 받았을 경우, 추상 클래스의 멤버 중 추상 멤버를 전부 구현하지 않을 경우(@Override 해서 sound() { } 해줘야 하는데 안 해줘서,,,) 해당 클래스도 추상 클래스로 선언해야 함
// 모든 추상 멤버를 구현해야지만 일반 클래스로 사용할 수 있음
public abstract class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
	}
}

class Yoki extends Dog {
	@Override
	public void sound() {
		System.out.println("아르를르rrrr 앙!앙!왕!!");
	}
}
