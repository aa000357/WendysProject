public class java02_5 {
	public static void main(String args[]) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		double m, kg, bmi;// 宣告身高.體重.bmi變數

		System.out.print("請輸入身高(cm):");
		m = (scanner.nextDouble()) / 100;
		System.out.print("請輸入體重(kg):");
		kg = scanner.nextDouble();
		// (BMI) 公式為：( (體重Kg) / (身高m)2 )
		bmi = kg / (m * m);
		System.out.println("你的bmi值："+String.format("%.2f", bmi));//將小數第二位候四捨五入

		//判斷bmi範圍
		if (bmi < 18.5) {
			System.out.println("過輕");
		} else if (bmi >= 18.5 && bmi < 24) {
			System.out.println("標準體重");
		} else if (bmi >= 24 && bmi < 27) {
			System.out.println("過重");
		} else {
			System.out.println("肥胖");
		}
		scanner.close();
	}
}
