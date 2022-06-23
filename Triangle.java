package Homework_sem1;
//Gil Levkovitch 312496821

public class Triangle extends GeoObject {
	private int base;
	private int height;

	public Triangle(int base, int height, String color) {
		super(color);
		this.base = base;
		this.height = height;

	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return ((base * height) / 2);
	}

	public void show() {
		super.show();
		System.out.println(base + "," + height + ", area= " + getArea());

	}
}
