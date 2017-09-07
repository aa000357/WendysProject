public class java02_13 {
	public static void main(String[] args) {
	
		//第一組矩陣
		int[][] numbergame_a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("第一組數字");
		for (int i = 0; i < numbergame_a.length; i++) {

			for (int j = 0; j < numbergame_a[i].length; j++) {
				System.out.print(numbergame_a[i][j] + "\t");
			}
			System.out.println();

		}
		
		
		System.out.println();
		//第二組矩陣
		int[][] numbergame_b = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };

		System.out.println("第二組數字");
		for (int i = 0; i < numbergame_b.length; i++) {

			for (int j = 0; j < numbergame_b[i].length; j++) {
				System.out.print(numbergame_b[i][j] + "\t");
			}
			System.out.println();

		}
		
		//第三組矩陣  將第一組與第二組值相加
		int[][] numbergame_c = new int[3][3];
 
		System.out.println("\n前兩組數字合體");
		for (int i = 0; i < numbergame_c.length; i++) {

			for (int j = 0; j < numbergame_c[i].length; j++) {
				
				System.out.print((numbergame_c[i][j]=numbergame_a[i][j]+numbergame_b[i][j]) + "\t");
			}
			System.out.println();

		}
		
		
		//--------------------進階題-----------------------
		
		
		//亂數矩陣一
		System.out.println();
		System.out.println("-----用亂數產生9個介於0-20的數字-----\n第一組亂數");
		for (int i = 0; i < numbergame_a.length; i++) {

			for (int j = 0; j < numbergame_a[i].length; j++) {
				
				System.out.print((numbergame_a[i][j] = (int) (Math.random() * 21)) + "\t");
			}
			System.out.println();

		}
		
		//亂數矩陣二
		System.out.println();
		System.out.println("第二組亂數");
		for (int i = 0; i < numbergame_b.length; i++) {

			for (int j = 0; j < numbergame_b[i].length; j++) {
				
				System.out.print((numbergame_b[i][j] = (int) (Math.random() * 21)) + "\t");
			}
			System.out.println();

		}
		
		//將亂數矩陣一、亂數矩陣二相加
	 
				System.out.println("\n亂數矩陣相加");
				for (int i = 0; i < numbergame_c.length; i++) {

					for (int j = 0; j < numbergame_c[i].length; j++) {
						
						System.out.print((numbergame_c[i][j]=numbergame_a[i][j]+numbergame_b[i][j]) + "\t");
					}
					System.out.println();

				}
		
		
	}
}