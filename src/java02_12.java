

public class java02_12 {
	public static void main(String[] args) {
	/*	String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = "Java";
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));*/

		//�Ĥ@�D
		String S1 = "JAVA";
		String S2 = "JAVA";
		System.out.println("S1 == S2�G"+(S1 == S2)+"�FS1 equals S2�G"+ S1.equals(S2));
		
		//�ĤG�D
		S1 = new String("JAVA");
		System.out.println("S1 == S2�G"+(S1 == S2)+"�FS1 equals S2�G"+ S1.equals(S2));

		//�ĤT�D
		S2 = "java";
		System.out.println("S1 == S2�G"+(S1 == S2)+"�FS1 equals S2�G"+ S1.equals(S2));

	}
}
