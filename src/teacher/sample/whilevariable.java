package teacher.sample;
public class whilevariable{
    public static void main(String[] args)   {
       double r = 0;
       int count=0;
       while(r < 0.99d) {
            r = Math.random(); // Math ���O�����Ѳ��Ͷüƪ����O��k
            System.out.println(r);
            count += 1;
	                 } // end of while
       System.out.print("�j��@�]�F:"+count+"��");
   }
}
