
public class Book3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제 1) 제목과 저자의 정보를 저장하는 멤버 변수를 가지고 있는 Book3 클래스를 생성하고, 사용자로부터 책의 제목과 저자를 입력받아 객체 배열에 저장하고 출력하는 프로그램을 작성하세요.
//		조건1. 제목 : title, 저자 : author
//		조건2. Book3 클래스에 생성자를 사용하여 제목과 저자를 입력
//		-> new 키워드 썼을 때 제목과 저자를 같이 입력해야한다는 소리
//		조건3. 화면 출력은 Book3Main 클래스의 main 메서드에서 println을 통해서 진행
//		->Book3 클래스에 출력 전용 메서드 만들지 말고, 멤버 변수와 생성자만 만들고, 출력은 main 메서드에서 System.out.println 해서 출력하란 말.
		
		System.out.println("-----< 문제 1 >-----------------");
		
//		Scanner sc = new Scanner(System.in);...
		
//		for (int i = 0; i < b3.length; i++) {
//			b3[i] = new Book3
//		방법 1.
//		Book3[] b3 = new Book3[3];
//		b3[0] = new Book3("별 헤는 밤", "윤동주");
//		b3[1] = new Book3("별 헤는 밤", "윤동주");
//		b3[2] = new Book3("별 헤는 밤", "윤동주");
		
//		방법2.
//		for (int i = 0; i < b3.length; i++) {
//		b3[i] = new Book3("별 헤는 밤" + i, "윤동주" + i);
//	}
//	
//		for (int i = 0; i < b3.length; i++) {
//			System.out.prinln(b3[i].title + "의 저자는 " + b3.[i].author + "입니다.");
//		}
	
		Book3[] b3 = {new Book3("별 헤는 밤", "윤동주"), new Book3("불안", "알랭 드 보통"), new Book3("시선으로부터", "정세랑")};
		
		System.out.println("\n0번 index : " + b3[0].title + ", " + b3[0].author);
		System.out.println("\n1번 index : " + b3[1].title + ", " + b3[1].author);
		System.out.println("\n2번 index : " + b3[2].title + ", " + b3[2].author);
		
		

//		문제 2) 문제 1번의 Book3 클래스의 내용을 수정하여 Book4 클래스를 생성하고, 멤버 변수인 title, author을 외부에서 직접 접근 할 수 없도록하고, getter/setter를 이용하여 데이터는 변경할 수 있도록하며, 사용자로부터 책의 정보를 입력받아 객체의 배열에 저장하고 출력하는 프로그램을 작성하세요.
//			조건1. getter/setter 사용
//			조건2. 접근제한자 private 사용
//			조건3. 생성자 오버로딩을 통하여 3개의 생성자를 사용
//			조건4. this() 를 활용
		
		System.out.println("\n-----< 문제 2 >-----------------");
		
		Book4[] b4 ={new Book4("별 헤는 밤", "윤동주"), new Book4("불안", "알랭 드 보통"), new Book4("시선으로부터", "정세랑")};
		
//		강사님 방법
		
//		배열생성
//		Book4[] b4 = new Book4[3];
		
//		배열입력
//		for (int i = 0; i < b4.length; i++) {
//			b4[i] = new Book4()"별 헤는 밤" + i, "윤동주" + i);
//		}
		
//		배열출력
//		for (int i = 0; i < b4.length; i++) {
//			System.out.println(b4[i].getTitle() + "의 저자는 " + b4[i].getAuthor());
//		}
		
		
//		b4[0].setTitle("별 헤는 밤");
//		b4[0].setAuthor("윤동주");
//		
//		b4[1].setTitle("불안");
//		b4[1].setAuthor("알랭 드 보통");
//		
//		b4[2].setTitle("시선으로부터");
//		b4[2].setAuthor("정세랑");

		//@@@@@강사님.. 근데 여기 주석처리한 부분처럼하면 왜 배열안에 값이 안들어가지나요? new 를 통해서만 배열에 값이 들어가지는건가요?ㅠㅠ 
		
		System.out.println("\n0번 index : " + b4[0].getTitle() + ", " + b4[0].getAuthor());
		System.out.println("\n1번 index : " + b4[1].getTitle() + ", " + b4[1].getAuthor());
		System.out.println("\n2번 index : " + b4[2].getTitle() + ", " + b4[2].getAuthor());
		
		
//		파일명 : 20201229_1번_이름.zip
//		파일명 : 20201229_2번_이름.zip
		
	
		
	}

}






















