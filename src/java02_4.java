

import java.util.Date;

public class java02_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*------------------�ɶ��ഫ��--------------------*/
		//��k�@
		int s = 234;// �ŧi�ܼ�s����
		System.out.println("\n234��=" + (s / 60) + "��" + (s % 60) + "��");

		//��k�G
		@SuppressWarnings("deprecation")
		Date date= new Date(0,0,0,0,0,234);
		System.out.print(date.getMinutes()+"min");
		System.out.print(date.getSeconds()+"sec");
		
	}

}
