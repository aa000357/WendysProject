public class arrayexample{
	public static void main(String[] args){
		String[] title = {"�s��", "����", "�w�s�q"};
		int[][] bookShop = {{1, 2, 3}, {200, 350, 250}, {5, 3, 10}};

		for(int i=0; i<bookShop.length; i++){
			System.out.print(title[i] + "\t");
			
			for(int j=0; j<bookShop[i].length; j++)
				System.out.print(bookShop[i][j] + "\t");
			System.out.println();
		}
	}
}