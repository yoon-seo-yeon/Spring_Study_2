package kr.hs.study.beans;

public class Magazine implements Book {
	private String name;
	private String title;
	private int price;
	
	public Magazine(String name, String title, int price) {
		this.name = name;
		this.title = title;
		this.price = price;
	}

	public void buy() {
		System.out.println(name + "�� ���� " + title + "�� " + price + "���� ���.");
	}

	public void sell() {
		
	}

	public void create() {
		
	}
}