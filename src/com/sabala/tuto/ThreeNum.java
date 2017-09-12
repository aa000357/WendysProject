package com.sabala.tuto;

import java.util.Scanner;

public class ThreeNum {

	public static void main(String args[]) {
		Scanner number = new Scanner(System.in);
		String num = null;
		int total = 0;
		int i = 0;
		
		
		
		while(!("N".equals(num) || "n".equals(num))) {
			System.out.print("請輸入三個數值做加總計算:");
			while(i < 3) {
				num = number.nextLine();
				try {
					if("".equals(num.trim()))
						throw new Exception("未輸入數值，請重新輸入!");
					total += Integer.parseInt(num);				
					i++;
					System.out.println("已輸"+ i +"入個數值，還剩:" + (3-i));
				} catch (NumberFormatException nfe) {
					System.out.println("輸入值不是整數，請重新輸入!");
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			System.out.println("Total: " + total);
			i = 0;
			System.out.print("Continue? Y or N :");
			num = number.nextLine();
		}
	
	}
}
