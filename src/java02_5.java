public class java02_5 {
	public static void main(String args[]) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		double m, kg, bmi;// �ŧi����.�魫.bmi�ܼ�

		System.out.print("�п�J����(cm):");
		m = (scanner.nextDouble()) / 100;
		System.out.print("�п�J�魫(kg):");
		kg = scanner.nextDouble();
		// (BMI) �������G( (�魫Kg) / (����m)2 )
		bmi = kg / (m * m);
		System.out.println("�A��bmi�ȡG"+String.format("%.2f", bmi));//�N�p�ƲĤG��ԥ|�ˤ��J

		//�P�_bmi�d��
		if (bmi < 18.5) {
			System.out.println("�L��");
		} else if (bmi >= 18.5 && bmi < 24) {
			System.out.println("�з��魫");
		} else if (bmi >= 24 && bmi < 27) {
			System.out.println("�L��");
		} else {
			System.out.println("�έD");
		}
		scanner.close();
	}
}
