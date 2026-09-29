package drawable.triangle;

import drawable.Drawable;

public class Triangle implements Drawable {
double base=10,height=11;
	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
System.out.println("In a Triangle...");
	}

	@Override
	public double calArea() {
		double area=(0.5*(base*height));
		// TODO Auto-generated method stub
		System.out.println(area);
		return area;
	}

}
