package msShk1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("�տ���","1682");
		Student st2 = new Student("���Ȱ�","1772");
		Student st3 = new Student("�����","1813");
		
		ArrayList <Student>list = new ArrayList<Student>(); 
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
//		foreach ���� : arrayList�� ������ ��ȸ for ���� ���� �� �� ���� stu ������ ���������� �ٲ�� ������ ���ư�
		
		for(Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner scan = new Scanner(System.in);
		
		
		
		var Cnt = 0;
		while (true) {
			System.out.println("��� �˻��� �ϰ�����ø�y, �����ϰ������n");
			String input = scan.next();
			
			if (input.equals("y")) {
				System.out.println("�˻��� �����մϴ�.");
				String name = scan.next();
				boolean flag = false;
				
				for (Student stu : list) {
					if (name.equals(stu.getName())) {
						System.out.println(name + "�л��� �й���" + stu.getNo() + "�Դϴ�");
						flag = true;
					} 
				}
				if (!flag) {
					System.out.println(name + "�л��� �й��� �����ϴ�.");
				}
			} else if (input.equals("n")) {
				break;
			}
			
		}
		
		System.out.println("����Ǿ����ϴ�.");
	}

}
