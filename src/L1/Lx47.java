package L1;

import java.util.Scanner;

public class Lx47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.nextLine();
		for (int i = 1; i <= a; i++) {
			String string = scanner.nextLine();
			String s[] = string.split(" ");
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			if (b<15||b>20||c<50||c>70) {
				System.out.println(s[0]);
			}
		}
		

	}

}
