package teacher.sample;
public class whilevariable{
    public static void main(String[] args)   {
       double r = 0;
       int count=0;
       while(r < 0.99d) {
            r = Math.random(); // Math 類別中提供產生亂數的類別方法
            System.out.println(r);
            count += 1;
	                 } // end of while
       System.out.print("迴圈共跑了:"+count+"次");
   }
}
