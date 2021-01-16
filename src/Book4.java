
public class Book4 {
	private String title;
	private String author;
	
	public Book4() {
		this("title", "author");
	}
	
	public Book4(String title) {
		this.title = title;
	}
	
	public Book4(String t, String a) {
		this.title = t;
//		정확히는 밑의 방법이 맞는 거다. 위의 방법도 틀린 건 아닌데 헷갈리니까 위처럼 적어도 된다. 
		this.setAuthor(a);
	}
	
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
	

}
