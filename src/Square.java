// 2020.12.24
// 문제 2)
public class Square {
//	너비와 높이를 저장할 멤버 변수
	int width;
	int height;
	
//	사각형의 넓이와 둘레를 구하는 메서드
	public void CalArea() {
		System.out.println("세로 : " + height + "\n가로 : " + width + "\n넓이 : " + (height * width) + "\n네 변의 합 : " + (2 * (height + width)));
	}
}

// this 키워드를 사용하려면 생성자를 사용하거나, 데이터 세팅용 (저장용) 메서드를 하나 더 만들어서 사용하자. 
// public void setSquare(int width, int height) {
//    this.width = width;
//    this.height = height;
//   }

// ->이 파일에서 ㅇ위 처럼 넣고 실행파일에 아래와같이
// Square squ = new Square();

// squ.setSquqre(10, 5);
// 이런식으로 넣어서 사용하는 거다.. 
