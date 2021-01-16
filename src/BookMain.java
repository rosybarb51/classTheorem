
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		문제 1)
		
//		방법1.기본 생성자를 이용한 출력
		Book book1 = new Book();
		book1.getBookInfo();
		
//		방법2.기본 생성자에 멤버변수 불러와서 지정 후 출력 (멤버 변수 직접접근) -> 오버로딩이 아님.
		Book book2 = new Book();
		book2.title = "코스모스";
		book2.author = "칼 세이건";
		book2.getBookInfo();
		
//		방법3.생성자 오버로딩을 통해서 입력 후 출력
		Book book3 = new Book("불안", "알랭 드 보통");
		book3.getBookInfo();
		
//		방법4.기본 생성자에 입력 메서드를 이용하여 입력 후 출력
//		멤버 변수에 직접 접근하지 않고 메서드를 이용해 우회하여 접근 한 것.-> 오버로딩이 아님.
		Book book4 = new Book();
		book4.setInfo("별 헤는 밤", "윤동주");
		book4.getBookInfo();
		
//		getter setter
		Book2 b2 = new Book2();
		b2.setPrice("1000");
		b2.setTitle("공정하다는 착각");
		b2.setAuthor("마이크센델");
		
		System.out.println(b2.getAuthor());
	}

}
