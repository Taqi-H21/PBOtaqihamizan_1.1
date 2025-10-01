import java.util.Scanner;

public class MahasiswaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("\nNama: ");
		String name = input.nextLine();
		System.out.println("\nNPM: ");
		String npm = input.nextLine();
		System.out.println("\nNilai Kehadiran: ");
		double present = input.nextDouble();
		System.out.println("\nNilai Tugas: ");
		double work = input.nextDouble();
		System.out.println("\nNilai UTS: ");
		double mid = input.nextDouble();
		System.out.println("\nNilai UAS: ");
		double fin = input.nextDouble();
		Mahasiswa mhs1 = new Mahasiswa(name, npm, present, work, mid, fin);
		System.out.println("\nNama: " + name);
		System.out.println("NPM: " + npm);
		mhs1.result(present / 10 + work / 5 + 3 * mid / 10 + 2 * fin / 5);
		}
	}
