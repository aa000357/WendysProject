package com.sabala.tuto;

import java.util.ArrayList;
import java.util.List;

public class Basic {
	
	public static void main(String[] args) {
//		int[] test = new int[1];
//		test[0] = 1;
		List<Student> list = new ArrayList();
		Student std1 = new Student(1,"楊亞蘭1", "female", "Taipei", "09123456");
		Student std2 = new Student(2,"楊亞蘭2", "female", "Taipei", "09123456");
		Student std3 = new Student(3,"楊亞蘭3", "female", "Taipei", "09123456");
		Student std4 = new Student(4,"楊亞蘭4", "female", "Taipei", "09123456");
		Student std5 = new Student(5,"楊亞蘭5", "female", "Taipei", "09123456");
		list.add(std1);
		list.add(std2);
		list.add(std3);
		list.add(std4);
		list.add(std5);
		std4.setSexaul("male"); // 傳址
		for(Student obj : list) {
			System.out.println("No." + obj.getNo());
			System.out.println("Name: " + obj.getName());
			System.out.println("Sexaul: " + obj.getSexaul());
			System.out.println("Addr: " + obj.getAddr());
			System.out.println("Tel: " + obj.getTel());
			System.out.println("====================================================");
		}
	}
	
}

class Student {
	private int no;
	private String name;
	private String sexaul;
	private String addr;
	private String tel;
	
	public Student(int no, String name, String sexaul, String addr, String tel) {
		this.no = no;
		this.name = name;
		this.sexaul = sexaul;
		this.addr = addr;
		this.tel = tel;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSexaul() {
		return sexaul;
	}
	public void setSexaul(String sexaul) {
		this.sexaul = sexaul;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}