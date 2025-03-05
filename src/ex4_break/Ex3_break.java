package ex4_break;

public class Ex3_break {
	
	public static void main(String[] args) {
		
		int num = 0;
		
		while( true ) {  
			
			switch( num ) {
			case 1:
				System.out.println("1.메뉴");
				break; 
				// 반복문 내부의 switch문이 있다면, break문을 만나도 반복문이 아닌 switch문만 빠져나갈 수 있다.
				
			case 2:
				System.out.println("2.설정");
				break;
			
			} // switch
			
			// break는 case 1, case 2를 나오고, 점차 switch까지 나와서 num++을 실행한다. 따라서 case1, 2가 반복해서 출력된다. 
			
			num++;
			
			
		} // while
		
		
		
		
	}  // main

}
