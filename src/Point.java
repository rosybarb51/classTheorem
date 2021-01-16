
public class Point {
//	외부 접근 불가
//	멤버 변수
	private int x;
	private int y;
	
//	값입력 메서드를 만들어서 외부 접근 불가 멤버 변수에 대신 값을 입력해준다. 
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
//	값출력
	public void showPoint() {
		System.out.println("( " + x + " , " + y + " )");
	}
}
