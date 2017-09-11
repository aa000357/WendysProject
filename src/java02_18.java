class Father {// 宣告父類別
	int year, month, day;// 父類別宣告年月日，並設並回private，子類別不能從自己的類別中使用此屬性

	Father(int year, int month, int day)// 父類別建構子，設定年月日
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void getDate() {// 取得年月日資訊
		System.out.println("父親生日："+year + "/" + month + "/" + day);
	}

}

class Son extends Father {// 子類別宣告

	Son(int year, int month, int day) {		super(year, month, day);	}
	public void getDate() {// 取得年月日資訊
		System.out.println("兒子生日：" + year + "/" + month + "/" + day);
	}

}

public class java02_18 {
	public static void main(String[] args) {
		java.util.Scanner inPutDay = new java.util.Scanner(System.in);
		int year, month, day;

		System.out.println("請輸入父親出生年月日：");
		year = inPutDay.nextInt();
		month = inPutDay.nextInt();
		day = inPutDay.nextInt();

		Father father = new Father(year, month, day);

		System.out.println("請輸入兒子出生年月日：");
		year = inPutDay.nextInt();
		month = inPutDay.nextInt();
		day = inPutDay.nextInt();
		Father son = new Son(year, month, day);// 使用多型帶入數值

		father.getDate();
		son.getDate();

	}
}
