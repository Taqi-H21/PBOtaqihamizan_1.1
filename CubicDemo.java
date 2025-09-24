package satu;
public class CubicDemo {

	public static void main(String[] args) {
		Cube kubus = new Cube(20);
		cuboid balok = new cuboid(6, 8, 10);
		System.out.println("luas Permukaan Kubus = " + kubus.CubeA(20));
		System.out.println("Volume Kubus = " + kubus.CubeV(20));
		System.out.println("luas Permukaan Balok = " + balok.CuboidA(6, 8, 10));
		System.out.println("Volume Balok = " + balok.CuboidV(6, 8, 10));				
	}
}
