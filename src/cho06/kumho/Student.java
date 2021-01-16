package cho06.kumho;

public class Student extends Person {
	public String studentNumber;
	public String classNumber;
	
	public void getStudentInfo() {
		System.out.println("학번 : " + studentNumber + "\n이름 : " + name + "\n나이 : " + age + "\n성별 : " + gender + "\n분반 : " + classNumber + "\n이메일 : " + email);
	}
	
}
