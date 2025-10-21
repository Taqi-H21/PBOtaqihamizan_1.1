package models;

public class Buku {
	public String title;
	public String writer;
	public String publish;
	public boolean isBooked;
	public Buku(String title, String writer, String publish, boolean isBooked) {
		this.title = title;
		this.writer = writer;
		this.publish = publish;
		this.isBooked = isBooked;
	};
	public void showBook() {
		System.out.println("Judul: " + title);
		System.out.println("Penulis: " + writer);
		System.out.println("Tahun Terbit: " + publish);
		System.out.println(isBooked ? "Buku sudah dipinjam" : "Buku belum dipinjam");
		System.out.println();
	}
	public void borrowBook() {
		if (!this.isBooked) {
			this.isBooked = true;
			System.out.println("Buku berjudul " + " berhasil dipinjamkan");
		} else {
			System.out.println("Maaf, buku berjudul " + title + " sudah dipinjamkan");
		}
	}
	public void returnBook() {
		if (!this.isBooked) {
			this.isBooked = false;
			System.out.println("Buku berjudul " + " berhasil dikembalikan");
		} else {
			System.out.println("maaf, buku berjudul " + title + " tidak sedang dipinjam");
		}
	}
}
