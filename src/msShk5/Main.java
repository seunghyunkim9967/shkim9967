package msShk5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��� ���ڴ� ASCII �ڵ带 ������ ����. 10������ ������ �ִ� �� 
		//�ڹ��� ��� ���ڿ�(String) ���������� ã�ư��µ� �ƽ�Ű �ڵ带 ã�Ⱑ �����.
		//helloworlD��� ���ڿ��� char �迭�� �޾Ƽ� ��� �ϳ��ϳ����� ���ڸ� ������ �� �ְԵ�.
		String input = "helloworlD";
		
		//��Ʈ�� ���� �������� ���ڿ� ��ü�� CharArray�� ��ȯ���ִ� �޼��� ȣ���ؼ� ��ȯ
		//char �迭�� ���ƴٴϸ� �ҹ���,�빮�� ���� �� �ٲ���
		char []arr;
		arr = input.toCharArray();
		System.out.print("��ȯ �� arr = ");
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			//ASCII �ڵ尡 �ҹ��� a���� ũ�ų� ������� z ���� �۰ų� ������� �ҹ���
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				//�ҹ��ڸ� �빮�ڷ� �ٲ��� �ҹ��ڿ� �빮���� ASCII�ڵ� ������ �����غ���.
				arr[i] = (char)(arr[i] + 'A' - 'a' ); // 'a' 'b' ~ 'z' 'A' 'B' 'C' ������������ ������ �ִ�
			} else if(arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char)(arr[i] - ('A' - 'a') );
			}
		}
		System.out.print("��ȯ �� arr = ");
		System.out.println(arr);
	}

}
