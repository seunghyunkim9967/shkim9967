package backSh;

import java.util.Scanner;

public class baek10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ��Ա� ������ ��� �ּ� �ް���
		
		// �Է� �ޱ�
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		// �迭 ����
		int [] arr = new int [N];
		// �Է¹��� ���� �迭�� ������ �°� ����
		for (int i = 0; i < arr.length; i++) {
//			System.out.print(i+1 + "��°" + "���� �Է� : ");
//			System.out.println();
			arr[i] = scan.nextInt();
		}
		//�ּ� �ִ� ��
		int min = arr[0];
		int max = arr[0];
		
		for (int num : arr) {
			if (num > max) {
				max = num;
			} else if (num < min) {
				min = num;
			}
			
		}
		System.out.println(min + " " + max);
	}

}
