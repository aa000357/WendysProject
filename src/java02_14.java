class   countNumber {
	public static void countNum(double a, double b) {// �p�G��J��Ƭ��B�I�� ��Ƭۥ[
		System.out.println("a+b=" + (a + b));
	}

	public static void count(int a, int b) {// �p�G��J��Ƭ���� ��Ƭۭ�
		System.out.println("a*b=" + (int)(a * b));
	}

}

public class java02_14 {

	public static void main(String[] args) {
		java.util.Scanner number = new java.util.Scanner(System.in);
		double a, b;

		System.out.println("�п�J��ӼƦr�G");
		a = number.nextDouble();
		b = number.nextDouble();

		if ((a /(int)a) ==1 && (b / (int) b)==1) {
			a = (int)a;
			b = (int)b;
			countNumber.count((int) a, (int) b);
		} else {
			countNumber.countNum(a, b);
		}
	}
}
