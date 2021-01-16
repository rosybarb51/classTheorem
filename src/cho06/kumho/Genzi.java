package cho06.kumho;

public class Genzi extends Character {
	@Override
	public void move() {
		System.out.println("겐지가 달려갑니다.");
	}
	@Override
	public void stop(int x) {
		System.out.println("겐지가" + x + "만큼 멈춥니다.");
	}
	
}
