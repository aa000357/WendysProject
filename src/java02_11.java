class A {
  public String name = "A�j�ӳ]�p��";
  public int size = 30;
  public int price = 3000000;
  public int quantity = 20; 
  
  
  public void showBuildingInformation( ) {
    System.out.println("�W��(NAME): " + name);
    System.out.println("�W��(SIZE): " + size);
    System.out.println("����(PRICE): " + price);
    System.out.println("�ƶq(QUANTITY): " + quantity);
    System.out.println();

  }
}

public class java02_11{

	   public static void main(String[ ] args) {
	        A A1 = new A( );
	        A A2 = new A( );
	        
	        //�]�wA1�j�Ӫ���
	        A1.name = "A1�j��";
	        A1.price=3500000;
	        
	      //�]�wA2�j�Ӫ���
	        A2.name = "A2�j��";
	        A2.quantity=30;
	        		
	        //��XA1.A2�j�Ӹ�T

	        A1.showBuildingInformation();
	        A2.showBuildingInformation();

	   
	     
	   }
	}
