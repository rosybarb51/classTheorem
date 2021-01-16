package cho06.kumho;

// 추상클래스로 변경
public abstract class Character {
//	상속받은 클래스가 사용할 규격을 만들어주는 메서드
//	public void move() {
//		System.out.println("이동합니다.");
//	}
//	
//	public void stop() {
//		System.out.println("멈춥니다.");
//	}
//	-> 실제로 구현해봤자 사용하지 않음. 캐릭터마다 다 다른 내용을 사용하니까
	
	public abstract void move();
	public abstract void stop(int x);
}
