package models;

public class Mahasiswa {
	public String name;
	public String npm;
	public String jurusan;
	public Mahasiswa(String name, String npm, String jurusan) {
		this.name = name;
		this.npm = npm;
		this.jurusan = jurusan;
	} ;
	public void perkenalan() {
		System.out.println("Selamat datang " + name);	}
}
