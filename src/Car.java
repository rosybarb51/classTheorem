// 해당 패키지 밑에 있는 모든 클래스를 사용 가능
// 이 방법은 쓸데없는 것 까지 로딩해서 잘 안씀.
import cho06.kumho.*;

// 사용할 클래스를 직접 지정해서 사용
// 보통 이 방법을 많이 사용함.
import ch06.hankook.Tire;
import ch06.hankook.SnowTire;

public class Car {

		public static void main(String[] args) {
//			해당 패키지명 및 클래스 명을 모두 입력해야 클래스를 사용할 수 있음
			
//			import를 사용해서 해당 패키지를 불러오면 클래스 명만 입력하여 사용할 수 있음
			Tire tire = new Tire();
			SnowTire snow = new SnowTire();
//			ch06.hankook.Tire tire = new ch06.hankook.Tire();
			
//			cho06.kumho.Tire tire2 = new ch06.kumho.Tire();
			Tire tire2 = new Tire();
			
			SnowTire snow1 = new SnowTire();
		}
}
