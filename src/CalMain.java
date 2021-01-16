// 2020.12.24 
public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---- 문제 2) ----\n");
// 문제 2) 
		Square squ1 = new Square();
		squ1.height = 5;
		squ1.width = 10;
		
		squ1.CalArea();
		
		System.out.println("\n---- 문제 3) ----");
//	문제 3)

		Circle pizza = new Circle();
		pizza.name = "pizza";
		pizza.radius = 20.20;
		pizza.CalArae();
		
		Circle donut = new Circle();
		donut.name = "donut";
		donut.radius = 12.24;
		donut.CalArae();
	}

}
