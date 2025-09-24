package satu;
public class cuboid extends Cubic{
	public cuboid(double length, double width, double height) {
		super(length, width, height);
	}
	public double CuboidA(double a, double b, double c) {
		return 2 * (width * length + length * height + height * width);
	}
	public double CuboidV(double a, double b, double c) {
		return length * width * height;
	}
}
