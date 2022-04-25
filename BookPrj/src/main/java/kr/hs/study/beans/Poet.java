package kr.hs.study.beans;

public class Poet implements Book {
	private String name;
	private String title;
	private int price;
	
	public Poet(String name, String title, int price) {
		this.name = name;
		this.title = title;
		this.price = price;
	}

	public void buy() {
		System.out.println(name + "은 시 " + title + "을 " + price + "원에 산다.");
	}

	public void sell() {
		
	}

	public void create() {
		
	}

}