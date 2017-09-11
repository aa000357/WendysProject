class A {
  public String name = "A加砞璸瓜";
  public int size = 30;
  public int price = 3000000;
  public int quantity = 20; 
  
  
  public void showBuildingInformation( ) {
    System.out.println("嘿(NAME): " + name);
    System.out.println("￤计(SIZE): " + size);
    System.out.println("基窥(PRICE): " + price);
    System.out.println("计秖(QUANTITY): " + quantity);
    System.out.println();

  }
}

public class java02_11{

	   public static void main(String[ ] args) {
	        A A1 = new A( );
	        A A2 = new A( );
	        
	        //砞﹚A1加
	        A1.name = "A1加";
	        A1.price=3500000;
	        
	      //砞﹚A2加
	        A2.name = "A2加";
	        A2.quantity=30;
	        		
	        //块A1.A2加戈癟

	        A1.showBuildingInformation();
	        A2.showBuildingInformation();

	   
	     
	   }
	}
