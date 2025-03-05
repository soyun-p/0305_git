package ex3_while;

import java.util.Random;

public class Ex2_do_while {
	
	public static void main(String[] args) {
		
		// 선 처리, 후 비교  => 따라서 ?
		
		// do{
		//    처리 영역
		// }while( 조건식 );
		
		int i = 11;
		
		do {
			System.out.println(i);
			i++;
		}while( i <= 10 );
		
		
		System.out.println("--------------------");
		
		
		// 자바, jsp, spring 시험을 봤다. 각 과목별 점수는 난수로 0 ~ 130점 대입. 
		// 난수로 만들어진 세 과목이 모두 0 ~ 100 범위의 값이라면, 결과를 출력.
		// 자바 : 99
		// jsp : 19
		// spring : 75
		
		int java = 0;  
		int jsp = 0;
		int spring = 0;
		
		do {  // 처리(과목별 난수 처리)
			
			java = new Random().nextInt(131); // 0은 생략 가능
			jsp = new Random().nextInt(131) + 0;
			spring = new Random().nextInt(131) + 0;
					
		}while( java > 100 || jsp > 100 || spring > 100);	// 선 처리 후, 후 비교(조건 확인)
		
	    System.out.println("자바 : " + java);
	    System.out.println("jsp : " + jsp);	
		System.out.println("spring : " + spring);
		
		
		
		
		/* while문으로 했다면?
		   
		   int java = 0;
		   int jsp = 0;
		   int spring = 0;
		   
		   while( java > 100 ) {
		        int java = new Random().nextInt(131);
		        jsp = new Random().nextInt(131) + 0;
			    spring = new Random().nextInt(131) + 0;
		   }
		 */
		
			
		
		
		
		
		
		
		
		
		
		
		
	} // main

}
