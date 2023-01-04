package ch05;

public class Ex2 {

	public static void main(String[] args) {
		//다차원 배열 : n차 갯수만큼 for문이 존재
		int arr[][] = new int[2][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i+j;
				System.out.println("arr["+j+"]["+j+"]="+arr[i][j]);
				
			}//--for 2
		}//--for1
		
		//문제1 arr2의 모든 값의 합을 구하십시오.
		
		int total= 0;
		int arr2[][] = {{1,2},{3,4,5},{6},{1,2,3,4,},{2,3,4}};
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				total= total+arr2[i][j];
			}	
		}System.out.println(total);

		double sum =0;
		double count = 0;		
		double arr3[][]= {{1.0},{2.3,3.4},{4.5,6.2,4.3},{9.0}};

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				sum= sum+arr3[i][j];
				count++;
			}
		}System.out.println(total/count);
	}	
}
		
