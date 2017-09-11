package teacher.sample;

	class MyDate {
		  private int  day;
		  private int month;
		  private int year;

		  public void setDate(int d, int m, int y) {
			  day=d;
			  month=m;
			  year=y;
		  }

		  public String getDate() {
		    return day +"/"+ month +"/"+ year;
		  }
		}

	public class encapsulationexample{
		  public static void main(String args[]) {
		     MyDate d = new MyDate();

		     d.setDate(28,2,2003);
		     
		     System.out.println("Date: " + d.getDate());
		  }
		}
