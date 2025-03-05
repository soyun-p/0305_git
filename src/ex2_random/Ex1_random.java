package ex2_random;

import java.util.Random;

public class Ex1_random {
	
	public static void main(String[] args) {
		
		// random(난수)도 import 필수!
		
		// new Random.nextInt( 난수의 범위 ) + 시작수;
		// new Random.nextInt( 끝 수 - 시작수 + 1 ) + 시작수;
		
		// 1 ~ 5 사이의 난수
		int num = new Random().nextInt(5) + 1;  // + 1 -> 시작 수, nextInt(5) -> 범위, 개수
		
		System.out.println(num);
		
		
		// 2 ~ 7 사이의 난수
		num = new Random().nextInt(6) + 2;  // 2에서 시작해서 6번째 수, 즉 7까지. 2, 3, 4, 5, 6, 7 -> 총 6개.
		
		System.out.println(num);
		
		
		// 2374 ~ 3130 사이의 난수
		num = new Random().nextInt(3130 - 2374 + 1) + 2374;  // 단위가 커지면 (범위수 - 시작수 + 1)로 입력해준다.
		
		System.out.println(num);
		
		
		
		// 난수를 이용하여 대문자 A ~ Z 사이의 값 중 한 개를 출력.
		// 결과 : U (A와 Z 사이의 아무 값 중 하나)
			
		int num1 = new Random().nextInt( 'Z' - 'A' + 1) + 'A';  // 아스키 코드를 쓸 때에는 형 변환 사용 추천.
		
		System.out.println("결과 : " + (char)num1);
		
		
		
		
		
	}  // main

}
