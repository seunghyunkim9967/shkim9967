package msShk1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("손오공","1682");
		Student st2 = new Student("저팔계","1772");
		Student st3 = new Student("사오정","1813");
		
		ArrayList <Student>list = new ArrayList<Student>(); 
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
//		foreach 예시 : arrayList를 끝까지 순회 for 문이 진행 될 때 마다 stu 변수에 참조변수가 바뀌며 끝까지 돌아감
		
		for(Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner scan = new Scanner(System.in);
		
		
		
		var Cnt = 0;
		while (true) {
			System.out.println("계속 검색을 하고싶으시면y, 종료하고싶으면n");
			String input = scan.next();
			
			if (input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = scan.next();
				boolean flag = false;
				
				for (Student stu : list) {
					if (name.equals(stu.getName())) {
						System.out.println(name + "학생의 학번은" + stu.getNo() + "입니다");
						flag = true;
					} 
				}
				if (!flag) {
					System.out.println(name + "학생의 학번은 없습니다.");
				}
			} else if (input.equals("n")) {
				break;
			}
			
		}
		
		System.out.println("종료되었습니다.");
	}

}
