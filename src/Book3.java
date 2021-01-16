//		문제 1) 제목과 저자의 정보를 저장하는 멤버 변수를 가지고 있는 Book3 클래스를 생성하고, 사용자로부터 책의 제목과 저자를 입력받아 객체 배열에 저장하고 출력하는 프로그램을 작성하세요.
//		조건1. 제목 : title, 저자 : author
//		조건2. Book3 클래스에 생성자를 사용하여 제목과 저자를 입력
//		-> new 키워드 썼을 때 제목과 저자를 같이 입력해야한다는 소리
//		조건3. 화면 출력은 Book3Main 클래스의 main 메서드에서 println을 통해서 진행
//		->Book3 클래스에 출력 전용 메서드 만들지 말고, 멤버 변수와 생성자만 만들고, 출력은 main 메서드에서 System.out.println 해서 출력하란 말.
public class Book3 {
	String title;
	String author;
	
//	현재는 기본 생성자는 필수로 안 만들어줘도 된다. 
//	나중에 main에서 new Book3(); 할 때 오류나지 말라고 넣어주는 것.. 지금은 필요없다.
//	public Book3() {
//		
//	}
	
	public Book3(String t, String a) {
		this.title = t;
		this.author = a;
	}
}
