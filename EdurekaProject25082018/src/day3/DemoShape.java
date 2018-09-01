package day3;

public class DemoShape {

	public static void main(String[] args) {
		Shape sqr = new Shape();
		
		Shape rec = new Shape();
		
		Shape cir = new Shape();
		
		
		System.out.println("Area of square : "+sqr.calculateArea(10));
		System.out.println("Area of Circle : "+cir.calculateArea(10.5));
		System.out.println("Area of Rectangle : "+rec.calculateArea(10,5));
		
		}

}
