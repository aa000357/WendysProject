public class java02_1 {
	public static void main(String[] args) {

		int r;// 宣告半徑為r
		final float PI = 3.1415f;// 宣告常數變數PI圓周率

		// show出半徑=10的資訊
		r = 10;
		System.out.print("半徑:");
		System.out.println(r);
		System.out.print("圓周長:");
		System.out.println(2 * r * PI);
		System.out.print("面積:");
		System.out.println(r * r * PI);

		// show出半徑=20的資訊
		r = 20;
		System.out.print("\n半徑:");
		System.out.println(r);
		System.out.print("圓周長:");
		System.out.println(2 * r * PI);
		System.out.print("面積:");
		System.out.println(r * r * PI);

		// show出半徑=50的資訊
		r = 50;
		System.out.print("\n半徑:");
		System.out.println(r);
		System.out.print("圓周長:");
		System.out.println(2 * r * PI);
		System.out.print("面積:");
		System.out.println(r * r * PI);
	}
}
