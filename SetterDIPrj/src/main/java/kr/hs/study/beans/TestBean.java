package kr.hs.study.beans;

public class TestBean {
	private int a;
	private double b;
	private String c;
	private DataBean d;
	private DataBean e;
	
	//생성자 만들기
	public TestBean(int a, double b, String c, DataBean d, DataBean e) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}
	
	//a,b,c 출력 메서드
	public void prData() {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
	}
}
