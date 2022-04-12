package msShk4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();
		int bin[] = new int[100];
		/*
		19 / 2    9 ... 1
		9  / 2    4 ... 1
		4  / 2    2 ... 0
		2  / 2    1 ... 0
		1  / 2    0 ... 1
		
		  010011 => 19
		*/
//		System.out.println(bin.length);
		for (int i = 0; i < bin.length; i++) {
			if (inputNum % 2 == 1) {
				bin[i] = inputNum % 2;
				
			} else {
//				bin[i] = inputNum % 2;
				bin[i] = inputNum % 2;
				
			}
			inputNum = inputNum / 2;
			System.out.print(bin[i]);
			if (inputNum == 0) {
				return;
			}
		}
		//끝나고 메모 2022-04-11 while문, 짧은 코드로 해결 가능 
	}

}
