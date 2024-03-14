package daily_Coding_Problem;

import java.util.Scanner;

public class day1 {
	static Scanner sc = new Scanner(System.in);

	void tongHaiSoBangK(int n, int k) {
		int a[] = new int[n];
		int dem = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n; j++) {
				if (k == (a[i] + a[j])) {
					System.out.println(a[i] + " + " + a[j] + " is " + k);
					dem++;
				}
			}
		}
		if (dem == 0) {
			System.out.println("No two numbers add up to k!");
		}
	}

	public static void main(String[] args) {
		System.out.println("Nhap so luong phan tu: ");
		int n = sc.nextInt();
		System.out.println("Nhap so k: ");
		int k = sc.nextInt();
		new day1().tongHaiSoBangK(n, k);
	}
}
