package cho06.kumho;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		추상 클래스는 객체화 할 수 없다.
//		Animal ani = new Animal();
//		추상 클래스인 Animal을 상속받아 추상 메서드인 sound()를 오버라이딩하여 구현하지 않았기 때문에 Dog 클래스도 abstract를 붙여서 추상 클래스로 만들어벌임.
//		Dog dog = new Dog();
		
//		추상 클래스인 Animal 클래스를 상속받아 추상 메서드인 sound()를 오버라이딩하여 구현함, 일반 클래스로 사용할 수 있어서 객체화가 가능
		Cat cat = new Cat();
		cat.sound();
//		추상 클래스인 Animal 클래스를 상속받았으나, 추상 메서드인 sound()를 구현하지 않아, 추상 클래스가 된 Dog 클래스를 상속 받아서 추상 메서드인 sound()를 오버라이딩으로 구현하여, 일반 클래스로 사용할 수 있게된 Yoki 클래스. 그래서 Yoki 클래스도 객체화 할 수 있음.
		Yoki yoki = new Yoki();
		yoki.sound();
	}

}
