
// 클래스 생성
public class Person {
//	멤버 변수만 가지고 있는 Person 클래스
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
//	실행함수도 포함됨.
	public void getInfo() {
		System.out.println(name + "의 정보입니다.\n성별 : " + gender + "\n키 : " + height + "\n몸무게 : " + weight + "\n결혼여부 : " + married);
	}
}
