package ex1_printf;

public class Ex1_printf {
	
	public static void main(String[] args) {
		
		//자바의 출력 코드 : formatter
		
		int age = 30;
		
		System.out.println("내 나이는 " + age + "살입니다."); // 이 방식은 출력내용이 길어지면 +도 많이 쓰는 등의 불편함이 있다.
		
		// printf
		System.out.printf("내 나이는 %d살 입니다.\n", age);  // %d에 age가 대입. 가독성이 훨씬 좋다.
		System.out.printf("나는 %dcm고 %d살이야\n", 175, 22);  // %d가 두 개 이상 : 순서대로 대입될 값을 ,를 사용하여 입력해준다.
		
		
		System.out.println("-----------------");  // 줄바꿈까지 세트로 포함. 그러나 printf는 줄바꿈이 없음.
		
		// 이스케이프 코드
		// 1) \n : 강제 개행(줄바꿈)
		
		
		System.out.printf("오늘 기온은 %f도 입니다.\n", 11.6); 
		
		System.out.printf("내 시력은 %.1f이야\n", 2.0);  // % 와 f 사이에 .1 입력하면 소수점 1자리까지 출력.
		
		System.out.printf("빨간 사탕은 %d개고, 파란 사탕은 %.1f개야\n", 2, 1.5); // 알맞은 자리에 알맞은 타입의 자료를 대입해야 한다.
		
		// formmater의 자료형 타입
		// %d : 정수.
		// %f : 실수. 소수점 6자리까지 출력. 
		// %c : 문자. 아스키 코드 넣어도 가능.
		
		System.out.println("-----------------");
		
		
		System.out.printf("국어 성적 : %c\n", 'B');  // %c : 문자. 'B' 자리에 아스키 코드 넣어도 B 출력.
		
		
		System.out.println("------------------");
		
		
		System.out.printf("참 : %b, 거짓 : %b\n", true, false); // %b : boolean 타입. 논리형. 결과는 꼭 참, 거짓 둘만 가능.
		
		System.out.printf("%s는 %02d살이다.\n", "홍길동", 9);  // %s : 문장 스트링 타입.
		// %와 d 사이에 02를 쓰면, 숫자가 한자리 숫자일때 앞에 0을 붙여서 2자리를 채워달라는 의미. 두자리 숫자일때는 상관 없다. 
		
		System.out.printf("상위 %d%%\n", 10);  // % 기호를 문자열로서 쓰고 싶다면 %% 두 개를 붙여 써야 한다.
		
		System.out.println("홍길동\t대표");
		System.out.println("고수\t부대표");  // \t : 동일한 공백. tab키 만큼의 간격 띄움. t의 수대로 띄어쓰기
		
		
		
		
		
		
	} // main

}
