public class java02_8 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		int input = 0;
		int ans = 30;

		do {// 開始執行迴圈
			System.out.print("輸入數字: ");
			input = scanner.nextInt();

			if (input > ans)
				System.out.println("太大了，請重新輸入數字");
			if (input < ans)
				System.out.println("太小了，請重新輸入數字");
		} while (input != ans);

		System.out.println("恭喜您!猜對了!");
	}
}
