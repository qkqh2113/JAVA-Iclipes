
package ch04;

public class Ex10 {

	public static void main(String[] args) {
		//break는 반복문에서는 중간에 종료되는 기능이다.
		int a = 0;
		while(true) {
			if(a==10) {
				break;
			}
			System.out.println("a: "+a);
			a++;
		}//--while
		//for문을 이용하여 순차적으로 1에서 n까지의 합이 100에서 최대한 가까운 합을 리턴
		int sum = 0;
		for(int i = 0; true; i++) {
			if(sum>100) 
				break;
			sum+=i;
		System.out.println("sum : "+sum);
		
		for(int i=0; i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(i+"+"+j+(i+j));
			}
			System.out.println();
		}
	}
	}
}
