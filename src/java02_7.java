import java.util.Arrays;

public class java02_7 {
	public static void main(String args[]) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("�п�J�z���X�ͦ~��(����)�G");
		int M = scanner.nextInt();
		M = M % 12;
		System.out.print("�A���ͨv�O�G");

		switch (M) {
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("��");
			break;
		case 5:
			System.out.println("�s");
			break;
		case 6:
			System.out.println("�D");
			break;
		case 7:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 9:
			System.out.println("�U");
			break;
		case 10:
			System.out.println("��");
			break;
		case 11:
			System.out.println("��");
			break;
		case 12:
			System.out.println("��");
			break;
		}

	}
}
