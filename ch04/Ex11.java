package ch04;

public class Ex11 {

	public static void main(String[] args) {
		//1~10사이의 작수를 출력하시오.
		for (int i = 1; i < 11; i++) {
			if(i%2==0) {
			System.out.println(i+"\t");
			}
		}
		System.out.println("\n--------------------");
		for (int i = 1; i < 11; i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i+"\t");
		}//--for
		
		// 1~20사이에 3의 배수와 합을 출력하시오.(continue)
		//3+6+9+12+15+18=nnn
		
		int sum = 0;
		for (int i = 1; i < 20; i++) {
			if(i%3!=0) { 
				continue;
		}else {
			if(i>3) {
				System.out.println("+ ");
			}
		}
		sum+=i;
		System.out.println(i+" ");
		}
		System.out.println("="+sum);
		
}
}