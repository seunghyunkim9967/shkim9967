package backSh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baek1110_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 1110_2 �� �����ڵ��
		// BufferedReader �� ���� ����̴� 
		// BufferedRedaer �� Ű������ �Է��� ���� ������ �� ���ھ� ���۷� �����Ѵ�.
		// ���۸� ���� Ű���尡 ���� ������ ���� ������ ������ �������� �ٷ� �̵���Ű�� �ͺ���
		// �߰��� �޸� ���۸� �ּ� �����͸� �ѵ� ���� �̵���Ű�� ���� ���� ȿ�����̰� ����.
		// �׳� (���� ��ĳ�ʶ�� �����Ѵ�) �����ϰ� �Ǹ� CPU�� ����, ���� ���� ���� ��ȿ����.
		
		// * ���� ���� �ļ� ����� �����µ� , �ѹ� ������ ������ ���� ������ �ͺ��� , ������ ���� ä�� �ѹ��� ������ �Ͱ� ���� ��ġ. �� ��Ƶ״ٰ� �� ���� ����!!
		
		// ��ĳ�ʴ� ����(�����̽�)�� ����(���๮��)�� ���� �Է� ���� �ν�.
		// ������ ���� ������ �ʿ� X 
		
		// �ݸ� BufferedReader�� ���͸� ���� �ν�, ���� ������ String ���� ����!! (���� �����ؾ� ��)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int copy = N;
        
		do {
			N = ( (N % 10) * 10 ) + ( ( (N / 10) + (N % 10) ) % 10 );
			cnt++;
		} while (copy != N);
		
		System.out.println(cnt);
	
	}
	
	
	//�ٸ� ���
//	Scanner scan = new Scanner(System.in);
//	int A = scan.nextInt();
//	scan.close();
//	
//	int cnt = 0;
//	int copy = A;
//	
//	while(true) {
////		26�� ��� 
////		(A % 10) * 10) = 6 * 10 = 60
////		(((A / 10) + (A % 10)) % 10) = (2 + 6) % 10 = 8
//		A = ((A % 10) * 10) + (((A / 10) + (A % 10)) % 10);
//		cnt++;
//		
//		if (copy == A) {
//			break;
//		}
//	}
//		System.out.println(cnt);
}
