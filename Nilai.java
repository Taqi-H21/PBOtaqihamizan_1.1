public class Nilai {
    String nim;
    String nama;
    int absen;
    int tugas;
    
    public Nilai(String nim, String nama, int absen, int tugas) {
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.tugas = tugas;
    }
    public void DataNilai() {
        System.out.println("Nilai absen[10%]: " + this.absen);
        System.out.println("Nilai Tugas [20%]: " + this.tugas);
    }
    public void CetakNilai() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
    }
}