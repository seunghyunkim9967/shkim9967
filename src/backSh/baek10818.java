package backSh;

import java.util.Scanner;

public class baek10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자주 까먹기 때문에 계속 주석 달겠음
		
		// 입력 받기
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		// 배열 생성
		int [] arr = new int [N];
		// 입력받은 수를 배열에 순서에 맞게 저장
		for (int i = 0; i < arr.length; i++) {
//			System.out.print(i+1 + "번째" + "숫자 입력 : ");
//			System.out.println();
			arr[i] = scan.nextInt();
		}
		//최소 최대 값
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
