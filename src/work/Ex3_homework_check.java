package work;

public class Ex3_homework_check {
	
	public static void main(String[] args) {
		
		//         *        
		//       * * *      
		//     * * * * *    
		//   * * * * * * *  
		// * * * * * * * * *
		
		// 전공자는 for문 2개로, 비전공자는 4개.
		
		// 앞쪽 부분도 채워져 있는 형태(아래)로 뽑아놓고 필요없는 부분을 지우는 형식으로 코딩.
		/*
		 * * * * *           -> i=0
         * * * * * *         -> i=1
         * * * * * * *       -> i=2
         * * * * * * * *     -> i=3
         * * * * * * * * *   -> i=4
 */ // j=0
		
		
		// 선생님 답안.
		
		// 별을 찍어야 하는 상황과 공백을 찍어야 하는 상황을 구분.
		
		for(int i = 0; i < 5; i++) {
					
			for(int j = 0; j < 5 + i; j++) {  // i가 0일 때는 5회전, 1일 때는 6회전, ....
				
				if( i + j > 3 ) {  // 공백을 출력해야 하는 부분은 i+j가 3이하인 부분이기 때문.
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}				
				
								
			} // inner
			
			System.out.println();					
			
			
		} // outer
		
		
		
		for(int i = 3; i >= 0; i--) {
			
			for(int j = 0; j < 5 + i; j++) {
				
				if( i + j > 3 ) {
					System.out.print("* ");	
				}else {
					System.out.print(" ");
				}
				
			} // inner
			
			System.out.println();
			
		} // outer
		
		
		
	} // main

}
