package work;

public class Ex3_homework {
	
	public static void main(String[] args) {
		
		//         *        ->7
		//        * *       ->6
		//       * * *      ->5
		//      * * * *     ->4
		//     * * * * *    ->3
		//    * * * * * *   ->2
		//   * * * * * * *  ->1
		//  * * * * * * * * 
		
		// 전공자는 for문 2개로, 비전공자는 4개.
		
		
		for(int i = 0; i < 8; i++) {
					
			for(int j = 0; j <= i; j++) {
								
				System.out.print("* ");
				
								
			} // inner
			
			System.out.println();					
			
			
		} // outer
		
		
		
	} // main

}
