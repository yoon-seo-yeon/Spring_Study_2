package kr.hs.study.beans;

public class Novel implements Book {
	private String name;
	private String title;
	private int price;
	
	public Novel(String name, String title, int price) {
		this.name = name;
		this.title = title;
		this.price = price;
	}

	public void buy() {
		System.out.println(name + "은 소설 " + title + "을 " + price + "원에 산다.");
	}

	public void sell() {
		
	}

	public void create() {
		
	}

}