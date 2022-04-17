package backSh;

import java.util.Scanner;

public class baek1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 
//		먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
//		그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 
//		새로운 수를 만들 수 있다. 다음 예를 보자.
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		
		if (A < 10) {
			A = A * 10;
		}
		
		int B = A / 10;
		int C = A % 10;
		int E = 0;
		//System.out.println("B = " + B + "C = " + C);
		
		for (int i = 0; i < 99; i++) {
			int D = B + C;
			
			if (A == E) {
				System.out.println(i);
				break;
			}
			B = C;
			C = D % 10;
			//System.out.println("B = " + B + "C = " + C + "D = " + D );
			E = B * 10 + C;
		}
//		int D = B + C;
//		System.out.println("D = " + D);
//		//새로운 수
//		int E = C + D;
//		System.out.println("E = " + E);
//		for (int i = 0; i < A; i++) {
//
//			//System.out.println("B = " + B + "C = " + C);
//			int D = B + C;
//			int E = C * 10 + D % 10;
//			System.out.println("E?" + E);
//			if (A == E) {
//				System.out.println("같은데?");
//			}
//		}
	}

}
