package teacher.sample;
class Shirt {
  public int shirtID = 101;
  public char colorCode = 'R';
  public double price = 299.0;
  public String description = "Polo Shirt"; 
  
  public void displayInformation( ) {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt Price: " + price);
    System.out.println("Description: " + description);
  }
}

public class objectExample{

	   public static void main(String[ ] args) {
	        Shirt myShirt = new Shirt( );
	        myShirt.colorCode = 'G';
	        myShirt.displayInformation();



	   
	     
	   }
	}
