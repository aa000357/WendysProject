public class java02_21 {
	public static void main(String args[]) {
		java.util.Scanner number = new java.util.Scanner(System.in);

		int total = 0;// �����ثe���Ϊ��Ʀr
//		int number_1, number_2, number_3;

		for (int i = 0; i < args.length; i++) {
			try {
				//
				Integer.parseInt(number.next());
				//
				total += Integer.parseInt(args[i]);

			} catch (NumberFormatException ne) {
				System.err.println("��J�ƭȤ��O��ơA�Э��s��J!");
			} catch (Exception e) {
				System.err.println("����J�ƭȡA�Э��s��J!" + e);
			} finally {
				System.out.println("�T�Ƭۥ[=" + total);
			}
		}

	}
}
