package drawable.main;

import drawable.Circle;
import drawable.Drawable;
import drawable.rectangle.Rectangle;
import drawable.triangle.Triangle;

public class Main {

	public static void main(String[] args) {
	Drawable d=new Circle();
	Drawable r=new Rectangle();
	d.drawShape();
	d.calArea();
	r.drawShape();
	r.calArea();
	Drawable t=new Triangle();
	
	t.drawShape();
	t.calArea();
	
	
	}

}
