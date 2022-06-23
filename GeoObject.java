package Homework_sem1;
//Gil Levkovitch 312496821

public abstract class GeoObject implements Comparable<GeoObject> {
	private String color;

	public GeoObject(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public abstract double getArea();

	public void show() {
		System.out.print(getClass().getSimpleName() + ",");
		System.out.print(color + ",");

	}

	@Override
	public int compareTo(GeoObject o) {

		return (int) (getArea() - o.getArea());
	}

}
