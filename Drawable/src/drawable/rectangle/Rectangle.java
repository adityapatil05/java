package drawable.rectangle;

import drawable.Drawable;

public class Rectangle implements Drawable {
double length=7,breadth=8;
	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("In a Rectangle...");
	}

	@Override
	public double calArea() {
		double area=length*breadth;
		 System.out.println(area);
		return area;
	}

}
