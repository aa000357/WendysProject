class Father {// �ŧi�����O
	int year, month, day;// �����O�ŧi�~���A�ó]�æ^private�A�l���O����q�ۤv�����O���ϥΦ��ݩ�

	Father(int year, int month, int day)// �����O�غc�l�A�]�w�~���
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void getDate() {// ���o�~����T
		System.out.println("���˥ͤ�G"+year + "/" + month + "/" + day);
	}

}

class Son extends Father {// �l���O�ŧi

	Son(int year, int month, int day) {		super(year, month, day);	}
	public void getDate() {// ���o�~����T
		System.out.println("��l�ͤ�G" + year + "/" + month + "/" + day);
	}

}

public class java02_18 {
	public static void main(String[] args) {
		java.util.Scanner inPutDay = new java.util.Scanner(System.in);
		int year, month, day;

		System.out.println("�п�J���˥X�ͦ~���G");
		year = inPutDay.nextInt();
		month = inPutDay.nextInt();
		day = inPutDay.nextInt();

		Father father = new Father(year, month, day);

		System.out.println("�п�J��l�X�ͦ~���G");
		year = inPutDay.nextInt();
		month = inPutDay.nextInt();
		day = inPutDay.nextInt();
		Father son = new Son(year, month, day);// �ϥΦh���a�J�ƭ�

		father.getDate();
		son.getDate();

	}
}
