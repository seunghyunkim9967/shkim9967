package msShk2;

public class Main {

	public static void main(String[] args) {
		
		
		int []arr = new int[100];
		
		//An = An -1 + An-2; n>=3
		//a1 = 1, a2 = 1
		arr[1] = 1;
		arr[2] = 1;
		
		for (int i = 3; i < 100; i++) {
			
			arr[i] = arr[i -1] + arr[i -2];
			//System.out.println(arr[i]);
		}
		
		//2¹øÂ°
		int An;
		int a1 = 1;
		int a2 = 1;
		
		for (int i = 3; i <= 10; i++) {
			An = a1 + a2;
			a1 = a2;
			a2 = An;
			System.out.println(An + " ");
		}
	}

}
