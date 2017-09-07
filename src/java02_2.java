

public class java02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 用++,--,+=,-=(各用一次)輸出2,5,6,1
		int a = 3;

		// 印出2
		System.out.println("印出2："+ (--a));
		// 印出1
		System.out.println("印出1："+(a -= 1));
		
		//a = 4;
		// 印出5
		System.out.println("印出5："+(a += 4));
		// 印出6
		System.out.println("印出6："+(++a));

	}

}
