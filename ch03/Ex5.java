package ch03;

public class Ex5 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		a = a + 10;
		System.out.println(a);
		b+=10;//b=b+10
		System.out.println(b);
		a/=5;
		System.out.println(a);
		b%=3;
		System.out.println(b);
		//삼항연산자
		int c = 10;
		String s = (c%2==0)?"짝수":"홀수";
		System.out.println(s);
		int d = (c>0)?c:-c;
		System.out.println(d);
		Math.abs(10);
		
		
		
		

	}

}
