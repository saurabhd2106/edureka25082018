package day3;

public class Shape {
	
	double calculateArea(int side){
		double area;
		
		area = side * side;
		
		return area;
	}
	
	double calculateArea(int len, int wid){
		double area;
		
		area = len * wid;
		
		return area;
	}
	
	double calculateArea(double radius){
		double area;
		
		area = Math.PI * radius * radius;
		
		return area;
	}

}
