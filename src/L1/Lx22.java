package L1;

import java.util.Scanner;

public class Lx22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.nextLine();
		String string = scanner.nextLine();
		String s[] = string.split(" ");
		int ji = 0;
		int ou = 0;
		for (int i = 0; i < a; i++) {
			int c = Integer.parseInt(s[i]);
			if (c%2==0) {
				ou++;
			}
			if (c%2==1) {
				ji++;
			}
		}
		System.out.println(ji+" "+ou);
	}
}
