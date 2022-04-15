package backSh;

import java.util.Scanner;

public class back2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int ovenmin = scan.nextInt();
        
        int time = hour * 60 + minute + ovenmin;
        
        hour = time / 60;
        minute = time % 60;
        
        if (hour >= 24) {
        	hour = hour - 24;
        }
        
        
        System.out.println(hour + " " + minute);

	}

}
