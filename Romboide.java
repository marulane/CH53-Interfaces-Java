
public class Romboide implements FiguraGeometrica {
	private String nombre;
	private double b;
	private double h;
	public Romboide(String nombre, double b, double h) {
		super();
		this.nombre = nombre;
		this.b = b;
		this.h = h;
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
	@Override
	public String toString() {
		return "Romboide [nombre=" + nombre + ", b=" + b + ", h=" + h + "]";
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return getB()*getH();
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (2*getB())+(2*getH());
	}
	
}
