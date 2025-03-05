package ex4_break;

public class Ex1_break {
	
	public static void main(String[] args) {
		
		// break문 : 반복문 내에서 강제적으로 가장 가까운 반복문을 빠져나갈 때 사용하는 키워드.
		// 필수 조건 : 반드시 반복문 내에서 사용. 가장 가까운 반복문을 빠져나가야 함.
		
		// switch문(분기문)은 반복문은 아니지만 예외적으로 break 사용 가능.
		
		
		for(int i = 1; i <= 2; i++) {
			
			for(int j = 1; j <= 10; j++) {
				
				if(j % 2 == 0) {
					break;	// inner for문에 포함되어 있는 것(if문에는 포함x). inner for문과 가장 가까움.
					
					// j가 짝수일 때는 inner for문을 강제로 탈출. 따라서 j가 2일 때는 j를 프린트하지 않으므로 1만 프린트.
					// j 는 break문 때문에 10바퀴를 다 못 돌고 2바퀴만 가능.
					
					// System.out.println(); -> 실행 불가. break문 아래에는 어떤 실행문도 쓸 수 없다.
					
				} // if
				
				System.out.print(j + " ");
				
			} // inner
			
			System.out.println();
			
		} // outer
		
		
	} // main

}
