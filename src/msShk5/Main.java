package msShk5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//모든 문자는 ASCII 코드를 가지고 있음. 10진수로 가지고 있는 수 
		//자바의 경우 문자열(String) 참조변수를 찾아가는데 아스키 코드를 찾기가 힘들다.
		//helloworlD라는 문자열을 char 배열로 받아서 요소 하나하나마다 문자를 접근할 수 있게됨.
		String input = "helloworlD";
		
		//스트링 참조 변수에서 문자열 객체를 CharArray로 반환해주는 메서드 호출해서 변환
		//char 배열을 돌아다니며 소문자,대문자 구분 후 바꿔줌
		char []arr;
		arr = input.toCharArray();
		System.out.print("변환 전 arr = ");
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			//ASCII 코드가 소문자 a보다 크거나 같은경우 z 보다 작거나 같은경우 소문자
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				//소문자를 대문자로 바꿔줌 소문자와 대문자의 ASCII코드 간격을 생각해보자.
				arr[i] = (char)(arr[i] + 'A' - 'a' ); // 'a' 'b' ~ 'z' 'A' 'B' 'C' 같은간격으로 떨어져 있다
			} else if(arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char)(arr[i] - ('A' - 'a') );
			}
		}
		System.out.print("변환 후 arr = ");
		System.out.println(arr);
	}

}
