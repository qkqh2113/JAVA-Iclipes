package ch06;

class Constructor5{
	
	int a;
	String str;
	
	public Constructor5() {
		//중복된 기능
	}
	public Constructor5(int i) {
		a = i;
		//중복된 기능
	}
	public Constructor5(String s) {
		str = s;
		//중복된 기능
	}
}

class Constructor5_1{
	int a;
	String str;
	
	public Constructor5_1() {
		//중복된 기능
	}
	public Constructor5_1(int i) {
		this(); //this(); : 자기자신을 가르키는 키워드
				 //중복되는 기능을 자동으로 넣어줌!
				 //this 는 무조건 첫번째 라인
		         //즉 super(); 와 같이 사용 불가능
		a = i;
	}

	public Constructor5_1(String s) {
		this();
		str = s;
	}

}

public class ConstructorEx5 {

	public static void main(String[] args) {

	}

}
