package ch04;

public class Ex1010 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if(i+j>10) {
					break; //for2를 빠져나온다.
				}
			}//for2
		}//for1
		
		iot :/*라벨값*///구역의 시작 위치
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if(i+j>10) {
					break iot ; //for2를 빠져나온다.
				}
			}//for2
		}//for1
		
		//중첩 for문을 이용해서 i와 j의 합이 30이 넘으면 빠져나오시오.
		iot2 :
			for (int i = 0; true; i ++) {
				for (int j = 0; true; j++) {
					System.out.println(i+j);
					if(i+j>30) {
						break iot2;
					}
				}
			}
	}

}
