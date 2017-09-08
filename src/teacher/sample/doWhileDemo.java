package teacher.sample;
public class doWhileDemo {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
			new java.util.Scanner(System.in);

		int input = 0;
		do{
			System.out.print("輸入數字: ");
			input = scanner.nextInt();
		} while(input!=30);

		System.out.println("恭喜您!猜對了!");
	}
}