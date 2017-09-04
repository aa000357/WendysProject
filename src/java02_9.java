public class java02_9 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		/*
		 * 亂數範圍攻勢 X~Y的範圍 ( X 為亂數範圍的起始值，而 Y 為亂數值範圍的終止值)
		 * 
		 * (int)(Math.random() * (Y-X+1)) + X;
		 */
		int input = 0;
		double ans = (int) (Math.random() * (100 - (-50) + 1)) + (-50);

		do {// 開始猜數字

			System.out.print("請輸入數字：");
			input = scanner.nextInt();
			if (input > ans)
				System.out.println("太大了，請重新輸入數字");
			if (input < ans)
				System.out.println("太小了，請重新輸入數字");
		} while (input != ans);

		System.out.println("恭喜您，猜對了!答案是：" + (int)ans);

	}
}
