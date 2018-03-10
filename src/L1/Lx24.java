package L1;

import java.util.Scanner;

public class Lx24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int sum = (i+2)%7;
		if (sum==0) {
			sum = 7;
		}
		System.out.println(sum);
	}

}
