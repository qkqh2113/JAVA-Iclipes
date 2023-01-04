package ch06;

//클래스 선언-> 필드&매서드 -> 객체생성(new, 필드 및 메서드 사용)
class Car2{
	
	String name;
	int speed;
	int gear;
	
	void stop() {
		speed=0;
	}
}
public class CarEx2 {
	public static void main(String[] args) {
		int a =10;
		int b = a + 10;
		for (int i = 0; i < 100; i++) {
			Car2 c1 = new Car2();	
			//System.out.println(c1.toString());
		}
		//요청된 소문자를 대문자로 바꿈
		String s = new String("dfdfdfdfdifmf");
		System.out.println(s.toUpperCase());
		
		//32라는 10진수를 2진수로 출력하세요.
		Integer i = new Integer(32);
		System.out.println(i.toBinaryString(i));
		
				
		
	}

}
