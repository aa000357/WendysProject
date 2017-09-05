public class java02_10 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("块竧较攫: ");
		int width = scanner.nextInt();
		System.out.print("块: ");
		int length = scanner.nextInt();

		/* ------------------絤策暗àà----------------- */
		for (int i = 0; i < length; i++) {// 北à糴
			for (int j = 0; j <= i; j++) {// 北à
				System.out.print("*");
			}
			System.out.println(); // 传︽
		}

		/*------------------絤策暗蒂-------------------*/
		System.out.println();

		// 暗à
		for (int i = 0; i < length; i++) {// 糷癹伴北糴

			for (int j = 0; j <= i; j++) {// ず糷癹伴北
				System.out.print("*");
			}
			System.out.println(); // 传︽
		}

		// à
		for (int i = 0; i < length; i++) {// 糷癹伴北糴

			for (int j = length - 1; j > i; j--) {// ず糷癹伴北
				System.out.print("*");
			}
			System.out.println(); // 传︽
		}

		/*---------------暗タà---------------*/

		for (int i = 0; i < length; i++) {
			for (int j = length; j > i; j--) {
				System.out.print("");
			}
			for (int x = 0; x <= i; x++) {
				System.out.print("’");
			}
			for (int y = 0; y < i; y++) {
				System.out.print("’");
			}

			System.out.println();
		}

		/*---------------暗竧较攫---------------*/

		for (int z = 1; z < width; z++) {// 北竧较攫

			for (int i = 0; i < length; i++) {
				for (int j = length; j > i; j--) {
					System.out.print("");
				}
				for (int x = 0; x <= i; x++) {
					System.out.print("’");
				}
				for (int y = 0; y < i; y++) {
					System.out.print("’");
				}

				System.out.println();
			}
		}

	}
}
