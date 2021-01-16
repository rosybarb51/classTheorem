import java.util.Scanner;

public class Player {
	private Scanner sc; // 사용자 키보드 입력
	private String name; // 게임 참가자 이름
	private String word; // 참가자가 말한 단어
	
//	매개변수를 사용한 생성자, 사용자의 이름을 매개변수로 입력받음.
	public Player(String name) {
		this.name = name; // 멤버 변수에 이름 저장
		sc = new Scanner(System.in); // 위에서 멤버변수 선언할 때 해도 되고, 이렇게 생성자 만들면서 해도 된다.
//		그러나 보통 멤버변수의 초기화는 생성자가 초기화하니까 여기서 해주는 게 맞긴하다. 
	}
	
//	클래스의 멤버변수는 외부에서 직접 접귾는 것이 좋지 않음
//	getter를 사용하여 입력된 사용자의 이름을 대신 가져옴
	public String getName() {
		return name;
	}

//	게임 참가자가 말한 단어를 입력받는 메서드
	public String getUserWord() {
		System.out.print(name + " > ");
		word = sc.next(); // 사용자가 입력한 내용을 멤버 변수에 저장
		return word; // 외부에서도 사용하니까 
	}
	
//	매개변수로 이전 사람의 단어를 가지고 와서 현재 사람의 단어와 비교
	public boolean checkWord(String lastWord) {
		boolean result = false; // 결과, 기본값 false
		int lastIndex = lastWord.length() - 1;
		
//		charAt(index) 메서드는 해당 문자열의 index 번째 글자 1개를 반환한다.(char 타입으로 반환)
//		char 타입은 정수형 데이터 타입, 비교 연산자로 정확한 비교 가능
		if (lastWord.charAt(lastIndex) == word.charAt(0)) {
			result = true;
		}
		
		return result;
	}
}










