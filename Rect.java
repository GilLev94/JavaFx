package Homework_sem1;

//Gil Levkovitch 312496821
public class Rect extends GeoObject {
	private int width;
	private int height;

	public Rect(int width, int height, String color) {
		super(color);
		this.width = width;
		this.height = height;

	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (width * height);
	}

	public void show() {
		super.show();
		System.out.println(width + ", " + height + ", area= " + getArea());

	}
}
