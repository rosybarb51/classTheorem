// 문제 3) 끝말잇기 프로그램 만들기
import java.util.Scanner;

public class WordGame {
	private Scanner sc; // 사용자 입력을 위한 Scanner, 계속 사용하기 때문에 멤버변수로 선언했다. 
	private String startWord;
	
//	생성자, 멤버 변수 초기화
	public WordGame() {
		startWord = "아버지";
		sc = new Scanner(System.in);
	}
	
//	실제 끝말잇기를 실행하는 메서드
	public void run() {
		System.out.println("끝말잇기 게임을 시작합니다.");
		System.out.println("시작 단어는 '" + startWord + "'입니다.");
		
//		사용자가 입력하는 단어가 저장될 변수
		String lastWord = startWord;
		
		System.out.println("시작 > " + startWord);
		
//		무한루프 - while 문에 (true) 쓰는 게 깔끔하다. for 문은 무한루프할 때 안 쓴다. 
		while(true) {
			System.out.print("입력 > ");
			startWord = sc.next();
			
			if (checkWord(lastWord) == true) {
				System.out.println("출력 > " + startWord);
				lastWord = startWord;
			}
			else {
				System.out.println("끝말잇기가 실패했습니다.");
				break;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
//	예전 문자열과 입력받은 문자열을 비교하는 메서드 
	public boolean checkWord(String lastWord) {
		int lastIndex = lastWord.length() - 1;
		
		if (lastWord.charAt(lastIndex) == startWord.charAt(0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}















