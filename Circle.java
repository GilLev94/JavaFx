package Homework_sem1;
//Gil Levkovitch 312496821

public class Circle extends GeoObject implements CheckRadius {
	private int radius;

	public Circle(int radius, String color) throws RadiusException {
		super(color);
		checkRadius(radius);
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return ((Math.PI * (Math.pow(radius, 2))));
	}

	public void show() {
		super.show();
		System.out.println(radius + ", area= " + getArea());
	}

	@Override
	public void checkRadius(int radius) throws RadiusException {
		if ((radius > 500) || (radius < 0))
			throw new RadiusException();
		this.radius = radius;

	}

}
