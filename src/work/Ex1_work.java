package work;

public class Ex1_work {
	
	public static void main(String[] args) {
		
		// 2 x 1 = 2   3 x 1 = 3   4 x 1 = 4   .......
	    //   .........   
		// 2 x 9 = 18  3 x 9 = 27  4 x 9 = 36 .........
		
		// 다중 for 이용
		
		
		for(int i = 1; i <= 9; i++) { // 행에서는 값이 유지되는 것은 1, 2, 3,... 이 반복되고 있다.
			
			for(int j = 2; j <= 9; j++) {  // 열에서 값이 유지되고 있는 부분을 주목. 열에서는 2, 3, 4,... 가 반복되고 있음.
				
				System.out.printf("%d x %d = %d\t", j, i, j*i);  // 따라서 각각 유지되는 값에 맞게 출력.
				
				
			} // inner
			
			System.out.println();
			
			
		}  // outer
		
		
	}  // main

}
