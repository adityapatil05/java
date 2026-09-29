package drawable;

public class Circle implements Drawable {
double radius=20;
	public void drawShape() {
		System.out.println("In a circle shape");
	}

	@Override
	public double calArea() {
		double area= PI*radius*radius;
		System.out.println(area);
		return area;

	}

}
