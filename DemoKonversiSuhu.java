package dua;

public class DemoKonversiSuhu {

	public static void main(String[] args) {
		KonversiSuhu Converse1 = new KonversiSuhu();
		float CkeF = Converse1.CtoF(27);
		System.out.println("30°C = " + CkeF + "°F");
		float CkeRe = Converse1.CtoRe(21);
		System.out.println("25°C = " + CkeRe + "°Re");
		Konversisuhu2 Converse2 = new Konversisuhu2();
		float FkeRe = Converse2.FtoRe(83);
		System.out.println("71°F = " + FkeRe + "°Re");
	}
}
