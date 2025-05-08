
public class Triangulo implements FiguraGeometrica{
	private String nombre;
	private double b;
	private double h;
	
	//triangulo isoseles con todos los lados iguales
	private double lado;
	
	public Triangulo(String nombre, double b, double h, double lado) {
		super();
		this.nombre = nombre;
		this.b = b;
		this.h = h;
		this.lado = lado;
	}
	
	public double calcularArea() {
		return (getB()*getH())/2;
	}
	
	public double calcularPerimetro() {
		return (getLado()*3);
	}
	
	

	@Override
	public String toString() {
		return "Triangulo [nombre=" + nombre + ", b=" + b + ", h=" + h + ", lado=" + lado + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}


	
}
