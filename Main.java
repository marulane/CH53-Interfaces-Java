
public class Main {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
		//Triangulo t2 = new Triangulo("Triángulo T", 200, 100, 150);
		Cuadrado c1 = new Cuadrado("Dash", 12);
		Rectangulo r1 = new Rectangulo("Recti",20,10);
		Rombo rom1= new Rombo("Rombi", 10, 5, 10);
		Romboide romboide = new Romboide("Romito", 20, 10);
		Trapecio trp1 = new Trapecio("Trapi", 10, 20, 10, 20, 10, 20,15);
		
		
		System.out.println(t1);
		
		Main.imprimirCalculos(t1);
		Main.imprimirCalculos(c1);
		Main.imprimirCalculos(r1);
		Main.imprimirCalculos(rom1);
		Main.imprimirCalculos(romboide);
		Main.imprimirCalculos(trp1);
	}//main
	//crear las clases de todas las figura
	//interface FiguraGeometrica
	//Implementar la interface en todas las clases
	
	public static void imprimirCalculos(FiguraGeometrica f) {
		System.out.println(f);
		System.out.println("+---------------------------+");
		System.out.println("| El área de [" + f.getNombre()+"]");
		System.out.println("| es "+ f.calcularArea());
		System.out.println("| El perímetro de [" + f.getNombre()+"]");
		System.out.println("| es "+ f.calcularPerimetro());
		System.out.println("+---------------------------+");
	}

}
