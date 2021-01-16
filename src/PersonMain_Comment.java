
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스를 사용하기 위해서는 객체를 생성해야 함
		// 객체 생성하고자 할 경우 원하는 클래스 타입의 변수를 생성하고 new 키워드와 해당 클래스의 생성자를 이용하여 객체를 생성함
		Person p1 = new Person(); // Person 클래스 타입의 변수 p1 생성, Person() 생성자를 이용하여 객체를 생성하고 new 키워드를 통해서 메모리에 등록함, 등록된 메모리의 주소를 = (대입연산자) 를 통해서 Person 클래스 타입의 변수 p1에 저장
		
		Person p2; // Person 클래스 타입의 변수 p2를 먼저 생성
		p2 = new Person(); // 필요한 경우 new 키워드와 Person() 생성자를 이용하여 객체 생성 후 메모리에 등록하고 해당 메모리의 주소를 미리 생성해둔 Person 클래스 타입의 변수 p2에 저장
		
//		생성된 객체의 멤버를 사용할 경우 . 을 사용하여 해당 객체의 멤버에 접근함
		p1.name = "아이유";
		p1.gender = 'F';
		p1.height = 161;
		p1.weight = 40.0;
		p1.married = false;
		
//		personInfoPrint(p1.name, p1.gender, p1.height, p1.weight, p1.married);
		
//		System.out.println(p1.name + "의 정보입니다.\n성별 : " + p1.gender + "\n키 : " + p1.height + "\n몸무게 : " + p1.weight + "\n결혼여부 : " + p1.married);
		
		p2.name = "리사";
		p2.gender = 'F';
		p2.height = 166;
		p2.weight = 40.0;
		p2.married = false;
		
//		그래서 아래와 같이 Person 클래스에 프린트해주는 함수를 만들어서 가져와다 쓰면 훨씬 간단해진다. 
		p1.getInfo();
		p2.getInfo();
//		아래와같이 메인 클래스에 메소드를 넣어서 아래와 같이 사용도 할 수 있지만 아래와같이 일일이 다 적는 것은 역시나 비효율적.
//		personInfoPrint(p2.name, p2.gender, p2.height, p2.weight, p2.married);
//		아래와 같이 매 객체마다 실행하는 함수를 적어주면 위와 아래의 내용이 달라지듯이 규격이 없고, 매번 쳐야해서 귀찮다. 
//		System.out.println("이름 : " + p2.name + "\n몸무게 : " + p2.weight + "\n성별 : " + p2.gender + "\n키 : " + p2.height +  "\n결혼여부 : " + p2.married);
		
//		클래스를 이용하지 않고 일일이 변수를 선언한 경우. 이런 경우에는 아래의 데이터 중 하나가 바뀌면 손 쓸 타입이 없다. 오류에 취약하다. 일정한 규격이 없다. 그래서 우리는 Person이라는 클래스를 만들어서, 규격화해서 만들어주고 그걸 이용해서 하나의 객체를 선언 후 위와 같이 사용한다. 그러면 언제나 동일한 형태의 데이터를 저장할 수 있다. 그래서 우리는 클래스를 사용한다.  
//		String p1Name = "아이유";
//		int p1Height = 161;
//		char p1Gender = 'F';
//		double p1Weight = 40.0;
//		boolean p1Married = false;
//		
//		String p2Name = "리사";
//		int p2Height = 166;
//		char p2Gender = 'F';
//		double p2Weight = 40.0;
//		boolean p2Married = false;
//		String p2Job = "가수";
		
		
		System.out.println("\n-----문제1)------\n");
		
		Student stu1 = new Student();
		stu1.name = "김둘리";
		stu1.number = 1;
		stu1.adress = "서울";
		stu1.resultTest = false;
		
		Student stu2 = new Student();
		stu2.name = "고길동";
		stu2.number = 2;
		stu2.adress = "서울";
		stu2.resultTest = true;
		
		stu1.getInfo();
		stu2.getInfo();
		
		
	
	
//	public static void personInfoPrint(String name, char gender, int height, double weight, boolean married) {
//		System.out.println(name + "의 정보입니다.\n성별 : " + gender + "\n키 : " + height + "\n몸무게 : " + weight + "\n결혼여부 : " + married);
	}
	
//	문제 1) person 클래스를 참고하여 Student 클래스를 생성하고, PersonMain 클래스에서 객체 2개 생성 후 정보를 출력하는 프로그램을 작성하세요.
//	파일명 : 20201224_1번_이름.zip
//	파일 목록 : Student.java, PersonMain.java
}
