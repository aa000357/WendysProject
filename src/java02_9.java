public class java02_9 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		/*
		 * �üƽd���� X~Y���d�� ( X ���üƽd�򪺰_�l�ȡA�� Y ���üƭȽd�򪺲פ��)
		 * 
		 * (int)(Math.random() * (Y-X+1)) + X;
		 */
		int input = 0;
		double ans = (int) (Math.random() * (100 - (-50) + 1)) + (-50);

		do {// �}�l�q�Ʀr

			System.out.print("�п�J�Ʀr�G");
			input = scanner.nextInt();
			if (input > ans)
				System.out.println("�Ӥj�F�A�Э��s��J�Ʀr");
			if (input < ans)
				System.out.println("�Ӥp�F�A�Э��s��J�Ʀr");
		} while (input != ans);

		System.out.println("���߱z�A�q��F!���׬O�G" + (int)ans);

	}
}
