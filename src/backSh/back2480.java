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
//		같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
//		같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//		모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
		
		if (dice1 == dice2 && dice2 == dice3) {
			System.out.println("같은 눈이 3개");
			amt = 10000 + dice1 * 1000;
		} else if (dice1 == dice2 || dice1 == dice3 || dice2 == dice3) {
			System.out.println("같은 눈이 2개");
			if (dice1 == dice2 || dice1 == dice3) {
				amt = 1000 + dice1 * 100;
			} else if (dice2 == dice3) {
				amt = 1000 + dice2 * 100;
			}
		} else if (dice1 != dice2 && dice2 != dice3) {
			System.out.println("모두 다른 눈");
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
