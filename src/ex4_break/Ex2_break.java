package ex4_break;

import java.util.Scanner;

public class Ex2_break {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("5를 입력하면 종료");
		
		int n = 0;
		
		while( true ) {
			
			n = sc.nextInt();
			System.out.println("입력받은 값 : " + n);
			
			if(n == 5) {
				System.out.println("종료");
				break;  // 입력받은 값이 5이면, 가장 가까운 while문을 빠져나옴.
			}  // if
			
		} // while
		
		
		
	} // main

}
