package backSh;

import java.util.Scanner;

public class back2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int dice1 = scan.nextInt();
		int dice2 = scan.nextInt();
		int dice3 = scan.nextInt();
		
		int amt   = 0;
//		���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�. 
//		���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ����� �ް� �ȴ�. 
//		��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�.
		
		if (dice1 == dice2 && dice2 == dice3) {
			System.out.println("���� ���� 3��");
			amt = 10000 + dice1 * 1000;
		} else if (dice1 == dice2 || dice1 == dice3 || dice2 == dice3) {
			System.out.println("���� ���� 2��");
			if (dice1 == dice2 || dice1 == dice3) {
				amt = 1000 + dice1 * 100;
			} else if (dice2 == dice3) {
				amt = 1000 + dice2 * 100;
			}
		} else if (dice1 != dice2 && dice2 != dice3) {
			System.out.println("��� �ٸ� ��");
			int[] array = new int[] {dice1 , dice2 ,dice3};
			int max = array[0];
			
			for (int i = 1; i < array.length; i++) {
				if (array[i]>max) {
					max = array[i];
				}
			}
			amt = max * 100;
		}
		System.out.println(amt);
	}

}
