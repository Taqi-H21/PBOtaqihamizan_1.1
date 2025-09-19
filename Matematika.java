package satu;//dan dua

class Matematika implements Operasi {
	@Override
	public int tambah(int a, int b) {
		return a + b;
	}
	@Override
	public int kurang(int a, int b) {
		return a - b;
	}
	@Override
	public int kali(int a, int b) {
		return a * b;
	}
	@Override
	public int bagi(int a, int b) {
		return a / b;
	}

}