package kr.hs.study.beans;

public class Designer implements Employee {
	private String job;
	private int time;
	
	public void Designer(String job, int time) {
		this.job = job;
		this.time = time;
	}

	public void Checkin() {
		System.out.println(job +  " " + time + "�� ���");
	}

	public void Checkout() {
		System.out.println(job +  " " + time + "�� ���");
	}
}