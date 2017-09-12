public class java02_20 {
	public static void main(String[] args) {
		java.util.Scanner inPutDay = new java.util.Scanner(System.in);
		weCanDo show=new weCanDo();
		show.aCanDoIt();
		show.bCanDoIt();
		show.cCanDoIt();
		

	}
}

interface ado{//aDo宣告介面
	String eat="A吃麵包、";
	String drink="喝開水、";
	String play="玩皮球";
	void aCanDoIt();
}

interface bdo{//bDo宣告介面
	String eat="B吃飯糰、";
	String drink="喝汽水、";
	String play="溜小狗";
	void bCanDoIt();
}

interface cdo{//bDo宣告介面
	String eat="C吃麵線、";
	String drink="喝果汁、";
	String play="溜滑梯";
	void cCanDoIt();
}

class weCanDo  implements ado,bdo,cdo{// 類別
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




