
public class Book {
// 문제 1)
//	멤버변수 선언
	String title;
	String author;
	
//	기본생성자
//	생성자에다가 private 쓰면 객체를 생성할 수 없다. 생성자의 목적에 맞지 않는 쓰임이다. 
//	생성자는 반환값이 필요 없다. 그래서 void 조차도 적지 않는다. 
//	또한 생성자는 클래스의 이름과 똑같이 적어준다.
//	기본 생성자는 사용자가 단 한개의 생성자도 입력하지 않았을 경우 컴파일러가 자동으로 생성함.
//	★★★ 한 개 이상의 생성자를 입력했을 경우 기본 생성자는 자동으로 생성되지 않음. ★★★
//	★★★ 그래서 기본 생성자를 활용할 경우 반드시 직접 입력해야함. ★★★
	public Book() {
		title = "시선으로부터";
		author = "정세랑";
	}
	
//	생성자 오버로딩!
//	입력부분이 있는 생성자
	public Book(String t, String a) {
		this.title = t;
		this.author = a;
	}
	
	public void setInfo(String t, String a) {
		this.title = t;
		this.author = a;
	}
	
	public void getBookInfo() {
		System.out.println("제목 : " + title + "\n저자 : " + author + "\n------------------\n");
	}
}
