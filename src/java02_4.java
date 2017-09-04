

import java.util.Date;

public class java02_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*------------------時間轉換器--------------------*/
		//方法一
		int s = 234;// 宣告變數s為秒
		System.out.println("\n234秒=" + (s / 60) + "分" + (s % 60) + "秒");

		//方法二
		@SuppressWarnings("deprecation")
		Date date= new Date(0,0,0,0,0,234);
		System.out.print(date.getMinutes()+"min");
		System.out.print(date.getSeconds()+"sec");
		
	}

}
