public class java02_13 {
	public static void main(String[] args) {
	
		//�Ĥ@�կx�}
		int[][] numbergame_a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("�Ĥ@�ռƦr");
		for (int i = 0; i < numbergame_a.length; i++) {

			for (int j = 0; j < numbergame_a[i].length; j++) {
				System.out.print(numbergame_a[i][j] + "\t");
			}
			System.out.println();

		}
		
		
		System.out.println();
		//�ĤG�կx�}
		int[][] numbergame_b = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };

		System.out.println("�ĤG�ռƦr");
		for (int i = 0; i < numbergame_b.length; i++) {

			for (int j = 0; j < numbergame_b[i].length; j++) {
				System.out.print(numbergame_b[i][j] + "\t");
			}
			System.out.println();

		}
		
		//�ĤT�կx�}  �N�Ĥ@�ջP�ĤG�խȬۥ[
		int[][] numbergame_c = new int[3][3];
 
		System.out.println("\n�e��ռƦr�X��");
		for (int i = 0; i < numbergame_c.length; i++) {

			for (int j = 0; j < numbergame_c[i].length; j++) {
				
				System.out.print((numbergame_c[i][j]=numbergame_a[i][j]+numbergame_b[i][j]) + "\t");
			}
			System.out.println();

		}
		
		
		//--------------------�i���D-----------------------
		
		
		//�üƯx�}�@
		System.out.println();
		System.out.println("-----�ζüƲ���9�Ӥ���0-20���Ʀr-----\n�Ĥ@�նü�");
		for (int i = 0; i < numbergame_a.length; i++) {

			for (int j = 0; j < numbergame_a[i].length; j++) {
				
				System.out.print((numbergame_a[i][j] = (int) (Math.random() * 21)) + "\t");
			}
			System.out.println();

		}
		
		//�üƯx�}�G
		System.out.println();
		System.out.println("�ĤG�նü�");
		for (int i = 0; i < numbergame_b.length; i++) {

			for (int j = 0; j < numbergame_b[i].length; j++) {
				
				System.out.print((numbergame_b[i][j] = (int) (Math.random() * 21)) + "\t");
			}
			System.out.println();

		}
		
		//�N�üƯx�}�@�B�üƯx�}�G�ۥ[
	 
				System.out.println("\n�üƯx�}�ۥ[");
				for (int i = 0; i < numbergame_c.length; i++) {

					for (int j = 0; j < numbergame_c[i].length; j++) {
						
						System.out.print((numbergame_c[i][j]=numbergame_a[i][j]+numbergame_b[i][j]) + "\t");
					}
					System.out.println();

				}
		
		
	}
}