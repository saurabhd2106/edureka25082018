package day6;

public class DemoShape {

	public static void main(String[] args) {

		Cuboid cuboid = new Cuboid();

		double vol = cuboid.calculateVolume(90, 10);

		System.out.println("Cuboid voulme : " + vol);

		System.out.println("------------------------");

		Shape cyl = new Cylinder();

		vol = cyl.calculateVolume(90, 10);
		System.out.println("Cylinder voulme : " + vol);

		System.out.println("------------------------");

	}

}
