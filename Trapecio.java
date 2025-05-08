
public class Trapecio implements FiguraGeometrica{
	private String nombre;
	private double l1;
	private double l2;
	private double l3;
	private double l4;
	private double bMen;
	private double bMay;
	private double h;
	public Trapecio(String nombre, double l1, double l2, double l3, double l4, double bMen, double bMay, double h) {
		super();
		this.nombre = nombre;
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
		this.bMen = bMen;
		this.bMay = bMay;
		this.h = h;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getL1() {
		return l1;
	}
	public void setL1(double l1) {
		this.l1 = l1;
	}
	public double getL2() {
		return l2;
	}
	public void setL2(double l2) {
		this.l2 = l2;
	}
	public double getL3() {
		return l3;
	}
	public void setL3(double l3) {
		this.l3 = l3;
	}
	public double getL4() {
		return l4;
	}
	public void setL4(double l4) {
		this.l4 = l4;
	}
	public double getbMen() {
		return bMen;
	}
	public void setbMen(double bMen) {
		this.bMen = bMen;
	}
	public double getbMay() {
		return bMay;
	}
	public void setbMay(double bMay) {
		this.bMay = bMay;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", l1=" + l1 + ", l2=" + l2 + ", l3=" + l3 + ", l4=" + l4 + ", bMen="
				+ bMen + ", bMay=" + bMay + ", h=" + h + "]";
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (getH()*(getbMen()+getbMay()))/2;
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return getL1()+getL2()+getL3()+getL4();
	}
	
}
