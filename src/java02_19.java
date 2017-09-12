public class java02_19 {//抽象類別練習題
	public static void main(String[] args) {
		iA ado = new iA();
		iB bdo = new iB();
		iC cdo = new iC();

		System.out.println("我是A");
		ado.eat();
		ado.drink();
		ado.play();
		
		System.out.println("我是B");
		bdo.eat();
		bdo.drink();
		bdo.play();
		
		System.out.println("我是C");
		cdo.eat();
		cdo.drink();
		cdo.play();
		

	}
}

abstract class weCanDoIt {// 父類別-->此為抽象類別

	public void eat()//大家吃的方法都一樣
	{
		System.out.print("吃麵包、");
	}

	public void drink()//大家喝的方法都一樣
	{
		System.out.print("喝開水、");

	}

	abstract void play();// 玩的方法不一樣，故使用抽象方法表示，由個人自己定義

}

class iA extends weCanDoIt {//繼承抽象類別
	void play(){//類別實作
	System.out.println("玩皮球");
}

}

class iB extends weCanDoIt {//繼承抽象類別
	void play(){//類別實作
		System.out.println("溜小狗");
	}
}

class iC extends weCanDoIt {//繼承抽象類別
	void play(){//類別實作
		System.out.println("溜滑梯");
	}
}
