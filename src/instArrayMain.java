
public class instArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		객체 배열 만들기
		int[] arr = new int[5]; // 기본 배열 만들기 
		int[] arr2 = {1, 2, 3, 4, 5}; // 기본 배열 선언 및 데이터 입력
		
//		클래스명[] 변수명 = new 클래스명[크기];
//		위와 같이 만들면, 객체생성이 바로 되지 않는다. new 클래스명에 대한 메모리 주소만 생성된다. 배열 자체가 클래스 타입, 즉 참조 타입이라서 배열의 위치만 마련해 둔것임. 실제로는 각 변수명[0], 변수명[1], ... 안에 null이 들어가 있다. 비어있다.

		Circle[] c; // Circle 클래스 타입의 배열 ★변수★ c  생성 -> new 키워드가 들어가야 객체가 된다. 
		c = new Circle[5]; // Circle 클래스 타입의 배열 주소 생성 -> 위에서 설명했듯이 지금 이 상태에서는 실제로 값을 가지고 있지 않다. 
		
//		c[0] = new Circle(); // Circle 클래스 타입의 배열 0번 index에 객체가 생성됨
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle();
		}
	
//		-------------------------------------------------------
		// int 타입의 ★배열★ 생성
		int[] arr1 = new int[5]; 
		
//		Circle 클래스 타입의 ★객체★생성
		Circle cir = new Circle();
		
//		Circle 클래스 타입의 ★배열★생성.5개 짜리 배열.index 0부터 4까지 생김.
//		Circle 클래스 타입의 ★객체가 5개 생성이 된 것은 아님★ 
//		Circle 클래스 타입의 배열에는 현재 모두 null이 들어 있음. 
		Circle[] c1 = new Circle[5];
		

//		new해서 생성한 것은 hip 영역에 들어간다.
//		배열 선언하면 stack 영역에 들어간다. 
		
		System.out.println("int타입의 배열 arr1의 0번 intdex : " + arr1[0]); // 정수형의 기본형인 0이 출력됨
		System.out.println("Circle 클래스 타입이 객체 : " + cir); // 힙영역의 메모리 주소가 출력됨
		System.out.println("Circle 클래스 타입의 배열 c1의 0번 index : " + c1[0]); // 메모리에 주소 없음. null 출력됨. new 키워드를 통해서 객체를 생성하지 않았기 때문에. 
		
		for(int i = 0; i < c1.length; i++) {
			c1[i] = new Circle(i + 1);
		}
		
		System.out.println("Circle 클래스 타입의 배열 c1의 0번 index : " + c1[0]);
		
//		Circle 클래스 타입의 배열을 선언과 동시에, 객체 5개 생성함. 생성자를 통해서 생성함.
		Circle[] c2 = {new Circle(), new Circle(), new Circle(), new Circle(), new Circle()};
		
		System.out.println("Circle 클래스 타입의 배열 c2의 0번 index : " + c2[0]); // 메모리 주소 출력됨

		
//		--------------------------------------------		
		System.out.println("\n-----------\n");
//		클래스 타입의 배열의 요소의 멤버에 접근
//		.을 이용하여 해당 배열의 지정한 index의 멤버에 접근할 수 있음
//		배열명[index].멤버명  형식으로 배열 안의 객체의 멤버에 접근 
		
		
		// Circle 클래스 타입의 길이가 5인 배열만 생성.
//		배열의 각 index에는 내용이 비어있음. (null)★★★★★
//		해당 배열을 사용하려면 각 index에 객체를 생성하는 코드를 입력해야 함.★★★★★
		Circle[] c3 = new Circle[5]; 
		
		for (int i = 0; i <c3.length; i++) {
//			random은 0.1부터 1.0까지 나오니까 * 10해서 1부터 10까지 나오게 하는데, 소수점 자리 나오니까 (int) 붙여서 강제 형변환 해서 소수점 안 나오게 한다. 
			int result = (int)(Math.random() * 10) + 1;
			
			c3[i] = new Circle(result);
		}
		
		System.out.println(c3[0].name);
		System.out.println(c3[0].radius);
		c3[0].CalArae();
		
		System.out.println(c3[4].name);
		System.out.println(c3[4].radius);
		c3[4].CalArae();
	}

}










































