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
			//사용자가 입력한 수
			inputNum[i] = scan.nextInt();
			
		}
		
		int []mode = new int [10];
		
		for (int i = 0; i < mode.length; i++) {
			//사용자가 입력한 수 mode
			//mode 배열에 입력한 수의 인덱스에 ++
			//ex) 1 2 2 3 1 4 2 2 4 3 
			//루프대로 돌게 되면 
			//순서대로 mode[ inputNum[0] ]++ = inputNum[0]인덱스인 1이
			//mode[1] 에 ++(1증가) 시켜주어 최빈수를 알기 위한 mode배열에 저장되게 됨
			//다음 순서로 inputNum[1]에 있는 값인 2가 mode[2] 인덱스에 카운트 1추가 되게됨
			//다음 순서 inputNum[2]에 있는 값인 2가 mode[2] 인덱스 카운트에 1++ = mode[2] 는 2가 됨 (카운트)
			mode[inputNum[i]]++;
			
			System.out.println("modeinputNum = " + mode[inputNum[i]]);
			//+ " mode[i] = " + mode[i] 다름
		}
		
		int modeNum = 0; //최빈수
		int modeCnt = 0; //최빈수카운트(횟수)
		
		for (int i = 0; i < mode.length; i++) {
			if (modeCnt < mode[i]) {
				System.out.println("modeCnt = " + modeCnt + "mode[i] = " + mode[i] );
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.println("최빈수 = " + modeNum + "카운트 = " + modeCnt);
	}

}
