class Father_2 {
	private int year, month, day;// �����O�ŧi�~���A�ó]�æ^private�A�l���O����q�ۤv�����O���ϥΦ��ݩ�

	Father_2(int year , int month , int day)//�����O�غc�l�A�]�w�~���
	{
		this.year=year;
		this.month=month;
		this.day=day;
	}

	public void getDate() {// ���o�~����T
		System.out.println(year + "/" + month + "/" + day);

	}

}

class Son_2 extends Father_2 {// �l���O�ŧi

Son_2(int year, int month, int day) {//�]�������غc�l���ѼơA�ҥH�l���O�]���l�b�غc�l����J�ѼƱa�J�~�i���~�Ӷ��Q�i��
		super(year, month, day);
		// TODO Auto-generated constructor stub
	}

}

public class java02_17 {
	public static void main(String[] args) {
		java.util.Scanner inPutDay = new java.util.Scanner(System.in);
		int year, month, day;

		System.out.println("�п�J���˥X�ͦ~���G");
		year = inPutDay.nextInt();
		month = inPutDay.nextInt();
		day = inPutDay.nextInt();

		Father_2 father = new Father_2(year, month, day);

		System.out.println("�п�J��l�X�ͦ~���G");
		year = inPutDay.nextInt();
		month = inPutDay.nextInt();
		day = inPutDay.nextInt();
		Son_2 son = new Son_2(year, month, day);// ���l���O�~���

		System.out.print("���˥ͤ�G");
		father.getDate();
		System.out.print("��l�ͤ�G");
		son.getDate();

	}
}
