import java.util.Arrays;

public class java02_6 {
	public static void main(String args[]) {
		//��k�@
		 java.util.Scanner scanner = new java.util.Scanner(System.in);

		
		int n1, n2, n3, max, min;// �ŧi�T���ܼ�

		System.out.print("�п�J�Ĥ@�ӼƦr:");
		n1 = scanner.nextInt();
		System.out.print("�п�J�ĤG�ӼƦr:");
		n2 = scanner.nextInt();
		System.out.print("�п�J�ĤT�ӼƦr:");
		n3 = scanner.nextInt();

		//�Ĥ@�h�P�_���P�_�̤j��
		if (n1 > n2 && n1 > n3) {
			max = n1;
			//�ĤG�h�P�_���P�_�̤p��
			if (n2 > n3) {
				min = n3;
			} else
				min = n2;
		} else if (n2 > n1 && n2 > n3) {
			max = n2;
			if (n1 > n3) {
				min = n3;
			} else
				min = n1;
		} else {
			max = n3;
			if (n1 > n2) {
				min = n2;
			} else
				min = n1;
		}

		System.out.print("�̤j��:" + max);
		System.out.print("�̤p��:" + min);
		
		
		
		/*��k�G
		 * java.util.Scanner scanner = new java.util.Scanner(System.in);

		int max = 0,min = 0;
		String[] temp= scanner.nextLine().split(",");
		
		Arrays.sort(temp);
		
		System.out.println("�̤j�ȡG"+temp[2]);
		System.out.println("�̤p�ȡG"+temp[0]);
		scanner.close();
		
		*/
	}
}
