
public class MahasiswaReport {
	public String npm;
	public String name;
	public double present;
	public double work;
	public double mid;
	public double fin;
	public MahasiswaReport(String npm, String name, double present, double work, double mid, double fin) {
		this.npm = npm;
		this.name = name;
		this.present = present;
		this.work = work;
		this.mid = mid;
		this.fin = fin;
	} ;	
	public double average() {
		return present / 10 + work / 5 + 3 * mid / 10 + 2 * fin / 5;
	} 
	public void result(double average) {
		System.out.println("Nilai Rata-rata: " + average);
		if (average >= 76) {
			System.out.println("Grade: A");
			System.out.println("Keterangan: ISTIMEWA");
		} else if (average >= 66) {
			System.out.println("Grade: B");
			System.out.println("Keterangan: BAIK");
		} else if (average >= 56) {
			System.out.println("Grade: C");
			System.out.println("Keterangan: CUKUP");
		} else if (average >= 46) {
			System.out.println("Grade: D");
			System.out.println("Keterangan: KURANG");							
		} else {
			System.out.println("Grade: E");
			System.out.println("Keterangan: KURANG SEKALI");				
		}
	}
}
