package ch04;

import java.util.Arrays;

public class LottoLucky {

	public static void main(String[] args) {
		int lotto[] = getLotto();
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]+"\t");
			
		}

	}
	
	public static int[] getLotto() {
		int lotto[] = new int[6];
		//배열 밑에 항상 for문 있다.
		//중복로직 추가
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;//1~45
			
			for(int j =0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
					
				
			}
		}
		Arrays.sort(lotto);//오름차순 정렬
		return lotto;
	}

}
