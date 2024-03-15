package daily_Coding_Problem;

import java.util.Scanner;

public class day2 {
	Scanner sc = new Scanner(System.in);
	int a[], b[];

	public void taoMangMoiTichCacPhanTu() {
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		a = new int[n];
		b = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap a[" + i + "]: ");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int j = n - 1;
			b[i] = 1;
			while (j > -1) {
				if (j != i) {
					b[i] *= a[j];
				}
				j--;
			}
		}
		System.out.println(b);
	}

	public static void main(String[] args) {
		new day2().taoMangMoiTichCacPhanTu();
	}
}
