package models;

public class Anggota {
	public String member;
	public Anggota (String member) {
		this.member = member;
	}
	public void memberName() {
		System.out.print("Atas nama " + member);
	}
}
