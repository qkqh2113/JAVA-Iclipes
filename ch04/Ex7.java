package ch04;

public class Ex7 {
	

	public static void main(String[] args) {
		//for문을 이용하여 1~10까지의 합을 구하시오.
		int total = 0;
		for(int i=1, j=0;i<11;i++) {
			total = total + i;
		}
		System.out.println("total :"+total);
		int j = 0;
		for(;j<11;j++) {
			System.out.println("j:"+j);
			
		}

	}

}
