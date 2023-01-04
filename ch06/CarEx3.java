package ch06;

class Car3 {
	
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

	
public class CarEx3 {

	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3();
		c1.carName = "아반테";
		c2.carName = "소나타";
		System.out.println("c1:" + c1.carName);
		System.out.println("c2:" + c2.carName);
//		System.out.println(c1.toString());
//		System.out.println(c2.toString());
		c2 = c1; //참조형의 "="은 call by reference방식이다.
//		System.out.println(c1.toString());
//		System.out.println(c2.toString());
		System.out.println("c1:" + c1.carName);
		System.out.println("c2:" + c2.carName);
//		
		c1.carName = "그랜져";
		
	int a = 10;
	int b = a; //자바 기본형 call by value
	a = 20;
	System.out.println(a+b);
	}

}
