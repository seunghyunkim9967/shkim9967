package backSh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baek1110_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 1110_2 는 정답코드고
		// BufferedReader 를 쓰는 방식이다 
		// BufferedRedaer 는 키보드의 입력이 있을 때마다 한 문자씩 버퍼로 전송한다.
		// 버퍼링 없이 키보드가 눌릴 때마다 눌린 문자의 정보를 목적지로 바로 이동시키는 것보다
		// 중간에 메모리 버퍼를 둬서 데이터를 한데 묶어 이동시키는 것이 보다 효율적이고 빠름.
		// 그냥 (나는 스캐너라고 생각한다) 전송하게 되면 CPU와 성능, 갭이 많이 나서 비효율적.
		
		// * 예시 흙을 파서 언덕에 버리는데 , 한번 삽질할 때마다 가서 버리는 것보다 , 수레에 가득 채워 한번에 나르는 것과 같은 이치. 즉 모아뒀다가 한 번에 전송!!
		
		// 스캐너는 띄어쓰기(스페이스)와 엔터(개행문자)를 경계로 입력 값을 인식.
		// 때문에 따로 가공할 필요 X 
		
		// 반면 BufferedReader는 엔터만 경계로 인식, 받은 데이터 String 으로 고정!! (따로 가공해야 함)
		
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
	
	
	//다른 방법
//	Scanner scan = new Scanner(System.in);
//	int A = scan.nextInt();
//	scan.close();
//	
//	int cnt = 0;
//	int copy = A;
//	
//	while(true) {
////		26의 경우 
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
