package satu;
public class Cube extends Cubic{
	public Cube(double length) {
		super(length, length, length);
	}
	public double CubeA(double a) {
		return 6 * (length * length);
	}
	public double CubeV(double a) {
		return length * length * length;
	}
}
