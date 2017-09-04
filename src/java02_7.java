import java.util.Arrays;

public class java02_7 {
	public static void main(String args[]) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("請輸入您的出生年份(民國)：");
		int M = scanner.nextInt();
		M = M % 12;
		System.out.print("你的生肖是：");

		switch (M) {
		case 1:
			System.out.println("鼠");
			break;
		case 2:
			System.out.println("牛");
			break;
		case 3:
			System.out.println("虎");
			break;
		case 4:
			System.out.println("兔");
			break;
		case 5:
			System.out.println("龍");
			break;
		case 6:
			System.out.println("蛇");
			break;
		case 7:
			System.out.println("馬");
			break;
		case 8:
			System.out.println("羊");
			break;
		case 9:
			System.out.println("猴");
			break;
		case 10:
			System.out.println("雞");
			break;
		case 11:
			System.out.println("狗");
			break;
		case 12:
			System.out.println("豬");
			break;
		}

	}
}
