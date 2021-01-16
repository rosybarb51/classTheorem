package cho06.kumho;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name = "유재석";
		p1.age = 50;
		p1.gender = 'M';
		p1.email = "you@gmail.com";
		p1.getInfo();
		
		Student s1 = new Student();
		s1.studentNumber = "0001";
		s1.classNumber = "c001";
		
		s1.name = "아이유";
		s1.age = 28;
		s1.gender = 'F';
		s1.email = "iu@gmail.com";
		
		s1.getInfo();
		s1.getStudentInfo();
		
		System.out.println("---- 자동타입변환 ----");
//		클래스의 다형성, 부모클래스인 Person 클래스 변수에 자손클래스인 Student 클래스의 객체 s1을 대입. -> (자동 타입 변환)임.
		Person p2 = s1;
		
		p2.getInfo();
//		p2.studentNumbe = 100;
//		p2.getStudentInfo(); // 자손클래스 타입의 객체인 s1을 부모 클래스 타입의 변수 p2에 대입하면 오류난다. -> 부모 클래스타입의 멤버만 사용가능함, 하지만 자손 클래스타입의 객체가 가지고 있는 데이터는 그대로 유지.
		
		System.out.println("---- 자동타입변환 ----");
//		원본이 Student 클래스 타입의 객체이었으므로 부모 클래스 타입을 자손 클래스 타입으로 강제 타입 변환하여 대입이 가능함.
//		강제 타입 변환하게 되면 원본이 원래 가지고 있었던 멤버를 모두 사용 가능하며, 해당 데이터도 그대로 유지됨.
		Student s2 = (Student)p2; // 스튜던트 타입의 변수 선언하고, 거기에 p2가 가지고 있는 것을 다시 스튜던트 타입으로 변환시킨다.->(강제 타입 변환)임.
		s2.getInfo();
		s2.getStudentInfo(); // 그래서 자식클래스 타입의 것을 사용가능함.
		
		
		System.out.println("-----insatanceof-----");
		
		Person p3 = new Person();
		Student s3 = new Student();
		
//		instanceof 를 사용하면 원본이 부모 클래스 타입일 경우 자식 클래스 타입의 객체와 비교 시 false가 결과값으로 나오므로 강제 타입 변환이 가능한지 불가능한지를 확인할 수 있음
		System.out.println(p3 instanceof Person);
		System.out.println(p3 instanceof Student); // 부모를 자식으로 바꾸려고 해서 false가 나옴
		System.out.println(s3 instanceof Person); // 자식클래스이니까 부모 클래스로 변경 가능해서 true가 나온다. 
		System.out.println(s3 instanceof Student);
		
		if (p3 instanceof Student) {
			s3 = (Student)p3;
			System.out.println("강제 타입 변환 합니다.");
		}
		else {
			System.out.println("강제 타입 변환 못 합니다.");
		}
		
	}

}






















