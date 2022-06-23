package Homework_sem1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final String[] forbiddenColors = { "green", "purple", "brown", "black" };

	public static void checkColors(String color) throws ColorExc {
		for (int i = 0; i < forbiddenColors.length; i++) {
			if (forbiddenColors[i].equalsIgnoreCase(color)) {
				throw new ColorExc();
			}

		}
	}

	public static void main(String[] args) throws RadiusException {
		GeoObject[] shapes = new GeoObject[6];
		Scanner scn = new Scanner(System.in);
		boolean goodColor;
		boolean goodRadius;
		Circle cr1 = null;

		do {
			goodColor = true;
			goodRadius = true;
			System.out.println("Please enter color and then radius for the first circle");
			String color = scn.nextLine();
			int radius = scn.nextInt();

			try {
				checkColors(color);
				cr1 = new Circle(radius, color);

			} catch (ColorExc ex) {
				System.out.println(ex.getMessage());
				goodColor = false;

			} catch (RadiusException e) {
				// TODO Auto-generated catch block
				goodRadius = false;
				System.out.println(e.getMessage());
			}
			scn.nextLine();
		} while (!goodColor || !goodRadius);
		shapes[0] = cr1;
		shapes[1] = new Triangle(10, 20, "red");
		shapes[2] = new Rect(3, 5, "blue");
		shapes[3] = new Circle(100, "yellow");
		shapes[4] = new Triangle(1, 2, "red");
		shapes[5] = new Rect(6, 2, "white");
		System.out.println("Original array and areas:");
		System.out.println("=========================");

		for (int i = 0; i < shapes.length; i++) {
			shapes[i].show();

		}
		Arrays.sort(shapes);
		System.out.println();
		System.out.println("after sorting:");
		System.out.println("==============");
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].show();

		}

		scn.close();

	}

}
