package com.sabala.tuto;

public class Tutorial {
	
	private int price;
	
	/**
	 * 建構子
	 * 沒有回傳值
	 * 必須與類別同名
	 */
	public Tutorial() {
		
	}
	
	public Tutorial(int price) {
		this.price = price;
	}
	
	/**
	 * 方法
	 * 有回傳值
	 * 名稱與類別名相同也可
	 */
	public void Tutorial() {
		
	}
	
	public void flight() {
		switch(price) {
		case 500:
			System.out.println("頭等");
			break;
		case 300:
			System.out.println("商務");
			break;
		case 100:
			System.out.println("經濟");
			break;
		case 0:
			System.out.println("請你跟著跑");
			break;
		}
	}
	
	public void getMeal(int priceAgain) {
		
	}

	/**
	 * 航空公司  機票 = new 航空公司(機票價位);
	 * 機票.登機();
	 * 機票.餐點(); 非必要選項
	 */
	public static void main(String[] args) {
			Tutorial ticket = new Tutorial(500);
			ticket.flight();
			ticket.getMeal(200);
	}
	
}
