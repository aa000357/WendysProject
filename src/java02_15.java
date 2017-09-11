import java.util.Scanner;

class add {

	// 方法一 直接於方法內計算結果印出
	static void printAdd2N(int max) {// 有void代表沒有回傳值
		int total = 0,num_toal=0;
		for (int i = 0; i <= max; i++) {
			total += i;
		}
		
		System.out.println("方法一\n你的輸入值為：" + max + "，結果為：" + total);
		//System.out.println("方法一\n從1加到" + max + "=" + num_toal);

	}

	//方法二 方法內運算，用回傳值輸出結果
	static int getAdd2N(int max) {// 有int 代表回傳int型態的值
		int total = 0;
		for (int i = 0; i <= max; i++) {
			total += i;
		}
		
		return total;
	}

}

public class java02_15 {

	public static void main(String[] args) {
		java.util.Scanner number = new java.util.Scanner(System.in);

		System.out.println("請輸入一個正整數(不超過10)：");
		int max = number.nextInt();

		while(max > 10 || max < 0){
			System.out.println("輸入數字不在範圍內，請重新輸入：");
			max = number.nextInt();
		}
		
			add.printAdd2N(max);//呼叫方法一
			int total_method2 = add.getAdd2N(max);//宣告變數存回傳值
			System.out.println("\n方法二\n你的輸入值為：" + max + "，結果為：" + total_method2);
	
			
			
	}
}
