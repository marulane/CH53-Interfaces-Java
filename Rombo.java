
public class Rombo implements FiguraGeometrica{
	private String nombre;
	private double lado;
	private double diagMen;
	private double diagMay;
	public Rombo(String nombre, double lado, double diagMen, double diagMay) {
		super();
		this.nombre = nombre;
		this.lado = lado;
		this.diagMen = diagMen;
		this.diagMay = diagMay;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getDiagMen() {
		return diagMen;
	}
	public void setDiagMen(double diagMen) {
		this.diagMen = diagMen;
	}
	public double getDiagMay() {
		return diagMay;
	}
	public void setDiagMay(double diagMay) {
		this.diagMay = diagMay;
	}
	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", lado=" + lado + ", diagMen=" + diagMen + ", diagMay=" + diagMay + "]";
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (getDiagMay()*getDiagMen())/2;
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 4*getLado();
	}
	
	
}
