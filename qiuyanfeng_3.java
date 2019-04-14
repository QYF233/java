

import java.util.Scanner;

public class qiuyanfeng_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("请依次输入三条边的长度（用空格隔开，单位：cm）： ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		Triangle t = new Triangle();

		System.out.println(t.toString());
		t.getArea();
		t.getPerimeter();

	}

	public String show(Triangle t) {
		return t.toString();
	}

	class GeometricObject {
		public String color = "white";
		public boolean filled;
		public java.util.Date dateCreated;

		/** Construct a default geometric object */
		public GeometricObject() {
			dateCreated = new java.util.Date();
		}

		/**
		 * Construct a geometric object with the specified color and filled value
		 */
		public GeometricObject(String color, boolean filled) {
			dateCreated = new java.util.Date();
			this.color = color;
			this.filled = filled;
		}

		/** Return color */
		public String getColor() {
			return color;
		}

		/** Set a new color */
		public void setColor(String color) {
			this.color = color;
		}

		/**
		 * Return filled. Since filled is boolean, its get method is named isFilled
		 */
		public boolean isFilled() {
			return filled;
		}

		/** Set a new filled */
		public void setFilled(boolean filled) {
			this.filled = filled;
		}

		/** Get dateCreated */
		public java.util.Date getDateCreated() {
			return dateCreated;
		}

		/** Return a string representation of this object */
		public String toString() {
			return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
		}
	}

	class Triangle extends GeometricObject {

		public double side1;
		public double side2;
		public double side3;

		public double getSide1() {
			return side1;
		}

		public double getSide2() {
			return side2;
		}

		public double getSide3() {
			return side3;
		}

		public Triangle() {
			side1 = 1;
			side2 = 1;
			side2 = 1;
		}

		public Triangle(double side1, double side2, double side3, String color, boolean filled) {
			super(color, filled);
			setColor(color);
			setFilled(filled);
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}

		public void getArea() {

			double p = (side1 + side2 + side3) / 2;

			double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));

			System.out.println("三角形的面积为:" + area);

		}

		public void getPerimeter() {

			System.out.println("三角形的周长为:" + (side1 + side2 + side3));

		}

		public String toString() {

			return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 + super.toString();

		}

	}
}
