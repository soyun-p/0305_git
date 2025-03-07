package work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		// 1 ~ 100까지 반복하는 for문에서 사용자에게 입력받은 숫자보다 큰 첫번째 숫자가 나왔을 때 종료.
		
		// 값 : 7
		// 1
		// 2		
		// 3
		// ...
		// 8  나오고 종료
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값 : ");
			
		int n = sc.nextInt();			
				
		for(int i = 1; i <= 100; i++) {	
			
			System.out.println(i);
			
			if( i > n ) { 
				break;				
			} // if
			
		} // for
		
		
		
	} // main

}
