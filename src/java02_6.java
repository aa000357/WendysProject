import java.util.Arrays;

public class java02_6 {
	public static void main(String args[]) {
		//方法一
		 java.util.Scanner scanner = new java.util.Scanner(System.in);

		
		int n1, n2, n3, max, min;// 宣告三個變數

		System.out.print("請輸入第一個數字:");
		n1 = scanner.nextInt();
		System.out.print("請輸入第二個數字:");
		n2 = scanner.nextInt();
		System.out.print("請輸入第三個數字:");
		n3 = scanner.nextInt();

		//第一層判斷式判斷最大值
		if (n1 > n2 && n1 > n3) {
			max = n1;
			//第二層判斷式判斷最小值
			if (n2 > n3) {
				min = n3;
			} else
				min = n2;
		} else if (n2 > n1 && n2 > n3) {
			max = n2;
			if (n1 > n3) {
				min = n3;
			} else
				min = n1;
		} else {
			max = n3;
			if (n1 > n2) {
				min = n2;
			} else
				min = n1;
		}

		System.out.print("最大值:" + max);
		System.out.print("最小值:" + min);
		
		
		
		/*方法二
		 * java.util.Scanner scanner = new java.util.Scanner(System.in);

		int max = 0,min = 0;
		String[] temp= scanner.nextLine().split(",");
		
		Arrays.sort(temp);
		
		System.out.println("最大值："+temp[2]);
		System.out.println("最小值："+temp[0]);
		scanner.close();
		
		*/
	}
}
