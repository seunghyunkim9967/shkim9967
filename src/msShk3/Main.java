package msShk3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []arr = new int[14];
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] inputNum = new int[10];
		//System.out.println(Array.length);
		for (int i = 0; i < inputNum.length; i++) {
			//����ڰ� �Է��� ��
			inputNum[i] = scan.nextInt();
			
		}
		
		int []mode = new int [10];
		
		for (int i = 0; i < mode.length; i++) {
			//����ڰ� �Է��� �� mode
			//mode �迭�� �Է��� ���� �ε����� ++
			//ex) 1 2 2 3 1 4 2 2 4 3 
			//������� ���� �Ǹ� 
			//������� mode[ inputNum[0] ]++ = inputNum[0]�ε����� 1��
			//mode[1] �� ++(1����) �����־� �ֺ���� �˱� ���� mode�迭�� ����ǰ� ��
			//���� ������ inputNum[1]�� �ִ� ���� 2�� mode[2] �ε����� ī��Ʈ 1�߰� �ǰԵ�
			//���� ���� inputNum[2]�� �ִ� ���� 2�� mode[2] �ε��� ī��Ʈ�� 1++ = mode[2] �� 2�� �� (ī��Ʈ)
			mode[inputNum[i]]++;
			
			System.out.println("modeinputNum = " + mode[inputNum[i]]);
			//+ " mode[i] = " + mode[i] �ٸ�
		}
		
		int modeNum = 0; //�ֺ��
		int modeCnt = 0; //�ֺ��ī��Ʈ(Ƚ��)
		
		for (int i = 0; i < mode.length; i++) {
			if (modeCnt < mode[i]) {
				System.out.println("modeCnt = " + modeCnt + "mode[i] = " + mode[i] );
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.println("�ֺ�� = " + modeNum + "ī��Ʈ = " + modeCnt);
	}

}
