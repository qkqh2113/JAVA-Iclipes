package ch06;


//클래스 선언: 풀네임 ch06.car1
//클래스 : 객체를 만드는 틀이다.
class Car1/*car1: 클래스 명*/{
	
	//필드: 객체의 속성 <- 무조건! ()괄호가 없다
	String carName;
	int velocity;
	String carColor;
	
	//메소드: 객체의 기능 <- 반드시! ()괄호가 있다
	void speedUp(/*매개변수*/) {
		velocity++;
	}
	
	void speedDown(/*매개변수*/) {
		velocity--;
		if(velocity<0)
			velocity =0;
	}
	void stop(/*매개변수*/) {
		velocity = 0;
	}
}//--class

//.java로 선언된 클래스만 public 사용 가능
public class CarEx1 {

	public static void main(String[] args) {
		int arr[] = new int[3];
		System.out.println(arr.length);
		String str = "오늘의 메뉴는 수구레";
		System.out.println(str.length());
		
		//객체 생ㅅ어
		Car1 c1;
		c1 = new Car1();
		//new 개수 만큼 객체가 만들어짐.
		c1.carName = "소나타";
		c1.carColor = "은색";
		c1.speedUp();
		
		System.out.println(c1.carName);
		System.out.println(c1.carColor);
		System.out.println(c1.velocity);
	}

}
