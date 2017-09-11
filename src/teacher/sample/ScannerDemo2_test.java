package teacher.sample;
public class ScannerDemo2_test {
	public static void main(String args[]) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String name;//姓名
		int age;//年齡
		//char genter;//性別
		
			System.out.print("姓名:");
			name = scanner.next();
			System.out.print("年齡:");
			age = scanner.nextInt();
			/*System.out.print("性別:");
			genter = scanner.next();*/
		
		/*
		
		System.out.print("輸入整數:");
		int input1 = scanner.nextInt();

		System.out.print("輸入浮點數:");
		double input2 = scanner.nextDouble();

		System.out.print("輸入布林值:");
		boolean input3 = scanner.nextBoolean();

		System.out.print("輸入字串:");
		String input4 = scanner.next();

		System.out.println("整數輸入:" + input1);
		System.out.println("浮點數輸入:" + input2);
		System.out.println("布林值輸入:" + input3);
		System.out.println("字串輸入:" + input4);
		
		scanner.close();
		*/
	}
}
