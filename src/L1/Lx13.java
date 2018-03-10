package L1;

import java.util.Scanner;

public class Lx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int sum = 0;
		int num = 1;
		for (int j = 1; j <= i; j++) {
			num*=j;
			sum+=num;
		}
		System.out.println(sum);
	}

}
