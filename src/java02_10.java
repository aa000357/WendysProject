public class java02_10 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("��J�t�Ͼ𪺪���: ");
		int width = scanner.nextInt();
		System.out.print("��J��: ");
		int length = scanner.nextInt();

		/* ------------------�m�ߤ@�G���X�����T����----------------- */
		for (int i = 0; i < length; i++) {// ����T���μe
			for (int j = 0; j <= i; j++) {// ����T���Ϊ�
				System.out.print("*");
			}
			System.out.println(); // ����
		}

		/*------------------�m�ߤG�G���X�b�ӵ٧�-------------------*/
		System.out.println();

		// �����W�b���T����
		for (int i = 0; i < length; i++) {// �~�h�j�鱱��e

			for (int j = 0; j <= i; j++) {// ���h�j�鱱���
				System.out.print("*");
			}
			System.out.println(); // ����
		}

		// �[�J�U�b�T����
		for (int i = 0; i < length; i++) {// �~�h�j�鱱��e

			for (int j = length - 1; j > i; j--) {// ���h�j�鱱���
				System.out.print("*");
			}
			System.out.println(); // ����
		}

		/*---------------�����T����---------------*/

		for (int i = 0; i < length; i++) {
			for (int j = length; j > i; j--) {
				System.out.print("�@");
			}
			for (int x = 0; x <= i; x++) {
				System.out.print("��");
			}
			for (int y = 0; y < i; y++) {
				System.out.print("��");
			}

			System.out.println();
		}

		/*---------------���t�Ͼ�---------------*/

		for (int z = 1; z < width; z++) {// ����t�Ͼ����

			for (int i = 0; i < length; i++) {
				for (int j = length; j > i; j--) {
					System.out.print("�@");
				}
				for (int x = 0; x <= i; x++) {
					System.out.print("��");
				}
				for (int y = 0; y < i; y++) {
					System.out.print("��");
				}

				System.out.println();
			}
		}

	}
}
