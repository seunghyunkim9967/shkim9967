package backSh;

import java.util.Scanner;

public class baek1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. 
//		���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�. 
//		�� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� 
//		���ο� ���� ���� �� �ִ�. ���� ���� ����.
		
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
//		//���ο� ��
//		int E = C + D;
//		System.out.println("E = " + E);
//		for (int i = 0; i < A; i++) {
//
//			//System.out.println("B = " + B + "C = " + C);
//			int D = B + C;
//			int E = C * 10 + D % 10;
//			System.out.println("E?" + E);
//			if (A == E) {
//				System.out.println("������?");
//			}
//		}
	}

}
