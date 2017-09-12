import com.sun.corba.se.spi.extension.ZeroPortPolicy;

public class java02_21 {
	public static void main(String args[]) {
		java.util.Scanner number = new java.util.Scanner(System.in);

		int total = 0;
		String number_in;
		int number_count;

		for (int i = 0; i < 3;) {
			try {
				
				number_in = number.nextLine();
				
				if(number_in == "")
					throw new IllegalArgumentException("未輸入數值，請重新輸入!");
				else
					number_count = Integer.parseInt(number_in);
				
				total += number_count;
				i++;

			} catch (IllegalArgumentException ne) {
				System.err.println(ne.getMessage());
				i--;
			} catch (NumberFormatException e) {
				System.err.println("輸入值不是整數，請重新輸入!");				i--;
			}
			
			finally {
			}
			
		}

		System.out.println("三數相加" + total);
	}
}
