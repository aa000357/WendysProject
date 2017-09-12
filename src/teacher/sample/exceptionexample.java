package teacher.sample;
public class exceptionexample {
	public static void main(String argv[]) {
		try {
			int i = Integer.parseInt(argv[0]);
			int ans = 10 / i;
	
		} catch (ArithmeticException ae) {
			System.err.println("You must input a nonzero number!");
		} catch (NumberFormatException ne) {
			System.err.println("You must input a integer number!");
		} catch (RuntimeException re) {
			System.err.println("RuntimeException: " + re);
		} catch (Exception e) {
			System.err.println("Exception: " + e);
		}
		
	}
}
