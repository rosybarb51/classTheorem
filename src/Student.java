// 2020.12.24
// 문제1)
public class Student {
	String name;
	int number;
	String adress;
	boolean resultTest;
	
//	화면 출력을 위한 메서드
//	아래의 변수들은 다 멤버 변수를 부른 것이다. 원래 this.name으로 들어가야 하는데, 동일한 클래스의 멤버끼리는 this.를 사용 안해도 멤버의 이름으로 호출 가능하다. 
	public void getInfo() {
		System.out.println("이름 : " + name + "\n번호 : " + number + "\n주소 : " + adress + "\n시험통과여부 : " + resultTest);
	}
	
//	데이터 저장을 위한 메서드 선언
	public void setInfo(String name, int number, String adress, boolean resultTest) {
//		괄호 안에 매개 변수로 데이터 입력 받은 것이 this로 해당 클래스의 멤버 변수에 넣어준다. 
//		객체의 멤버변수에 데이터 저장.
		this.name = name;
		this.number = number;
		this.adress = adress;
		this.resultTest = resultTest;
	}
}
