public class java02_8 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		int input = 0;
		int ans = 30;

		do {// �}�l����j��
			System.out.print("��J�Ʀr: ");
			input = scanner.nextInt();

			if (input > ans)
				System.out.println("�Ӥj�F�A�Э��s��J�Ʀr");
			if (input < ans)
				System.out.println("�Ӥp�F�A�Э��s��J�Ʀr");
		} while (input != ans);

		System.out.println("���߱z!�q��F!");
	}
}
