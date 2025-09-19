package satu;

public class MatematikaInheritance{

	public static void main(String[] args) {
		Matematika kalkulator = new Matematika();
		int hasiltambah = kalkulator.tambah(20, 10);
		System.out.println("Pertambahan: 20 + 10 = " + hasiltambah);
		int hasilkurang = kalkulator.kurang(10, 5);
		System.out.println("Pengurangan: 10 - 5 = " + hasilkurang);
		int hasilkali = kalkulator.kali(10, 3);
		System.out.println("perkalian: 10*3 = " + hasilkali);
		int hasilbagi = kalkulator.bagi(20, 2);
		System.out.println("Pembagian: 20/2 = " + hasilbagi);
		Matematika2 kalkulator2 = new Matematika2();
		int hasilmodulus = kalkulator2.modulus(20, 3);
		System.out.println("Modulus: 20%3 = " + hasilmodulus);				
	}

}
