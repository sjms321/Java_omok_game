package day11_ch01_2d_array;

import java.util.Scanner;

public class O_MOK {
	public static void main(String[] args) {
		int omok[][] = new int[10][10];
		Scanner sc = new Scanner(System.in);
		int a, b;
		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a == -1)
				break;
			for (int i = 0; i < omok.length; ++i) {
				if (omok[a][i] == 0)
					omok[a][i] = 1;
				else
					omok[a][i] = 0;
			}

			for (int i = 0; i < 10; ++i) {
				if (omok[i][b] == 0)
					omok[i][b] = 1;
				else
					omok[i][b] = 0;
			}

			if (omok[a][b] == 0)
				omok[a][b] = 1;
			else
				omok[a][b] = 0;
			
			int b1,b2,b3,b4;
			b1=b;b2=b;b3=b;b4=b;
			for (int i = a; i < 10; ++i) {
				if (omok[i][b1] == 0) {
					omok[i][b1] = 1;
					b1++;
				} else {
					omok[i][b1] = 0;
					b1++;
				}
			}
			
			for (int i = a; i > 0; i--) {
				if (omok[i][b2] == 0) {
					omok[i][b2] = 1;
					b2++;
				} else {
					omok[i][b2] = 0;
					b2++;
				}
			}
			for (int i = a; i >= 0; i--) {
				if (omok[i][b3] == 0) {
					omok[i][b3] = 1;
					b3--;
				} else {
					omok[i][b3] = 0;
					b3--;
				}
			}
			for (int i = a; i > omok.length; ++i) {
				if (omok[i][b4] == 0) {
					omok[i][b4] = 1;
					b4--;
				} else {
					omok[i][b4] = 0;
					b4--;
				}
			}
			for (int i = 0; i < 10; ++i) {
				for (int x = 0; x < 10; ++x) {
					System.out.print(omok[i][x] + " ");
				}
				System.out.println();
			}
		}
	}
}
