package ex3_while;

public class Ex1_while {
	
	public static void main(String[] args) {
		
		// while문 : 간편한 구성을 가진 반복문.
		// 선 비교, 후 처리
		
		/* while(조건식) {
		       조건식이 참일 때 실행되는 영역
		  } 
		                                            */		
		int num = 1;
		
		while( num <= 5 ) { // num이 1부터 시작해서 5가 될 때까지(즉, 조건을 충족할 때까지) 실행문(num에 1씩 더해가면서 출력)을 반복.
			System.out.println(num);
			num++;
		}  // while
		
		
		
		System.out.println("-------------------");
		
		
		
		/* while (true) {  // while문에서 조건식이 true이면, break문을 만나지 않는 이상 무한 반복.
			System.out.println(num++);  
		} */
		
	}  // main

}
