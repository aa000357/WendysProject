class class_a {
		  private int  a1,a2,x;
		  
		  private void a3() {
			  x=a1*a2;
		  }

		  public void setNumber(int a1,int a2) {
			  this.a1=a1;
			  this.a2=a2;
		  }
		  
		  
		  public int getNumber() {
			  a3();
		    return x;
		  }
		}

	public class java02_16{
		  public static void main(String args[]) {
				java.util.Scanner number = new java.util.Scanner(System.in);
				System.out.println("請輸入兩個數字：");
				int a1=number.nextInt();
				int a2=number.nextInt();
				
				class_a multiplication = new class_a();

			  multiplication.setNumber(a1,a2);
		     
		     System.out.println("兩數相乘為： " + multiplication.getNumber());
		  }
		}
