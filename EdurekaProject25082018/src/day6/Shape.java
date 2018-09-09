package day6;

public abstract class Shape {
	
	public double calculateVolume(int height, int wid){
		
		double volume;
		
		volume = calculateArea(wid) * height;
		
		return volume;
	}

	public abstract double calculateArea(int side);

}
