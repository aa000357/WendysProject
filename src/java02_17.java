class Father_2 {
	private int year, month, day;// 父類別宣告年月日，並設並回private，子類別不能從自己的類別中使用此屬性

	Father_2(int year , int month , int day)//父類別建構子，設定年月日
	{
		this.year=year;
		this.month=month;
		this.day=day;
	}

	public void getDate() {// 取得年月日資訊
		System.out.println(year + "/" + month + "/" + day);

	}

}

class Son_2 extends Father_2 {// 子類別宣告

Son_2(int year, int month, int day) {//因為父的建構子有參數，所以子類別也須子在建構子內放入參數帶入才可讓繼承順利進行
		super(year, month, day);
		// TODO Auto-generated constructor stub
	}

}

public class java02_17 {
	public static void main(String[] args) {
		java.util.Scanner inPutDay = new java.util.Scanner(System.in);
		int year, month, day;

		System.out.println("請輸入父親出生年月日：");
		year = inPutDay.nextInt();
		month = inPutDay.nextInt();
		day = inPutDay.nextInt();

		Father_2 father = new Father_2(year, month, day);

		System.out.println("請輸入兒子出生年月日：");
		year = inPutDay.nextInt();
		month = inPutDay.nextInt();
		day = inPutDay.nextInt();
		Son_2 son = new Son_2(year, month, day);// 給子類別年月日

		System.out.print("父親生日：");
		father.getDate();
		System.out.print("兒子生日：");
		son.getDate();

	}
}
