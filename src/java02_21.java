public class java02_21 {
	public static void main(String args[]) {
		java.util.Scanner number = new java.util.Scanner(System.in);

		int total = 0;// 紀錄目前有用的數字
//		int number_1, number_2, number_3;

		for (int i = 0; i < args.length; i++) {
			try {
				//
				Integer.parseInt(number.next());
				//
				total += Integer.parseInt(args[i]);

			} catch (NumberFormatException ne) {
				System.err.println("輸入數值不是整數，請重新輸入!");
			} catch (Exception e) {
				System.err.println("為輸入數值，請重新輸入!" + e);
			} finally {
				System.out.println("三數相加=" + total);
			}
		}

	}
}
