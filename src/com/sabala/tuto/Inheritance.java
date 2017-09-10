package com.sabala.tuto;

/**
 * 繼承範例
 * @author Jimmy
 *
 */
public class Inheritance {

	public static void main(String[] args) {
		
		// 當兒子繼承爸爸，爸爸又繼承老不死，在初始順序就是 老不死 >爸爸 >兒子
		Son son = new Son();
	}
}


class Son extends Father{
	
	// 當爸爸的建構子如果沒有空參數，則兒子必須要在其中一個建構子呼叫super，其參數為爸爸輸入的參數。exp:super(String smallThree);
	public Son() {
		System.out.println("Im Son!");
	}
	
	// 複寫爸爸的方法，名稱 參數回傳都必須相同，存取權限必須大於爸爸給予的存取權限。例如爸爸的方法是 protected ，則兒子的必須是protected or public
	@Override
	public void iWantMommy(String name) {
		super.iWantMommy(name);
	}
}

class Father extends GrandPa{
	public Father() {
		System.out.println("Im Father!");
	}
	
	public Father(String smallThree) {
		
	}
	
	// 我被複寫啦!!
	protected void iWantMommy(String name) {
		
	}
}

class GrandPa {
	public GrandPa () {
		System.out.println("Im GrandPa!");
	}
}