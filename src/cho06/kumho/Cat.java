package cho06.kumho;

public class Cat extends Animal {
	
	public Cat() {
		this.kind = "포유류";
	}
	@Override
//	추상클래스에서 상속 받은 추상 메서드. sound() 오버라이딩
//	접근제한자 등 원형은 다 동일하게 사용, 코드 블럭 안의 내용은 나에게 맞게 수정.
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("하아악-!!");
	}

}
