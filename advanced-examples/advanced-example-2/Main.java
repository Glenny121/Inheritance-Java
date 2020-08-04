import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner (System.in);
	static ArrayList<Polygon> polygon = new ArrayList <Polygon>();
	
	public static void main(String[] args) {
	
	//llenarPoligono
		fillPolygon();
	//mostrar datos del area de cada poligono
		showResults();
	}
	public static void fillPolygon() {
		char answer;
		int option;
	do {
			do{
				System.out.println("Type in your desired polygon");
				System.out.println("1. Triangle");
				System.out.println("2. Rectangle");
				System.out.print("option: ");
				option = sc.nextInt();
			}while (option<1 || option>2);
				
			switch (option) {
			case 1: fillTriangle();//llenar un triangulo
					break;
			case 2: fillRectangle();//llenar un rectangulo
					break;
		}
		System.out.println("\nDo you want to introduce another polygon (y/n)?");
			answer = sc.next().charAt(0);
			System.out.println("");
		}while (answer=='y' || answer =='Y');
	}
	
	public static void  fillTriangle() {
		//solicitar lados
		double side1, side2, side3;
		System.out.print("\nenter the side 1 of the triangle: ");
		side1= sc.nextInt();
		System.out.print("\nenter the side 2 of the triangle: ");
		side2= sc.nextInt();
		System.out.print("\nenter the side 2 of the triangle: ");
		side3= sc.nextInt();
		
		Triangle triangle = new Triangle (side1,side2, side3);
		//guardamos un triangulo dentro de nuestro arreglo de poligonos
		polygon.add(triangle);
	}
	
	public static void fillRectangle() {
		double side1, side2;
		System.out.print("\nenter the side 1 of the Rectangle: ");
		side1= sc.nextInt();
		System.out.print("\nenter the side 2 of the Rectangle: ");
		side2= sc.nextInt();
		
		Rectangle rectangle = new Rectangle (side1,  side2);
		//guardamos un rectangulo dentro de nuestro arreglo de poligonos
		polygon.add(rectangle);
	}
	public static void  showResults() {
		//recorriendo el arreglo de poligonos
		for (Polygon poly: polygon ) {
			System.out.println(poly.toString());
			System.out.println(("The area is: " + poly.area()));
			System.out.println("");
		}
	}
}

