import java.util.Scanner;

class add {

	// ��k�@ �������k���p�⵲�G�L�X
	static void printAdd2N(int max) {// ��void�N��S���^�ǭ�
		int total = 0,num_toal=0;
		for (int i = 0; i <= max; i++) {
			total += i;
		}
		
		System.out.println("��k�@\n�A����J�Ȭ��G" + max + "�A���G���G" + total);
		//System.out.println("��k�@\n�q1�[��" + max + "=" + num_toal);

	}

	//��k�G ��k���B��A�Φ^�ǭȿ�X���G
	static int getAdd2N(int max) {// ��int �N��^��int���A����
		int total = 0;
		for (int i = 0; i <= max; i++) {
			total += i;
		}
		
		return total;
	}

}

public class java02_15 {

	public static void main(String[] args) {
		java.util.Scanner number = new java.util.Scanner(System.in);

		System.out.println("�п�J�@�ӥ����(���W�L10)�G");
		int max = number.nextInt();

		while(max > 10 || max < 0){
			System.out.println("��J�Ʀr���b�d�򤺡A�Э��s��J�G");
			max = number.nextInt();
		}
		
			add.printAdd2N(max);//�I�s��k�@
			int total_method2 = add.getAdd2N(max);//�ŧi�ܼƦs�^�ǭ�
			System.out.println("\n��k�G\n�A����J�Ȭ��G" + max + "�A���G���G" + total_method2);
	
			
			
	}
}
