public class java02_20 {
	public static void main(String[] args) {
		java.util.Scanner inPutDay = new java.util.Scanner(System.in);
		weCanDo show=new weCanDo();
		show.aCanDoIt();
		show.bCanDoIt();
		show.cCanDoIt();
		

	}
}

interface ado{//aDo�ŧi����
	String eat="A�Y�ѥ]�B";
	String drink="�ܶ}���B";
	String play="���ֲy";
	void aCanDoIt();
}

interface bdo{//bDo�ŧi����
	String eat="B�Y���{�B";
	String drink="�ܨT���B";
	String play="�Ȥp��";
	void bCanDoIt();
}

interface cdo{//bDo�ŧi����
	String eat="C�Y�ѽu�B";
	String drink="�ܪG�ġB";
	String play="�ȷƱ�";
	void cCanDoIt();
}

class weCanDo  implements ado,bdo,cdo{// ���O
	public void aCanDoIt() {
		System.out.println(ado.eat + ado.drink + ado.play);
	}
	
	public void bCanDoIt() {
		System.out.println(bdo.eat + bdo.drink + bdo.play);

	}
	
	public void cCanDoIt() {
		System.out.println(cdo.eat + cdo.drink + cdo.play);
	}
}




