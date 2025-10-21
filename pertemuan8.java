import java.util.Scanner;
import models.Buku;
//import models.Anggota;
public class pertemuan8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Anggota[] person = new Anggota[5];
		Buku[] koleksi = new Buku[5];
		koleksi[0] = new Buku("25","Ahmad","2008",false);
		koleksi[1] = new Buku("Seramnya Cinta","Bunga Lestari","2010",false);
		koleksi[2] = new Buku("Matematika dan Alam","M. Shafii","2014",false);
		koleksi[3] = new Buku("Sunyi","Ardian","2011",false);
		koleksi[4] = new Buku("When Music is Everything","Eka","2007",false);
		int pilihan;
	do {
        System.out.println("\n===== SISTEM PERPUSTAKAAN =====");
        System.out.println("1. Lihat semua Buku");
        System.out.println("2. Cari Buku berdasarkan judul");
        System.out.println("3. Pinjam Buku");
        System.out.println("4. Kembalikan Buku");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Daftar Buku ---\n");
                    for (Buku b : koleksi) {
                    	b.showBook();
                    }
                    System.out.println("\nTekan enter untuk melanjutkan");
                    break;
                case 2:
                    System.out.print("\nMasukkan judul Buku yang dicari: ");
                    String cari = input.nextLine();
                    boolean ditemukan = false;
                    if (!ditemukan) {
                        for (Buku b : koleksi) {
                        	if(b.title.equalsIgnoreCase(cari)) {
                            	System.out.println();
                        		b.showBook();
                        		ditemukan = true;
                            	break;
                        	} 
                        }
                    }
                    if(!ditemukan) {
                    	System.out.println("\nBuku tidak ditemukan");
                    }
		    	break;
                case 3:
                    System.out.print("\nMasukkan nama anggota: ");
                    String borrowName = input.nextLine();
                    System.out.print("Masukkan judul Buku yang ingin dipinjam: ");
                    String pinjam = input.nextLine();
                    boolean ada = false;
                        for (Buku b : koleksi) {
                        	if(b.title.equalsIgnoreCase(pinjam)) {
                            	System.out.println("Atas nama " + borrowName + ", ");
                        		b.borrowBook();
                        		ada = true;
                            	break;
                        	} 
                        }   
                    if(!ada) {
                    	System.out.println("\nBuku tidak ditemukan");
                    }
                    break;
                case 4:
                    System.out.print("\nMasukkan nama anggota: ");
                    String returnName = input.nextLine();
                    System.out.print("Masukkan judul Buku yang dikembalikan: ");
                    String kembali = input.nextLine();
                    boolean ditemukanKembali = false;
                        for (Buku b : koleksi) {
                        	if(b.title.equalsIgnoreCase(kembali)) {
                            	System.out.println("Atas nama " + returnName + ", ");
                        		b.returnBook();
                        		ditemukanKembali = true;
                            	break;
                        	} 
                        }
                    if(!ditemukanKembali) {
                    	System.out.println("\nBuku tidak ditemukan");
                    }
                    break;
                case 0:
                    System.out.println("\nKeluar dari sistem...");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid!");
            }
        } while (pilihan != 0);
		input.close();
	}
}
