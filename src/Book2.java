
// Getter/Setter 을 사용하는 이유는 객체의 멤버에 함부러 접근을 허가하지 않기 위해서
//->private이라고 접근 제한자를 걸어줘야 함.(동일한 멤버끼리만 사용가능)
// 입력되는 데이터를 ★검증★하기 위해서 사용.
public class Book2 {
//	제목, 저자, 출판사, 가격
	private String title;
	private String author;
	private String publisher;
	private String price;
	


	//	book2 클래스의 멤버를 통해서 멤버 변수의 데이터를 수정해야 함.
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) { 
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
